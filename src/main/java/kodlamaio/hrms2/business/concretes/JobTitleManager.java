package kodlamaio.hrms2.business.concretes;

import javassist.NotFoundException;
import kodlamaio.hrms2.business.abstracts.JobTitleService;

import kodlamaio.hrms2.dataAcces.abstracts.JobTitleDao;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleViewDao;
import kodlamaio.hrms2.entities.concretes.jobTitle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobTitleManager implements JobTitleService {

    private final JobTitleDao jobTitleDao;




    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public JobTitleViewDao getjobTitleById(Integer id) throws NotFoundException {
        final jobTitle jobTitle= jobTitleDao.findById(id).orElseThrow(()-> new NotFoundException("AA"));
        return JobTitleViewDao.of(jobTitle);
    }

    @Override
    @Transactional(readOnly=true,propagation=Propagation.SUPPORTS)
    public List<JobTitleViewDao> getjobTitle() {
        return jobTitleDao.findAll().stream().map(JobTitleViewDao::of).collect(Collectors.toList());
    }


}
// Business Database'e git findAll() çalıştır.