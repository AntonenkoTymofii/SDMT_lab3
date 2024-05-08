package org.example.javaproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorldController {
    @GetMapping(value = "",produces= "text/html")
    public String sayHello () {
        return "<!DOCTYPE html>" +
                "<html>" +
                "\t<head><title>Hello world!</title></head>" +
                "\t<body><h1>Hello world!</h1></body>" +
                "</html>";
    }
}