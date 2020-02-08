package gr.codehub.B2BEnterprise.repository;

import gr.codehub.B2BEnterprise.model.CorporateCustomer;
import gr.codehub.B2BEnterprise.service.EnterpriseService;
import lombok.Data;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Data
public class Customers {
    private List<CorporateCustomer> customers;

    public Customers(){
        customers = new ArrayList<>();
    }

    public void add(CorporateCustomer c){
        customers.add(c);
    }

    public List<CorporateCustomer> getCustomers(){
        return customers;
    }

    public CorporateCustomer getCustomer(int code){
            return   customers
                    .stream()
                    .filter(customer->customer.getCode()==code)
                    .findFirst()
                    .get();   //η get ή θα επιστρέψει Customer ή null
    }
}
