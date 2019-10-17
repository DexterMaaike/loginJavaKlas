package com.example.demo.service;

import com.example.demo.model.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginService extends CrudRepository<Login, Integer> {
}
