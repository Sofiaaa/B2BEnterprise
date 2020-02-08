package gr.codehub.B2BEnterprise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CorporateCustomer {
    private int code;
    private String title;
    private String city;
    private String description;
}
