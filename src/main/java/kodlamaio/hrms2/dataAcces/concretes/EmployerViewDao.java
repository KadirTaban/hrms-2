package kodlamaio.hrms2.dataAcces.concretes;

import kodlamaio.hrms2.entities.concretes.Employer;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class EmployerViewDao implements Serializable {

    private static final Integer serialVersionUID = 1;

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String provideOfPosition;
    private final String eMail;
    private final String password;

    public EmployerViewDao(int id, String firstName, String lastName, String provideOfPosition,String eMail,String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.provideOfPosition = provideOfPosition;
        this.eMail=eMail;
        this.password=password;
    }
    public static EmployerViewDao of(Employer employer){return new EmployerViewDao(employer.getId(),employer.getFirstName(),employer.getLastName(),employer.getProvideOfPosition(),employer.getEMail(),employer.getPassword());
    }
}
