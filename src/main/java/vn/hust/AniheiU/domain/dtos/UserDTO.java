package vn.hust.AniheiU.domain.dtos;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    Set<RoleDTO> roles;
}
