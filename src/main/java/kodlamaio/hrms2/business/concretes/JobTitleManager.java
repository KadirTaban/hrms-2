package kodlamaio.hrms2.business.concretes;

import kodlamaio.hrms2.business.abstracts.JobTitleService;
import kodlamaio.hrms2.entities.concretes.jobTitle;
import kodlamaio.hrms2.dataAcces.abstracts.JobTitleDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    //injection
    private JobTitleDao jobTitleDao;


    @Autowired //bizim yerimize new liyor. Çok önemli
    public JobTitleManager(JobTitleDao jobTitleDao) { //constructor
        super();
        this.jobTitleDao = jobTitleDao;
    }



    @Override
    public List<jobTitle> getAll() {
        //Dao çağır findAll() //jparepostiory'de gelir.

        return jobTitleDao.findAll();
    }


}
// Business Database'e git findAll() çalıştır.