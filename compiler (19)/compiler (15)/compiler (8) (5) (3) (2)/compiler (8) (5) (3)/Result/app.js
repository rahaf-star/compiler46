// Test JS content
// Product Service
class ProductService {
		constructor() {
		    this.products = this.loadProducts();
		    this.selectedProduct = null;
		}

		addProduct(product) {
		    this.products.push(product);
		    this.saveProducts(this.products);
		    this.renderProducts();
		}

		selectProduct(product) {
		    this.selectedProduct = product;
		    this.renderSelectedProduct();
		}

		loadProducts() {
		    const data = localStorage.getItem('products');
		    return data ? JSON.parse(data) : [];
		}

		saveProducts(products) {
		    localStorage.setItem('products', JSON.stringify(products));
		}

}


// App Component
const appComponent = {
		title: '',
		showAddModal: null,
		productService: '',
		openAddModal() {
		    this.showAddModal = true;
		    this.updateView();
		},
		closeAddModal() {
		    this.showAddModal = false;
		    this.updateView();
		},
		onProductAdded(product) {
		    this.productService.addProduct(product);
		    this.closeAddModal();
		},
		selectProduct(product) {
		    this.productService.selectProduct(product);
		},
};


// Add Product Component
const addProductComponent = {
		name: '',
		image: '',
		details: '',
		addProduct() {
		    this.name = document.getElementById('product-name').value;
		    this.image = document.getElementById('product-image').value;
		    this.details = document.getElementById('product-details').value;
		    
		    if (this.name && this.image && this.details) {
		        appComponent.onProductAdded({
		            name: this.name,
		            image: this.image,
		            details: this.details
		        });
		        
		        // Clear form
		        document.getElementById('product-name').value = '';
		        document.getElementById('product-image').value = '';
		        document.getElementById('product-details').value = '';
		    }
		},
		close: {
		    emit() {
		        appComponent.closeAddModal();
		    }
		}
};


// Initialize the application
document.addEventListener('DOMContentLoaded', function() {
    appComponent.productService.renderProducts();
    console.log('Product Catalog App Loaded');
});
