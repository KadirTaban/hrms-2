package kodlamaio.hrms2.business.concretes;

import javassist.NotFoundException;
import kodlamaio.hrms2.business.abstracts.EmployerService;
import kodlamaio.hrms2.dataAcces.abstracts.EmployerDao;
import kodlamaio.hrms2.dataAcces.concretes.EmployerCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.EmployerViewDao;
import kodlamaio.hrms2.entities.concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class EmployerManager implements EmployerService {

    private final EmployerDao employerDao ;




    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)

    public EmployerViewDao getEmployerById(Integer id) throws NotFoundException{
        final Employer employer=employerDao.findById(id).orElseThrow(()-> new NotFoundException("aa"));
        return EmployerViewDao.of(employer);
    }

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<EmployerViewDao> getEmployer() {
        return employerDao.findAll().stream().map(EmployerViewDao::of).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public EmployerViewDao createEmployer(EmployerCreateDao employerCreateDao)throws NotFoundException {
        final Employer employer = employerDao.save(new Employer(employerCreateDao.getId(), employerCreateDao.getFirstName(), employerCreateDao.getLastName(), employerCreateDao.getProvideOfEmployer(),employerCreateDao.getEMail(),employerCreateDao.getPassword()));

        return EmployerViewDao.of(employer);
    }
}
