package kodlamaio.hrms2.dataAcces.abstracts;

import kodlamaio.hrms2.entities.concretes.jobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JavaTitleDao extends JpaRepository<jobTitle,Integer>{
}

//JpaRepository, otomatik crud operation,parametre : entity türü , Integer : PrimaryKey Id veri türü