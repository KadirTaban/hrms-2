package kodlamaio.hrms2.business.concretes;

import kodlamaio.hrms2.business.abstracts.JobSeekerService;
import kodlamaio.hrms2.core.results.DataResult;
import kodlamaio.hrms2.core.results.Result;
import kodlamaio.hrms2.core.results.SuccessDataResult;
import kodlamaio.hrms2.core.results.SuccessResult;
import kodlamaio.hrms2.dataAcces.abstracts.CandidatesDao;
import kodlamaio.hrms2.entities.concretes.Candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatesManager implements JobSeekerService {

    private CandidatesDao candidatesDao;
    @Autowired
    public CandidatesManager(CandidatesDao candidatesDao){
        super();
        this.candidatesDao=candidatesDao;
    }
    @Override
    public DataResult<List<Candidates>> getAll() {
        return new SuccessDataResult<List<Candidates>>(this.candidatesDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(Candidates candidates) {
        this.candidatesDao.save(candidates);
        return new SuccessResult("ürün eklendi");
    }
}
