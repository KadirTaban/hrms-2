package kodlamaio.hrms2.dataAcces.abstracts;

import kodlamaio.hrms2.entities.concretes.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CandidatesDao extends JpaRepository<Candidates,Integer> {

}