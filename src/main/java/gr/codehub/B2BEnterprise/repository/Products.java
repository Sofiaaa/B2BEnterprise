package gr.codehub.B2BEnterprise.repository;

import gr.codehub.B2BEnterprise.model.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Products {
    private List<Product> products;

    public Products(){
        products = new ArrayList<>();
    }
    public void add(Product p){
        products.add(p);
    }
    public List<Product> getProducts(){
        return products;
    }
    public Product getProduct(int code){
        return getProducts()
                .stream()
                .filter(product->product.getCode()==code)
                .findFirst()
                .get();
    }
}
