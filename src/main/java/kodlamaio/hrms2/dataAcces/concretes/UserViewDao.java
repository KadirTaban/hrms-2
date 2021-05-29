package kodlamaio.hrms2.dataAcces.concretes;

import kodlamaio.hrms2.entities.concretes.User;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Optional;

@Getter
public class UserViewDao implements Serializable {
    private static final long serialVersionUID = 1l;

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String nationalIdentity;
    private final String eMail;
    private final String password;


    public UserViewDao(int id, String firstName, String lastName, String nationalIdentity,String eMail,String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
        this.eMail=eMail;
        this.password=password;
    }

    public static UserViewDao of(User user) {return new UserViewDao(user.getId(),user.getFirstName(),user.getLastName(),user.getNationalIdentity(),user.getEMail(), user.getPassword());
    }

}

