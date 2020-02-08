package gr.codehub.B2BEnterprise.controller;

import gr.codehub.B2BEnterprise.model.*;
import gr.codehub.B2BEnterprise.repository.*;
import gr.codehub.B2BEnterprise.service.EnterpriseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class Controller {
    private EnterpriseService ent;

   @GetMapping("info")
   public String getInfo(){
       return "B2BEnterprise";
   }

    @GetMapping("products")
    public Products getProducts() {
        ent = new EnterpriseService();
        try {
            Products products = ent.loadProducts("products.csv");
            return products;
        }catch(FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("customers")
    public Customers getCustomers() {
       ent = new EnterpriseService();
        try {
            Customers customers = ent.loadCustomers("products.csv");
            return customers;
        }catch(FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("product/{code}")
    public Product getProductController(@PathVariable int code){
        EnterpriseService ent = new EnterpriseService();
        try {
            Products products = ent.loadProducts("products.csv");
            products.getProduct(code);
        }catch(FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
           return null;

    }

    @GetMapping("customer/{code}")
    public CorporateCustomer getCustomerController(@PathVariable int code){
       EnterpriseService ent = new EnterpriseService();
        try {
            Customers customers = ent.loadCustomers("customers.csv");
            return customers.getCustomer(code);
        }catch(FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return null;

    }

}
