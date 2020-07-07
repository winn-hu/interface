package com.blueStarWei.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello World, "+name;
    }
}
