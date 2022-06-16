package eapli.base.customer.domain.model;

import java.util.Date;

public class CustomerDTO {

    public long id;
    public String name;
    public String VATiD;
    public Date birthDate;
    public String phoneNumber;
    public String email;
    public String address;
    public String gender;

    public CustomerDTO(long id, String name, String VATiD, Date birthDate, String phoneNumber,
                       String email, String address, String gender) {
        this.id = id;
        this.name = name;
        this.VATiD = VATiD;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }
}
