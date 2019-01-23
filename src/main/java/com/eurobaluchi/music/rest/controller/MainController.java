package com.eurobaluchi.music.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @GetMapping("/music")
    public String searchByEnglish(@RequestParam(value = "word", required = false) String eng){
        String message = "Welcome to Eurobaluchi Music";
        System.out.println(message);
        return message;
    }
}
