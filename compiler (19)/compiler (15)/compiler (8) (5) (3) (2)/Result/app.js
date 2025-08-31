// Test JS content
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
		    renderProducts() {
		        const productList = document.getElementById('product-list');
		        productList.innerHTML = '';
		        
		        this.products.forEach(product => {
		            const productItem = document.createElement('div');
		            productItem.className = 'product-item';
		            productItem.innerHTML = `
		                <h3>${product.name}</h3>
		                <img src="${product.image}" alt="${product.name}" class="product-image">
		            `;
		            productItem.onclick = () => appComponent.selectProduct(product);
		            productList.appendChild(productItem);
		        });
		    }

		    renderSelectedProduct() {
		        const detailsDiv = document.querySelector('.product-details');
		        const image = document.getElementById('selected-product-image');
		        
		        if (this.selectedProduct) {
		            detailsDiv.style.display = 'block';
		            document.querySelector('[data-bind="appComponent.selectedProduct?.name"]').textContent = this.selectedProduct.name;
		            image.src = this.selectedProduct.image;
		            image.alt = this.selectedProduct.name;
		            document.querySelector('[data-bind="appComponent.selectedProduct?.details"]').textContent = this.selectedProduct.details;
		        } else {
		            detailsDiv.style.display = 'none';
		        }
		    }
		}
		const appComponent = {
		    title: 'Product Catalog',
		    showAddModal: false,
		    productService: new ProductService(),
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
		    updateView() {
		        // Show/hide modals based on state
		        const backdrop = document.querySelector('.modal-backdrop');
		        const modal = document.querySelector('.modal');
		        
		        backdrop.style.display = this.showAddModal ? 'block' : 'none';
		        modal.style.display = this.showAddModal ? 'block' : 'none';
		    }
		};
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
document.addEventListener('DOMContentLoaded', function() {
    appComponent.productService.renderProducts();
    console.log('Product Catalog App Loaded');
});
