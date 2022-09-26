package com.example.FirstCollab1.services;

import com.example.FirstCollab1.entities.Actor;
import com.example.FirstCollab1.entities.ActorList;

import java.util.List;

public interface ActorServices  {
    public List<ActorList> fetchNameAndId();
    public Actor fetchAllActor(int actorId);


}
