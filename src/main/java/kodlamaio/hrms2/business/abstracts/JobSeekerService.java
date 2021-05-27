package kodlamaio.hrms2.business.abstracts;

import kodlamaio.hrms2.core.results.DataResult;
import kodlamaio.hrms2.core.results.Result;
import kodlamaio.hrms2.entities.concretes.Candidates;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<Candidates>> getAll();
    Result add(Candidates candidates);
}
