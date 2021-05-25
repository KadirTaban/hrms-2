package kodlamaio.hrms2.api.controllers;

import kodlamaio.hrms2.business.abstracts.JobTitleService;
import kodlamaio.hrms2.entities.concretes.jobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/jobtitles")
public class JobTitlesController {

    private JobTitleService jobTitleService;

    @Autowired //newleme isini yapar.
    public JobTitlesController(JobTitleService jobTitleService){
        super();
        this.jobTitleService = jobTitleService;

    }
    @GetMapping("/getall")

    public List<jobTitle> getAll(){
        return jobTitleService.getAll();
    }

}
