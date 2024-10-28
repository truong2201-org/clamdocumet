package vn.com.t3h.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Locale;

@Entity
@Table(name="claim")
@Getter
@Setter
public class ClaimEntity extends baseEntity{
    private String code;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustormerEntity custormerEntity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private InsuranceProductEntity InsuranceProductEntity;

    @ManyToOne
    @JoinColumn(name="status_id")
    private ClaimStatusEntity claimStatusEntity;

    private LocalDate claimDate;
    private String description;
    private Double amount;
    public ClaimEntity() {

    }
}
