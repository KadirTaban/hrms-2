package kodlamaio.hrms2.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

//anotasyonları projeye inlude ediyoruz
@Data//getter setter
@Entity//veritabanı nesnesi
@Table(name = "job_titles") //veritabanı tablo karsilik
@NoArgsConstructor//parametre olmadan çalışan constructor

public class jobTitle {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key üretme türünü atıyoruz.
    private Integer id;



    @Column(name = "title",nullable = false)
    private String title;

    public jobTitle(String title){
        this.title=title;
    }

}
