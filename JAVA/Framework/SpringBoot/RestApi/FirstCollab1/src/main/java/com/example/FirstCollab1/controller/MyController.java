package com.example.FirstCollab1.controller;

import com.example.FirstCollab1.entities.Actor;
import com.example.FirstCollab1.entities.ActorList;
import com.example.FirstCollab1.services.ActorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MyController {

    @Autowired
    ActorServices actorServices;

    @GetMapping("/fetchNameAndId")
    @CrossOrigin
    public List<ActorList> fetchNameAndId() {
        return actorServices.fetchNameAndId();
    }

    @GetMapping("/fetchActor/{actorId}")
    @CrossOrigin
    public Actor fetchAllActor(@PathVariable String actorId) {
        return actorServices.fetchAllActor(Integer.parseInt(actorId));
    }
}
