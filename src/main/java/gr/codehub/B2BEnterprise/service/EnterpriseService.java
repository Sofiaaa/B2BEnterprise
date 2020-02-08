package gr.codehub.B2BEnterprise.service;

import gr.codehub.B2BEnterprise.model.CorporateCustomer;
import gr.codehub.B2BEnterprise.model.Product;
import gr.codehub.B2BEnterprise.repository.Customers;
import gr.codehub.B2BEnterprise.repository.Products;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterpriseService{

    public Customers loadCustomers(String filename) throws FileNotFoundException {
        Customers customers = new Customers();
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] words = line.split(",");
            CorporateCustomer c = new CorporateCustomer(Integer.parseInt(words[0]),words[1],words[2],words[3]);
            customers.add(c);
        }
        return customers;
    }

    public Products loadProducts(String filename) throws FileNotFoundException{
        Products products = new Products();
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] words = line.split(",");
            Product p = new Product(Integer.parseInt(words[0]),words[1],Double.parseDouble(words[2]),Integer.parseInt(words[3]));
            products.add(p);
        }
        return products;
    }

}
