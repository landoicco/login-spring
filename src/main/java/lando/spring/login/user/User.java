package lando.spring.login.user;

import lombok.Data;

@Data
public class User {

    private int id_user;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

}
