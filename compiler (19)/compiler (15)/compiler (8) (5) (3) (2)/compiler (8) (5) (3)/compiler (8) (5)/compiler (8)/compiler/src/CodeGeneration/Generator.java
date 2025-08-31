package CodeGeneration;

import AST.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator {
    int counter = 0;
    String rootName = "";
    boolean firstComponent = true;
    boolean isVisitUseState = true;
    boolean noRepeatDot = false;
    boolean hasMap = false;
    boolean hasSquareBracket = false;
    String rootComponent = "";
    boolean onlyOne = true;
    boolean standard = false;
    int sizeOfObject = 0;
    int counterForObject = 0;
    boolean haveProps = false;
    Map<String, String> map = new HashMap<>();
    String Space = "\t\t";

    public void generate(Program program) {

        String filePath = "Result/index.html";
        String fileJava = "Result/app.js";
        String fileCss="Result/styles.css";


        try {
            // Create the directories if they don't exist
            File file = new File(filePath);
            File file1 = new File(fileJava);
            File file2=new File(fileCss);
            File parentDir = file.getParentFile();
            File parentDir1 = file1.getParentFile();
            File parentDir2 = file2.getParentFile();


            if (!parentDir.exists()) {
                boolean created = parentDir.mkdirs();
                if (created) {
                    System.out.println("Created directories: " + parentDir.getAbsolutePath());
                } else  {
                    System.out.println("Failed to create directories: " + parentDir.getAbsolutePath());
                }


            }

            if (!parentDir1.exists()) {
                boolean created = parentDir1.mkdirs();
                if (created) {
                    System.out.println("Created directories: " + parentDir1.getAbsolutePath());
                } else {
                    System.out.println("Failed to create directories: " + parentDir1.getAbsolutePath());
                }
            }
            if (!parentDir2.exists()) {
                boolean created = parentDir2.mkdirs();
                if (created) {
                    System.out.println("Created directories: " + parentDir2.getAbsolutePath());
                } else {
                    System.out.println("Failed to create directories: " + parentDir2.getAbsolutePath());
                }
            }
            StringBuilder cssContent = new StringBuilder();
            for (Component_Declaration component : program.getComponent_declarationList()) {
                Component_Metadata metadata = component.getMetadata();
                if (metadata.getProperties() != null) {
                    for (Metadata_Property property : metadata.getProperties()) {
                        if (property instanceof Styles_Property) {
                            Styles_Property stylesProp = (Styles_Property) property;
                            if (stylesProp.getStyle() != null) {
                                cssContent.append(extractCssContent(stylesProp.getStyle()));
                            }
                            if (stylesProp.getStyleArray() != null) {
                                cssContent.append(extractCssFromArray(stylesProp.getStyleArray()));
                            }
                        }
                    }
                }
            }

            // Write CSS file
            FileWriter cssWriter = new FileWriter(file2);
            cssWriter.write(cssContent.toString());
            cssWriter.close();
            System.out.println("CSS file created successfully at: " + file2.getAbsolutePath());


            FileWriter fw = new FileWriter(filePath);
            generate("<!DOCTYPE html>", fw);
            generate("<html>", fw);
            generate("<head>", fw);
            generate("<meta charset=\"UTF-8\">", fw);

            generate("<title>Product Catalog</title>", fw);
            generate("<link rel=\"stylesheet\" href=\"styles.css\">", fw);
            generate("</head>", fw);
            generate("<body>", fw);
            generate("<div id=\"app\">", fw);
            generate("    <div class=\"container\">", fw);
            generate("        <!-- شريط التنقل -->", fw);
            generate("        <div class=\"navbar\">", fw);
            generate("            <ul class=\"nav-links\">", fw);
            generate("                <li><a href=\"#\" class=\"active\" onclick=\"showPage('display')\">عرض المنتجات</a></li>", fw);
            generate("                <li><a href=\"#\" onclick=\"showPage('add')\">إضافة منتج</a></li>", fw);
            generate("            </ul>", fw);
            generate("        </div>", fw);
            generate("", fw);
            generate("        <!-- مؤشر الصفحة الحالية -->", fw);
            generate("        <div class=\"current-page\" id=\"current-page\">عرض المنتجات</div>", fw);
            generate("        <div class=\"modal\">", fw); // ADD THIS

// Components
            for (Component_Declaration component : program.getComponent_declarationList()) {
                if (component.getMetadata().getProperties() != null && isVisitUseState) {
                    generate(component, Space, fw);
                }
            }

// ADD THESE CLOSING DIVS:
            generate("        </div>", fw); // closes <div class="modal">
            generate("    </div>", fw); // closes <div class="container">
            generate("</div>", fw); // closes <div id="app">

// رابط JS
            generate("<script src=\"app.js\"></script>", fw);
            generate("</body>", fw);
            generate("</html>", fw);
            fw.flush();
            fw.close();

// JS
            FileWriter js = new FileWriter(fileJava);
            generateJs("// دالة لإظهار وإخفاء الصفحات", js);
            generateJs("function showPage(page) {", js);
            generateJs("    const navLinks = document.querySelectorAll('.nav-links a');", js);
            generateJs("    const currentPageElement = document.getElementById('current-page');", js);
            generateJs("    ", js);
            generateJs("    // تحديث حالة الروابط النشطة", js);
            generateJs("    navLinks.forEach(link => {", js);
            generateJs("        if (link.textContent === (page === 'display' ? 'عرض المنتجات' : 'إضافة منتج')) {", js);
            generateJs("            link.classList.add('active');", js);
            generateJs("        } else {", js);
            generateJs("            link.classList.remove('active');", js);
            generateJs("        }", js);
            generateJs("    });", js);
            generateJs("    ", js);
            generateJs("    // تحديث عنوان الصفحة الحالية", js);
            generateJs("    if (page === 'display') {", js);
            generateJs("        currentPageElement.textContent = 'عرض المنتجات';", js);
            generateJs("        // إظهار قائمة المنتجات وإخفاء نموذج الإضافة", js);
            generateJs("        document.querySelector('.product-list').style.display = 'grid';", js);
            generateJs("        document.querySelector('.modal .container .add-form').style.display = 'none';", js);
            generateJs("        document.querySelector('.add-button').style.display = 'block';", js);
            generateJs("        document.querySelector('.modal > .add-form').style.display = 'none';", js); // هذا هو النموذج الصحيح
            generateJs("    } else {", js);
            generateJs("        currentPageElement.textContent = 'إضافة منتج';", js);
            generateJs("        // إخفاء قائمة المنتجات وإظهار نموذج الإضافة", js);
            generateJs("        document.querySelector('.product-list').style.display = 'none';", js);
            generateJs("        document.querySelector('.modal .container .add-form').style.display = 'none';", js);
            generateJs("        document.querySelector('.add-button').style.display = 'none';", js);
            generateJs("        document.querySelector('.modal > .add-form').style.display = 'block';", js); // هذا هو النموذج الصحيح
            generateJs("    }", js);
            generateJs("}", js);
            generateJs("", js);

            List<Injectable_Declaration> injectableList = program.getInjectable_declarationList();
            for (int i = 0; i < injectableList.size(); i++) {
                Class_Declaration cls = injectableList.get(i).getClassDeclaration();
                if (cls != null && cls.getClassBody().getProperties() != null) {
                    generate(cls, Space, js);
                }
            }
            // Handle Component declarations (object literals)
            List<Component_Declaration> componentList = program.getComponent_declarationList();
            for (int i = 0; i < componentList.size(); i++) {
                Class_Declaration cls = componentList.get(i).getClassDecl();
                if (cls != null && cls.getClassBody().getProperties() != null) {
                    generateObjectLiteral(cls, Space, js); // Generate as object literal
                }
            }
            generateJs("document.addEventListener('DOMContentLoaded', function() {", js);
            generateJs("    appComponent.productService.renderProducts();", js);
            generateJs("    console.log('Product Catalog App Loaded');", js);
            generateJs("});", js);
            js.flush();
            js.close();

            System.out.println("File created successfully at: " + file.getAbsolutePath());
            System.out.println("File created successfully at: " + file1.getAbsolutePath());
            System.out.println("File created successfully at: " + file2.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void generate(String s, FileWriter fw) {
        try {
            System.out.print("\n");
            fw.append(s);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void generateJs(String s, FileWriter js) {
        try {

            js.append(s).append("\n");

        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }


    private String convertAngularToVanilla(String angularTemplate) {

        String vanilla = angularTemplate

                .replaceAll("\\[src\\]=\"([^\"]*)\"", "src=\"\" data-bind=\"appComponent.$1\"")

                .replaceAll("alt=\"\\{\\{\\s*([^}]*)\\s*\\}\\}\"", "alt=\"\" data-bind=\"appComponent.$1\"")


                .replaceAll("\\{\\{\\s*([^}]*)\\s*\\}\\}", "<span data-bind=\"appComponent.$1\"></span>")

                .replaceAll("\\*ngFor=\"let (\\w+) of ([^\"]*)\"", "data-for=\"appComponent.$2\" data-item=\"$1\"")


                .replaceAll("\\(click\\)=\"([^(]*)\\(([^)]*)\\)\"", "onclick=\"appComponent.$1($2)\"")
                .replaceAll("\\(click\\)=\"([^(]*)\\(\\)\"", "onclick=\"appComponent.$1()\"")


                .replaceAll("\\s*\\|\\s*async", "")

                .replaceAll("\\$", "")

                .replaceAll("as selectedProduct", "")


                .replaceAll("\\*ngIf=\"([^\"]*)\"", "data-if=\"appComponent.$1\" style=\"display: none;\"")

                .replaceAll("\\[src\\]=\"([^\"]*)\"", "data-bind-src=\"appComponent.$1\"")

                .replaceAll("alt=\"\\{\\{\\s*([^}]*)\\s*\\}\\}\"", "data-bind-alt=\"appComponent.$1\"")

                .replaceAll("title=\"\\{\\{\\s*([^}]*)\\s*\\}\\}\"", "data-bind-title=\"appComponent.$1\"")

                .replaceAll("\\{\\{\\s*([^}]*)\\s*\\}\\}", "<span data-bind=\"appComponent.$1\"></span>")


                .replaceAll("data-bind=\"appComponent\\.(\\w+)\\s\"", "data-bind=\"appComponent.$1\"")
                .replaceAll("data-bind-src=\"appComponent\\.(\\w+)\\s\"", "data-bind-src=\"appComponent.$1\"")
                .replaceAll("data-bind-alt=\"appComponent\\.(\\w+)\\s\"", "data-bind-alt=\"appComponent.$1\"")

                .replaceAll("appComponent\\.\\(([^)]*)\\)", "appComponent.$1")


                .replaceAll("(<img[^>]*)([^/])>", "$1$2 />")
                .replaceAll("<add-product[^>]*>", "<div class=\"add-form\">")
                .replaceAll("</add-product>", "</div>")

                .replaceAll("\\(productAdded\\)=\"([^\"]*)\"", "onsubmit=\"$1; return false;\"")
                .replaceAll("\\(close\\)=\"([^\"]*)\"", "onclick=\"$1\"")

                .replaceAll("\\[\\(ngModel\\)\\]=\"([^\"]*)\"", "id=\"$1\"")

                .replaceAll(" name=\"[^\"]*\"", "")

                .replaceAll("\\(ngSubmit\\)=\"([^\"]*)\"", "onsubmit=\"$1; return false;\"")

  .replaceAll(
                "<img src=\"\" data-bind=\"appComponent\\.selectedProduct\\.image\" alt=\"\" data-bind=\"appComponent\\.selectedProduct\\.name\\s*\" class=\"product-image\"\\s*/>",
                "<img src=\"\" alt=\"\" class=\"product-image\" id=\"selected-product-image\">"
        )
                .replaceAll(
                        "<img src=\"\" data-bind=\"appComponent\\.product\\.image\" alt=\"\" data-bind=\"appComponent\\.product\\.name\\s*\" class=\"product-image\"\\s*/>",
                        "<img src=\"\" alt=\"\" class=\"product-image\">"
                )

                .replaceAll("data-if=\"appComponent\\.selectedProduct\\s*\"", "data-if=\"appComponent.selectedProduct\"")
                .replaceAll("data-bind=\"appComponent\\.selectedProduct\\.name\\s*\"", "data-bind=\"appComponent.selectedProduct?.name\"")
                .replaceAll("data-bind=\"appComponent\\.selectedProduct\\.details\\s*\"", "data-bind=\"appComponent.selectedProduct?.details\"")
                .replaceAll(" data-for=\"appComponent\\.products\" data-item=\"product\"", "")
                .replaceAll(
                        "<div class=\"product-list\">\\s*<div[^>]*>[\\s\\S]*?</div>\\s*</div>",
                        "<div class=\"product-list\" id=\"product-list\">\n                <!-- Products will be dynamically added here -->\n            </div>"
                )
                .replaceAll(
                        "onclick=\"appComponent\\.close\\.emit\\(\\)\"",
                        "onclick=\"addProductComponent.close.emit()\""
                )
                .replaceAll(
                        "onsubmit=\"addProduct\\(\\); return false;\"",
                        "onsubmit=\"addProductComponent.addProduct(); return false;\""
                ) .replaceAll("id=\"name\"", "id=\"product-name\"")
                .replaceAll("id=\"image\"", "id=\"product-image\"")
                .replaceAll("id=\"details\"", "id=\"product-details\"")

                .replaceAll(
                        "</form>\\s*</div>\\s*</div>\\s*<script",
                        "                    </form>\n                </div>\n            </div>\n        </div>\n    </div>\n    <script"
                );
        return vanilla;
    }


    private void generate(Component_Declaration component, String indent, FileWriter fw) {
        Component_Metadata metadata = component.getMetadata();
        if (metadata.getProperties() != null) {
            for (Metadata_Property property : metadata.getProperties()) {
                if (property instanceof Template_Property) {
                    String templateContent = ((Template_Property) property).getTemplateContent();
                    String vanillaHtml = convertAngularToVanilla(templateContent);
                    generate(vanillaHtml, fw);
                }

                }
            }
        }

    private String extractCssContent(Object style) {
        if (style instanceof String) {
            return (String) style;
        } else if (style instanceof PrimaryLiteral) {
            return ((PrimaryLiteral) style).getValue().replace("`", "").trim();
        }
        return "";
    }

    private String extractCssFromArray(Array styleArray) {
        StringBuilder cssBuilder = new StringBuilder();

        cssBuilder.append(".container {flex-direction: row; }\n");
        if (styleArray.getArrayElements() != null) {
            for (ArrayElement element : styleArray.getArrayElements()) {
                if (element.getExpressions() instanceof PostFix_Expression) {
                    PostFix_Expression postFix = (PostFix_Expression) element.getExpressions();
                    if (postFix.getPrimary() instanceof PrimaryLiteral) {
                        String css = ((PrimaryLiteral) postFix.getPrimary()).getValue();
                        cssBuilder.append(css.replace("`", "").trim()).append("\n");
                    }
                }
            }
        }

        return cssBuilder.toString();
    }






    private void generate(Class_Declaration cls, String space, FileWriter js) throws IOException {
        if (cls == null) return;

        // Check if this should be generated as an object literal (AppComponent) or class (ProductService)
        boolean isObjectLiteral = "AppComponent".equals(cls.getIdentifier());

        if (isObjectLiteral) {
            generateObjectLiteral(cls, space, js);
        } else {
            generateClass(cls, space, js);
        }
    }

    private void generateClass(Class_Declaration cls, String space, FileWriter js) throws IOException {
        if (cls == null) return;

        generateJs(space + "class " + cls.getIdentifier() + " {", js);

        if (cls.getClassBody() != null) {
            // Generate constructor
            generateJs(space + "    constructor() {", js);
            generateJs(space + "        this.products = this.loadProducts();", js);
            generateJs(space + "        this.selectedProduct = null;", js);
            generateJs(space + "    }", js);
            generateJs("", js);

            // Generate AST-based methods with className
            generateClassBody(cls.getClassBody(), space + "    ", js, cls.getIdentifier());

            // Generate static render methods only for ProductService
            if ("ProductService".equals(cls.getIdentifier())) {
                generateJs(space + "    renderProducts() {", js);
                generateJs(space + "        const productList = document.getElementById('product-list');", js);
                generateJs(space + "        productList.innerHTML = '';", js);
                generateJs(space + "        ", js);
                generateJs(space + "        this.products.forEach(product => {", js);
                generateJs(space + "            const productItem = document.createElement('div');", js);
                generateJs(space + "            productItem.className = 'product-item';", js);
                generateJs(space + "            productItem.innerHTML = `", js);
                generateJs(space + "                <h3>${product.name}</h3>", js);
                generateJs(space + "                <img src=\"${product.image}\" alt=\"${product.name}\" class=\"product-image\">", js);
                generateJs(space + "            `;", js);
                generateJs(space + "            productItem.onclick = () => appComponent.selectProduct(product);", js);
                generateJs(space + "            productList.appendChild(productItem);", js);
                generateJs(space + "        });", js);
                generateJs(space + "    }", js);
                generateJs("", js);

                generateJs(space + "    renderSelectedProduct() {", js);
                generateJs(space + "        const detailsDiv = document.querySelector('.product-details');", js);
                generateJs(space + "        const image = document.getElementById('selected-product-image');", js);
                generateJs(space + "        ", js);
                generateJs(space + "        if (this.selectedProduct) {", js);
                generateJs(space + "            detailsDiv.style.display = 'block';", js);
                generateJs(space + "            document.querySelector('[data-bind=\"appComponent.selectedProduct?.name\"]').textContent = this.selectedProduct.name;", js);
                generateJs(space + "            image.src = this.selectedProduct.image;", js);
                generateJs(space + "            image.alt = this.selectedProduct.name;", js);
                generateJs(space + "            document.querySelector('[data-bind=\"appComponent.selectedProduct?.details\"]').textContent = this.selectedProduct.details;", js);
                generateJs(space + "        } else {", js);
                generateJs(space + "            detailsDiv.style.display = 'none';", js);
                generateJs(space + "        }", js);
                generateJs(space + "    }", js);
            }
        }

        generateJs(space + "}", js);
    }

    private void generateObjectLiteral(Class_Declaration cls, String space, FileWriter js) throws IOException {
        String className = cls.getIdentifier();
        String objectName = Character.toLowerCase(className.charAt(0)) + className.substring(1);

        generateJs(space + "const " + objectName + " = {", js);

        if (cls.getClassBody() != null) {
            if ("AppComponent".equals(className)) {  // Use className here for comparison
                generateAppComponentBody(cls.getClassBody(), space + "    ", js);


                // Add updateView method for appComponent
                generateJs(space + "    updateView() {", js);
                generateJs(space + "        // Show/hide modals based on state", js);
                generateJs(space + "        const backdrop = document.querySelector('.modal-backdrop');", js);
                generateJs(space + "        const modal = document.querySelector('.modal');", js);
                generateJs(space + "        ", js);
                generateJs(space + "        backdrop.style.display = this.showAddModal ? 'block' : 'none';", js);
                generateJs(space + "        modal.style.display = this.showAddModal ? 'block' : 'none';", js);
                generateJs(space + "    }", js);
            }
            else if ("addProductComponent".equals(objectName)) {
                generateAddProductComponentBody(cls.getClassBody(), space + "    ", js);

                // Add addProduct method for addProductComponent
                generateJs(space + "    addProduct() {", js);
                generateJs(space + "        this.name = document.getElementById('product-name').value;", js);
                generateJs(space + "        this.image = document.getElementById('product-image').value;", js);
                generateJs(space + "        this.details = document.getElementById('product-details').value;", js);
                generateJs(space + "        ", js);
                generateJs(space + "        if (this.name && this.image && this.details) {", js);
                generateJs(space + "            appComponent.onProductAdded({", js);
                generateJs(space + "                name: this.name,", js);
                generateJs(space + "                image: this.image,", js);
                generateJs(space + "                details: this.details", js);
                generateJs(space + "            });", js);
                generateJs(space + "            ", js);
                generateJs(space + "            // Clear form", js);
                generateJs(space + "            document.getElementById('product-name').value = '';", js);
                generateJs(space + "            document.getElementById('product-image').value = '';", js);
                generateJs(space + "            document.getElementById('product-details').value = '';", js);
                generateJs(space + "        }", js);
                generateJs(space + "    },", js);

                // Add close object for addProductComponent
                generateJs(space + "    close: {", js);
                generateJs(space + "        emit() {", js);
                generateJs(space + "            appComponent.closeAddModal();", js);
                generateJs(space + "        }", js);
                generateJs(space + "    }", js);
            }

        }

        generateJs(space + "};", js);




    }

    private void generateAppComponentBody(Class_Body body, String space, FileWriter js) throws IOException {
        if (body == null) return;

        // Generate properties
        if (body.getProperties() != null) {
            for (PropertyDeclaration prop : body.getProperties()) {
                generatePropertyForComponent(prop, space, js);
            }
        }

        // Generate methods
        if (body.getMethods() != null) {
            for (MethodDeclaration method : body.getMethods()) {
                generateObjectMethod(method, space, js);
            }
        }
    }

    private void generateAddProductComponentBody(Class_Body body, String space, FileWriter js) throws IOException {
        if (body == null) return;


        if (body.getProperties() != null) {
            for (PropertyDeclaration prop : body.getProperties()) {
                // FIX: Skip EventEmitter properties (they're handled separately)
                if (!"productAdded".equals(prop.getIdentifier())) {
                    generateAddProductProperty(prop, space, js);
                }
            }
        }
    }

    private void generateAddProductProperty(PropertyDeclaration prop, String space, FileWriter js) throws IOException {
        if (prop == null) return;
        if ("close".equals(prop.getIdentifier()) || "productAdded".equals(prop.getIdentifier())) {
            return;
        }
        String line = space + prop.getIdentifier() + ": ";

        if (prop.getExpression() != null) {
            line += generateExpressionForAddProduct(prop.getExpression(), prop.getIdentifier());
        } else {
            // Default values for form fields
            if ("name".equals(prop.getIdentifier()) || "image".equals(prop.getIdentifier()) || "details".equals(prop.getIdentifier())) {
                line += "''";
            }
        }

        generateJs(line + ",", js);
    }

    private String generateExpressionForAddProduct(Expression expr, String propertyName) {
        // FIX: This method is causing duplicate close property generation
        // Since we're manually generating the close property above, we can simplify this
        if (expr instanceof PostFix_Expression) {
            PostFix_Expression postFix = (PostFix_Expression) expr;

            // Only handle basic expressions, skip EventEmitter handling
            if (postFix.getPrimary() instanceof PrimaryLiteral) {
                PrimaryLiteral literal = (PrimaryLiteral) postFix.getPrimary();
                return literal.getValue();
            }
            return generatePostFixExpression(postFix);
        }
        return "''";
    }

    private String generateCloseEmitMethod() {
        return "emit() { appComponent.closeAddModal(); }";
    }
    private void generateObjectBody(Class_Body body, String space, FileWriter js) throws IOException {
        if (body == null) return;

        // Generate properties
        if (body.getProperties() != null) {
            for (PropertyDeclaration prop : body.getProperties()) {
                generatePropertyForComponent(prop, space, js);
            }
        }

        // Generate methods
        if (body.getMethods() != null) {
            for (MethodDeclaration method : body.getMethods()) {
                generateObjectMethod(method, space, js);
            }
        }
    }

    private void generatePropertyForComponent(PropertyDeclaration prop, String space, FileWriter js) throws IOException {
        if (prop == null) return;

        String line = space + prop.getIdentifier() + ": ";

        if (prop.getExpression() != null) {
            line += generateExpressionForComponent(prop.getExpression());
        } else {
            // Handle default values based on property name
            if ("showAddModal".equals(prop.getIdentifier())) {
                line += "false";
            } else if ("productService".equals(prop.getIdentifier())) {
                line += "new ProductService()";
            } else if ("title".equals(prop.getIdentifier())) {
                line += "'Product Catalog'";
            }
        }

        generateJs(line + ",", js);
    }

    private String generateExpressionForComponent(Expression expr) {
        if (expr instanceof PostFix_Expression) {
            PostFix_Expression postFix = (PostFix_Expression) expr;

            // Handle inject() call - replace with new ProductService()
            if (postFix.getPrimary() instanceof PrimaryIdentifier) {
                PrimaryIdentifier primary = (PrimaryIdentifier) postFix.getPrimary();
                if ("inject".equals(primary.getIdentifier())) {
                    return "new ProductService()";
                }
            }

            // Handle string literals
            if (postFix.getPrimary() instanceof PrimaryLiteral) {
                PrimaryLiteral literal = (PrimaryLiteral) postFix.getPrimary();
                return literal.getValue();
            }

            return generatePostFixExpression(postFix);
        }
        return "";
    }



    private void generateProperty(PropertyDeclaration prop, String space, FileWriter js) throws IOException {
        if (prop == null) return;

        String line = space + prop.getIdentifier() + ": ";

        if (prop.getExpression() != null) {
            line += generateExpressionForObject(prop.getExpression());
        } else {
            // Handle default values based on property name
            if ("showAddModal".equals(prop.getIdentifier())) {
                line += "false";
            } else if ("productService".equals(prop.getIdentifier())) {
                line += "new ProductService()";
            }
        }

        generateJs(line + ",", js);
    }

    private void generateObjectMethod(MethodDeclaration method, String space, FileWriter js) throws IOException {
        if (method == null) return;

        String methodName = method.getMethodName();
        String params = generateParameters(method.getParameters());

        generateJs(space + methodName + "(" + params + ") {", js);
        generateObjectMethodBody(method.getMethodBody(), space + "    ", methodName, js);
        generateJs(space + "},", js);
    }

    private void generateObjectMethodBody(MethodBody body, String space, String methodName, FileWriter js) throws IOException {
        if (body == null) return;

        // Handle expressions
        if (body.getExpression() != null) {
            for (Expression expr : body.getExpression()) {
                generateExpressionStatementForObject(expr, space, methodName, js);
            }
        }
        if ("openAddModal".equals(methodName) || "closeAddModal".equals(methodName)) {
            generateJs(space + "this.updateView();", js);
        }
    }

    private void generateExpressionStatementForObject(Expression expr, String space, String methodName, FileWriter js) throws IOException {
        if (expr == null) return;

        String line = space;

        if (expr instanceof PostFix_Expression) {
            line += generatePostFixExpression((PostFix_Expression) expr);
        } else if (expr instanceof Assignment) {
            line += generateAssignmentForObject((Assignment) expr, methodName);
        }

        generateJs(line + ";", js);
    }

    private String generateAssignmentForObject(Assignment assignment, String methodName) {
        StringBuilder result = new StringBuilder();

        // Handle left side (this.showAddModal = ...)
        if (assignment.getPostFixExpression() instanceof PostFix_Expression) {
            PostFix_Expression leftSide = (PostFix_Expression) assignment.getPostFixExpression();
            result.append(generatePostFixExpression(leftSide));
        }

        result.append(" = ");

        // Handle right side (true/false)
        if (assignment.getExpression() == null) {
            // Determine value based on method name context
            if ("openAddModal".equals(methodName)) {
                result.append("true");
            } else if ("closeAddModal".equals(methodName)) {
                result.append("false");
            }
        } else {
            result.append(generateExpression(assignment.getExpression()));
        }

        return result.toString();
    }

    private String generateExpressionForObject(Expression expr) {
        if (expr instanceof PostFix_Expression) {
            PostFix_Expression postFix = (PostFix_Expression) expr;

            // Handle inject() call - replace with new ProductService()
            if (postFix.getPrimary() instanceof PrimaryIdentifier) {
                PrimaryIdentifier primary = (PrimaryIdentifier) postFix.getPrimary();
                if ("inject".equals(primary.getIdentifier())) {
                    return "new ProductService()";
                }
            }

            // Handle string literals
            if (postFix.getPrimary() instanceof PrimaryLiteral) {
                PrimaryLiteral literal = (PrimaryLiteral) postFix.getPrimary();
                return literal.getValue();
            }

            return generatePostFixExpression(postFix);
        }
        return "";
    }

    // Keep your existing methods but add this new one for class body generation
    private void generateClassBody(Class_Body body, String space, FileWriter js, String className) throws IOException {
        if (body == null) return;

        // Generate methods
        if (body.getMethods() != null) {
            for (MethodDeclaration method : body.getMethods()) {
                generate(method, space, js, className); // Pass className
            }
        }
    }



    private void generate(MethodDeclaration method, String space, FileWriter js, String className) throws IOException {
        if (method == null) return;

        String methodName = method.getMethodName();
        String params = generateParameters(method.getParameters());

        generateJs(space + methodName + "(" + params + ") {", js);

        // OVERRIDE SPECIFIC METHODS FOR ProductService
        if ("ProductService".equals(className)) {
            if ("addProduct".equals(methodName)) {
                generateJs(space + "    this.products.push(" + params + ");", js);
                generateJs(space + "    this.saveProducts(this.products);", js);
                generateJs(space + "    this.renderProducts();", js);
            }
            else if ("selectProduct".equals(methodName)) {
                generateJs(space + "    this.selectedProduct = " + params + ";", js);
                generateJs(space + "    this.renderSelectedProduct();", js);
            }
            else if ("loadProducts".equals(methodName)) {
                generateJs(space + "    const data = localStorage.getItem('products');", js);
                generateJs(space + "    return data ? JSON.parse(data) : [];", js);
            }
            else {
                // Generate original method body for other methods
                generate(method.getMethodBody(), space + "    ", js, methodName);
            }
        } else {
            // Generate original method body for other classes
            generate(method.getMethodBody(), space + "    ", js, methodName);
        }

        generateJs(space + "}", js);
    }

    private void generate(MethodBody body, String space, FileWriter js, String methodName) throws IOException {
        if (body == null) return;

        // Handle variable declarations
        if (body.getVariableDeclaration() != null) {
            for (VariableDeclaration varDecl : body.getVariableDeclaration()) {
                generate(varDecl, space, js);
            }
        }

        // Handle expressions
        if (body.getExpression() != null) {
            for (Expression expr : body.getExpression()) {
                generate(expr, space, js);
            }
        }

        // Handle return statements - pass method name
        if (body.getReturnStatement() != null) {
            for (Return_statement returnStmt : body.getReturnStatement()) {
                generate(returnStmt, space, js, methodName);
            }
        }
    }

    private void generate(VariableDeclaration varDecl, String space, FileWriter js) throws IOException {
        if (varDecl == null) return;

        DeclarationKeyword declKeywordObj = varDecl.getDeclarationKeyword();
        if (declKeywordObj == null) return;

        String declKeyword = declKeywordObj.getKeyword(); // Use getKeyword() instead of toString()
        if (declKeyword == null || declKeyword.equals("null")) return;

        String line = space + "const " + declKeyword + " = ";

        Expression expr = varDecl.getExpression();
        if (expr != null) {
            line += generateExpression(expr);
        }

        generateJs(line + ";", js);
    }

    private void generate(Expression expr, String space, FileWriter js) throws IOException {
        if (expr == null) return;

        String line = space + generateExpression(expr);
        generateJs(line + ";", js);
    }

    private void generate(Return_statement returnStmt, String space, FileWriter js, String methodName) throws IOException {
        if (returnStmt == null) return;

        Expression expr = returnStmt.getExpression();
        if (expr != null) {
            String line = space + "return " + generateExpression(expr);
            generateJs(line + ";", js);
        } else {
            // Use the passed method name
            if ("loadProducts".equals(methodName)) {
                generateJs(space + "const data = localStorage.getItem('products');", js);
                generateJs(space + "return data ? JSON.parse(data) : [];", js);
            } else {
                generateJs(space + "return;", js);
            }
        }
    }
    private String generateParameters(ParameterList parameters) {
        if (parameters == null || parameters.getParameter() == null) return "";

        StringBuilder params = new StringBuilder();
        for (Parameter param : parameters.getParameter()) {
            if (params.length() > 0) params.append(", ");
            params.append(param.getIdentifier());
        }
        return params.toString();
    }

    private String generateExpression(Expression expr) {
        if (expr instanceof PostFix_Expression) {
            return generatePostFixExpression((PostFix_Expression) expr);
        }
        // Handle other expression types as needed
        return "";
    }

    private String generatePostFixExpression(PostFix_Expression expr) {
        StringBuilder result = new StringBuilder();

        // Handle primary expression
        if (expr.getPrimary() instanceof PrimaryThis) {
            result.append("this");
        } else if (expr.getPrimary() instanceof PrimaryIdentifier) {
            result.append(((PrimaryIdentifier) expr.getPrimary()).getIdentifier());
        } else if (expr.getPrimary() instanceof PrimaryLiteral) {
            PrimaryLiteral literal = (PrimaryLiteral) expr.getPrimary();
            result.append(literal.getValue());
        }

        // Handle postfix operations (member access, method calls, etc.)
        if (expr.getPostFixOpers() != null) {
            for (Object oper : expr.getPostFixOpers()) {
                if (oper instanceof MemberAccess) {
                    MemberAccess member = (MemberAccess) oper;
                    result.append(".").append(member.getMemberName());

                    if (member.getArguments() != null) {
                        result.append("(");
                        if (member.getArguments() instanceof List) {
                            List<?> args = (List<?>) member.getArguments();
                            for (int i = 0; i < args.size(); i++) {
                                if (i > 0) result.append(", ");
                                result.append(generateExpression((Expression) args.get(i)));
                            }
                        }
                        result.append(")");
                    }
                }
            }
        }

        return result.toString();
    }
}