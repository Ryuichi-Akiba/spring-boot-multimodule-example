package org.example.boot.web.controller;

import org.example.boot.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rakiba on 2015/02/01.
 */
@RestController
public class RootController {

    @Autowired
    private GreetService greetService;

    @RequestMapping("/")
    public String greet() {
        return greetService.say();
    }

}
