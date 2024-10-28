package vn.com.t3h.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String code;
    private String email;
    private String phone;
    private String address;
    private String firstName;
    private String lastName;

    private LocalDate createdDate;
    private String createdBy;
    private LocalDate lastModifiedDate;
    private String lastModifiedBy;
    private Boolean deleted;
}
fdfdsfdfdfdfdfsdsfsfsfsfsfsfs