package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public  static  void main(String args []) {
        //using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie)applicationContext.getBean("movie");
        System.out.println(movie.getActor());
        //using BeanFactory
        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
        Movie movie1= (Movie)xmlBeanFactory.getBean("movie");
        System.out.println(movie.getActor());

        movie.setApplicationContext(applicationContext);
        movie.setBeanFactory(xmlBeanFactory);
        movie.setBeanName("movie");
        System.out.println(movie.getBeanFactory().getBean("movie",Movie.class).getActor());
        System.out.println(movie.getApplicationContext().getBean("movie",Movie.class).getActor());
        System.out.println(movie.getBeanFactory().getBean(movie.getBeanName(),Movie.class).getActor());
    }

}
