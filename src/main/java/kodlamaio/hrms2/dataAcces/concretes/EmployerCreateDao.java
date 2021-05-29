package kodlamaio.hrms2.dataAcces.concretes;

import kodlamaio.hrms2.entities.concretes.Employer;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class EmployerCreateDao implements Serializable {

    private static final int serialVersionUID=1;
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String provideOfEmployer;
    private final String eMail;
    private final String password;

    public EmployerCreateDao(int id, String firstName, String lastName, String provideOfEmployer,String eMail,String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.provideOfEmployer = provideOfEmployer;
        this.eMail=eMail;
        this.password=password;
    }
    public static EmployerViewDao of(Employer employer){return new EmployerViewDao(employer.getId(),employer.getFirstName(),employer.getLastName(),employer.getProvideOfPosition(), employer.getEMail(),employer.getPassword());
    }
}
