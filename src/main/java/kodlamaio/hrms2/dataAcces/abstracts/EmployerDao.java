package kodlamaio.hrms2.dataAcces.abstracts;

import kodlamaio.hrms2.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
