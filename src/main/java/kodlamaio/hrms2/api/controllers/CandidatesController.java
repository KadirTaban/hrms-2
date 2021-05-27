package kodlamaio.hrms2.api.controllers;

import kodlamaio.hrms2.business.abstracts.JobSeekerService;
import kodlamaio.hrms2.core.results.DataResult;
import kodlamaio.hrms2.core.results.Result;
import kodlamaio.hrms2.entities.concretes.Candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/candidates")
public class CandidatesController {

    @Autowired
    public CandidatesController(JobSeekerService jobSeekerService){
        super();
        this.jobSeekerService=jobSeekerService;

    }
    private JobSeekerService jobSeekerService;

    @GetMapping("/getAll")
    public DataResult<List<Candidates>> getAll(){
        return this.jobSeekerService.getAll();

    }

    @PostMapping("/add")
    public Result add(@RequestBody Candidates candidates){
        return this.jobSeekerService.add(candidates);
    }
}
