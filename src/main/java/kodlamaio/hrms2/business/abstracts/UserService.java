package kodlamaio.hrms2.business.abstracts;

import javassist.NotFoundException;
import kodlamaio.hrms2.dataAcces.concretes.UserCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.UserViewDao;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {


    UserViewDao getuserById(Integer id) throws NotFoundException;

    List<UserViewDao> getUser();

    UserViewDao createUser(UserCreateDao userCreateDao) throws NotFoundException;

}
