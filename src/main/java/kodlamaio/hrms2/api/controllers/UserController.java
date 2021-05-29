package kodlamaio.hrms2.api.controllers;

import javassist.NotFoundException;
import kodlamaio.hrms2.business.abstracts.UserService;
import kodlamaio.hrms2.dataAcces.concretes.JobTitleViewDao;
import kodlamaio.hrms2.dataAcces.concretes.UserCreateDao;
import kodlamaio.hrms2.dataAcces.concretes.UserViewDao;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class UserController {

    private final UserService userService;

    @GetMapping("v1/user/{id}")

    public ResponseEntity<UserViewDao> getUserById(@PathVariable Integer id) throws NotFoundException{
        final UserViewDao userViewDao = userService.getuserById(id);
        return ResponseEntity.ok(userViewDao);
    }

    @GetMapping("v1/user")

    public ResponseEntity<List<UserViewDao>> getUser(){
        final List<UserViewDao> user=userService.getUser();
        return ResponseEntity.ok(user);
    }

    @PostMapping("v1/user/{1}")

    public ResponseEntity<GenericResponse> createUser(@RequestBody UserCreateDao userCreateDao) throws  NotFoundException{
        userService.createUser(userCreateDao);
        return ResponseEntity.ok(new GenericResponse("User Created"));
    }

}
