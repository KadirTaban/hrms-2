package kodlamaio.hrms2.api.controllers;

import javassist.NotFoundException;
import kodlamaio.hrms2.business.abstracts.JobTitleService;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleViewDao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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


}
