package com.mentorship.podcaststream.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcast")
public class PodcastController {

    @GetMapping("/name")
    public String name() {
        return "Podcast";
    }

}
