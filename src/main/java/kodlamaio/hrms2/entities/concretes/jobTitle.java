package kodlamaio.hrms2.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

//anotasyonları projeye inlude ediyoruz
@Data//getter setter
@Entity//veritabanı nesenesi
@Table(name = "job_titles") //veritabanı tablo karsilik
@NoArgsConstructor//parametre olmadan çalışan constructor
@AllArgsConstructor// parametre olarak çalısan constructor

public class jobTitle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key üretme türünü atıyoruz.
    @Column(name="id")
    private int id;

    @Column(name = "title")
    private String title;
}
