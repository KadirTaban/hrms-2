package kodlamaio.hrms2.business.abstracts;

import javassist.NotFoundException;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleUpdateDao;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleViewDao;

import java.util.List;

public interface JobTitleService {


    JobTitleViewDao getjobTitleById(Integer id) throws NotFoundException;

    List<JobTitleViewDao> getjobTitle();


    JobTitleViewDao updateUser(int id, JobTitleUpdateDao jobTitleUpdateDao) throws NotFoundException;

    JobTitleViewDao createUser(JobTitleCreateDao jobTitleCreateDao)throws NotFoundException;

}
