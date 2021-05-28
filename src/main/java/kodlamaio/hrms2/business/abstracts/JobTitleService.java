package kodlamaio.hrms2.business.abstracts;

import javassist.NotFoundException;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleViewDao;
import kodlamaio.hrms2.entities.concretes.jobTitle;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JobTitleService {



    JobTitleViewDao getjobTitleById(Integer id) throws NotFoundException;
    List<JobTitleViewDao> getjobTitle();
}
