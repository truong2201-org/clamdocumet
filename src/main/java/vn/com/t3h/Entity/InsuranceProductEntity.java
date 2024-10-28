package vn.com.t3h.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "insurance_product")
@Getter
@Setter
public class InsuranceProductEntity extends baseEntity{
    private String name;
    private String description;
    private String coverage;

    public InsuranceProductEntity() {

    }
}
