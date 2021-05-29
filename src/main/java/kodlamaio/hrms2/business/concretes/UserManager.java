package kodlamaio.hrms2.business.concretes;


import javassist.NotFoundException;
import kodlamaio.hrms2.business.abstracts.UserService;
import kodlamaio.hrms2.dataAcces.abstracts.UserDao;
import kodlamaio.hrms2.dataAcces.concretes.UserCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.UserViewDao;
import kodlamaio.hrms2.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserDao userDao;

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public UserViewDao getuserById(Integer id) throws NotFoundException {

        final User user = userDao.findById(id).orElseThrow(()->new NotFoundException("not found exception"));
        return UserViewDao.of(user);
    }

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)

    public List<UserViewDao> getUser() {
        return userDao.findAll().stream().map(UserViewDao::of).collect(Collectors.toList());
    }




    @Override
    @Transactional

    public UserViewDao createUser(UserCreateDao userCreateDao)throws NotFoundException{
        final User user = userDao.save(new User(userCreateDao.getId(),userCreateDao.getFirstName(),userCreateDao.getLastName(),userCreateDao.getNationalIdentity(),userCreateDao.getEMail(),userCreateDao.getPassword()));
        return UserViewDao.of(user);
    }
}
