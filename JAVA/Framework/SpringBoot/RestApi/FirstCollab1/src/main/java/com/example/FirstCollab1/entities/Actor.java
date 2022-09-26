package com.example.FirstCollab1.entities;

public class Actor {
    int actorId,age;
    private String actorName,description;


    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", description='" + description + '\'' +
                ", actorId=" + actorId +
                ", age=" + age +
                '}';
    }

    public Actor(String actorName, String description, int actorId, int age) {        this.actorName = actorName;
        this.description = description;
        this.actorId = actorId;
        this.age = age;
    }
}
