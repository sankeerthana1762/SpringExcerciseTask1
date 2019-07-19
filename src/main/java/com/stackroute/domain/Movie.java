package com.stackroute.domain;


public class Movie {

    Actor actor;


    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }



    @Override
    public String toString()
    {
        return actor.getName() +actor.getGender()+actor.getAge();
    }
}
