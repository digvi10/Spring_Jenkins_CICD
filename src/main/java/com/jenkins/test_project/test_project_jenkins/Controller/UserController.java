package com.jenkins.test_project.test_project_jenkins.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping("/home")
    public String home()
    {
        return "Spring boot application Working";
    }

}
