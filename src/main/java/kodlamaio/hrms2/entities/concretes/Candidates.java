package kodlamaio.hrms2.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.NavigableMap;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
public class Candidates  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name="identity")
    private String nationalIdentity;


}
