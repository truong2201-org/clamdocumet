package vn.com.t3h.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
@Getter
@Setter
public class RoleEntity extends baseEntity{
    private String name;
    private String code;
    @ManyToMany(mappedBy = "roles")

    private Set<UserEntity> users = new HashSet<>();
}


