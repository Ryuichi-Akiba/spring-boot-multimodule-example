package org.example.boot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rakiba on 2015/02/01.
 */
@RestController
public class RootController {

    @RequestMapping("/")
    public String greet() {
        return "Hello, World!";
    }

}
