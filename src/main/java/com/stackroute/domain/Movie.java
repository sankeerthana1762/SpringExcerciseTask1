package com.stackroute.domain;
//Movie  class with constructor
public class Movie {
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public String display(){
        return actor.getName();
    }


}
