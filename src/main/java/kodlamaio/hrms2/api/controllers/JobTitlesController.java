package kodlamaio.hrms2.api.controllers;

import javassist.NotFoundException;
import kodlamaio.hrms2.business.abstracts.JobTitleService;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleUpdateDao;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleViewDao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class JobTitlesController {

    private final JobTitleService jobTitleService;


    @GetMapping("v1/title/{id}")

    public ResponseEntity<JobTitleViewDao> getjobTitleById(@PathVariable Integer id) throws NotFoundException {
        final JobTitleViewDao jobTitleViewDao = jobTitleService.getjobTitleById(id);
        return ResponseEntity.ok(jobTitleViewDao);
    }

    @GetMapping("v1/title")

    public ResponseEntity<List<JobTitleViewDao>> getjobTitle(){
        final List<JobTitleViewDao>  title=jobTitleService.getjobTitle();
        return ResponseEntity.ok(title);
    }
    @PutMapping("v1/user/{id}")

    public ResponseEntity<JobTitleViewDao> updateUser(@PathVariable("id") int id, @RequestBody JobTitleUpdateDao jobTitleUpdateDao) throws NotFoundException{
        final JobTitleViewDao jobTitle = jobTitleService.updateUser(id,jobTitleUpdateDao);

        return ResponseEntity.ok(jobTitle);
    }
    @PostMapping("v1/user/{id}")

    public ResponseEntity<GenericResponse> createUser(@RequestBody JobTitleCreateDao jobTitleCreateDao) throws NotFoundException {
        jobTitleService.createUser(jobTitleCreateDao);
        return ResponseEntity.ok(new GenericResponse("User Created"));
    }


}
