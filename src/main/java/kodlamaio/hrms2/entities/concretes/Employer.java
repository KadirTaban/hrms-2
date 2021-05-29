package kodlamaio.hrms2.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employer")
@NoArgsConstructor
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firstName",nullable = false)
    private String firstName;

    @Column(name = "lastName",nullable = false)
    private String lastName;

    @Column(name = "provideOfPosition",nullable = false)
    private String provideOfPosition;

    @Column(name = "eMail",nullable = false)
    private String eMail;

    @Column(name = "password",nullable = false)
    private String password;
    public Employer(int id,String firstName,String lastName,String provideOfPosition,String eMail,String password){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.provideOfPosition=provideOfPosition;
        this.eMail=eMail;
        this.password=password;
    }
}
