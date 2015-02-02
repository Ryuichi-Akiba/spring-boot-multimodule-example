package org.example.boot.service.impl;

import org.example.boot.service.GreetService;
import org.springframework.stereotype.Service;

/**
 * Created by rakiba on 2015/02/02.
 */
@Service
public class GreetServiceImpl implements GreetService {

    @Override
    public String say() {
        return "Hello, World!";
    }

}
