package vn.com.t3h.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "claim_status")
@Getter
@Setter
public class ClaimStatusEntity extends baseEntity{
    private String code;
    private String description;
    public ClaimStatusEntity() {

    }
}
