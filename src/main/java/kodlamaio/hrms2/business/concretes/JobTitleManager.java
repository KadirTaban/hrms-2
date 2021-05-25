package kodlamaio.hrms2.business.concretes;

import kodlamaio.hrms2.business.abstracts.JobTitleService;
import kodlamaio.hrms2.entities.concretes.jobTitle;
import kodlamaio.hrms2.dataAcces.abstracts.JobTitleDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    //data access injection
    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao){
        super();
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public List<jobTitle> getAll() {
        return null;
    }
}
