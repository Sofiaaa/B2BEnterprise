package gr.codehub.B2BEnterprise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int code;
    private String name;
    private double price;
    private int quantity;
}
