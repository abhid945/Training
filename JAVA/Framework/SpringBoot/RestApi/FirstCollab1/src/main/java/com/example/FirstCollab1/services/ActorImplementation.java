package com.example.FirstCollab1.services;


import com.example.FirstCollab1.dao.ConnectionImplementation;
import com.example.FirstCollab1.entities.Actor;
import com.example.FirstCollab1.entities.ActorList;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class ActorImplementation implements ActorServices{


    @Override
    public List<ActorList> fetchNameAndId() {
        Connection connection = ConnectionImplementation.getConnection();
        List<ActorList> actorLists = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
           ResultSet resultSet =  statement.executeQuery("Select * from actor");
           while (resultSet.next()){
               ActorList actorList = new ActorList();
               actorList.setActorId(resultSet.getInt(1));
               actorList.setActorName(resultSet.getString(3));
               actorLists.add(actorList);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return actorLists;
    }

    @Override
    public Actor fetchAllActor(int actorId) {
        Connection connection = ConnectionImplementation.getConnection();
        Actor actor = null;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =  statement.executeQuery("Select * from actor where actorId = " + actorId);
            while (resultSet.next()){
                actor = new Actor(resultSet.getString(3),resultSet.getString(4),resultSet.getInt(1),resultSet.getInt(2));
                ActorList actorList = new ActorList();
                actorList.setActorId(resultSet.getInt(1));
                actorList.setActorName(resultSet.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return actor;
    }
}


