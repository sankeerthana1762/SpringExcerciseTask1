package com.stackroute.domain;

public class Movie {
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public String display(){
        return actor.getName();
    }


}
