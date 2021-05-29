package kodlamaio.hrms2.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {

   @Id
   //is created the primary key automatically
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;


   @Column(name = "firstName",nullable = false)
   private String firstName;

   @Column(name = "lastName",nullable = false)
   private String lastName;

   @Column(name = "nationalIdentity",nullable = false,length = 11)
   private String nationalIdentity;

   public User(int id, String firstName, String lastName, String nationalIdentity) {
      this.id=id;
      this.firstName=firstName;
      this.lastName=lastName;
      this.nationalIdentity=nationalIdentity;
   }
}
