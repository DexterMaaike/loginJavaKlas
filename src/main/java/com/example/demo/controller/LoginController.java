package com.example.demo.controller;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    Iterable<Login> getLogin() {
        return loginService.findAll();
    }

    @PostMapping("/login")
    Login receiveLogin(@RequestBody Login login){
       return loginService.save(login);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/login/{id}")
    void delete(@PathVariable int id){
        loginService.deleteById(id);
    }

    @PutMapping("/login")
    Login updateLogin(@RequestBody Login login){
        return loginService.save(login);
    }
}
