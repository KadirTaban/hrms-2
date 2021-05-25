package kodlamaio.hrms2.business.abstracts;

import kodlamaio.hrms2.entities.concretes.jobTitle;

import java.util.List;

public interface JobTitleService {
    List<jobTitle> getAll();
}
