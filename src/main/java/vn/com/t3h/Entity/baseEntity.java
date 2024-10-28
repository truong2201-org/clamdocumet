package vn.com.t3h.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@MappedSuperclass
@Data
public abstract class baseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime lastModifiedDate;
    private String lastModifiedBy;
    private Boolean deleted = false;
    @PrePersist
    protected void onCreate(){
        createdDate = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate(){lastModifiedDate = LocalDateTime.now();}


}
