package kodlamaio.hrms2.api.controllers;

import javassist.NotFoundException;
import kodlamaio.hrms2.business.abstracts.EmployerService;
import kodlamaio.hrms2.dataAcces.concretes.EmployerCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.EmployerViewDao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class EmployerController {
    private final EmployerService employerService;

    @GetMapping("v1/employee/{id}")

    public ResponseEntity<EmployerViewDao> getEmployerId(@PathVariable Integer id) throws NotFoundException{
        final EmployerViewDao employerViewDao = employerService.getEmployerById(id);
        return ResponseEntity.ok(employerViewDao);
    }

    @GetMapping("v1/employee")

    public ResponseEntity<List<EmployerViewDao>> getEmployer(){
        final List<EmployerViewDao> employee=employerService.getEmployer();
        return ResponseEntity.ok(employee);
    }
    @PostMapping("v1/employee{id}")

    public ResponseEntity<GenericResponse> createEmployer(@RequestBody EmployerCreateDao employerCreateDao)throws NotFoundException{

        employerService.createEmployer(employerCreateDao);
        return ResponseEntity.ok(new GenericResponse("User Created"));
    }
}
