package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String args[]) {
        //using ApplicationContext
         ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Movie movie1 = context.getBean("movie1", Movie.class);
        System.out.println(movie1.getActor1());
        Movie movie2 = context.getBean("movie2", Movie.class);
        System.out.println(movie2.getActor2());
        Movie movie= context.getBean("movie", Movie.class);
       System.out.println(movie.getActor());
        Movie movie4= context.getBean("movie", Movie.class);
        System.out.println(movie.getActor());


            System.out.println(movie==movie4);







    }
}
