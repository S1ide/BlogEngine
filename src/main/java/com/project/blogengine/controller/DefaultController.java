package com.project.blogengine.controller;

import com.project.blogengine.model.User;
import com.project.blogengine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DefaultController {

    UserRepository userRepository;

    public DefaultController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String index(){
        userRepository.save(new User(false, "Nikita", "Kopotev.nick@icloud.com", "123"));
        return "index";
    }
}
