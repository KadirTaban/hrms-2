package kodlamaio.hrms2.dataAcces.abstracts;

import kodlamaio.hrms2.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
