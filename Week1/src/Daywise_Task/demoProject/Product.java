package demoProject;

import java.util.ArrayList;
import java.util.List;

class Product {
	Integer id;
    String name;
    Integer qty;
    Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(Integer id, String name, Integer qty, Double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
    }
}

class ProductService {

    // List to store all product objects
    private List<Product> productList = new ArrayList<>();

    // Method to get price by product ID
    public Double getPriceById(Integer id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product.getPrice();
            }
        }
        return null;  
    }

    public Product getProductById(Integer id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; 
    }

    public List<Product> listProducts() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product added successfully");
    }
    public void removeProduct(int id) {
        Product remProduct = null;
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                remProduct = product;
                break;
            }
        }
        
        if (remProduct != null) {
            productList.remove(remProduct);
            System.out.println("Product removed successfully");
        } else {
            System.out.println("Product not found");
        }
    }
    public void updateProduct(int id, String newName, Double newPrice) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                product.setName(newName); 
                product.setPrice(newPrice);
                System.out.println("Product updated successfully");
                return; 
            }
        }
        System.out.println("Product not found");
    }
}
