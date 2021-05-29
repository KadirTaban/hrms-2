package kodlamaio.hrms2.business.abstracts;

import javassist.NotFoundException;
import kodlamaio.hrms2.dataAcces.concretes.EmployerCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.EmployerViewDao;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployerService {
    EmployerViewDao getEmployerById(Integer id) throws NotFoundException;
    List<EmployerViewDao> getEmployer();


    EmployerViewDao createEmployer(EmployerCreateDao employerCreateDao)throws NotFoundException;
}
