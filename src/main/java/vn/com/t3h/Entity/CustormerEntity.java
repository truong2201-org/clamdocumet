package vn.com.t3h.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
public class CustormerEntity  extends baseEntity{
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String bankNumber;

    private String bankName;
    public CustormerEntity(){

    }
}
