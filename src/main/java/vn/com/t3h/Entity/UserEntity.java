
package vn.com.t3h.Entity;

import jakarta.persistence.*;
        import lombok.Getter;
import lombok.Setter;
import java.util.Set;

import java.util.HashSet;

@Entity
@Table(name="users")
@Getter
@Setter
public class UserEntity extends  baseEntity{
    private String username;
    private String password;
    private String code;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_roles",
            joinColumns=@JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private Set<RoleEntity> roles=new HashSet<>();
}