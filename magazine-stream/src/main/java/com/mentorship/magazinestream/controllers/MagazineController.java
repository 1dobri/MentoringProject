package com.mentorship.magazinestream.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magazine")
public class MagazineController {

    @GetMapping("/name")
    public String name() {
        return "Magazine";
    }

}
