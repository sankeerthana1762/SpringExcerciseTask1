package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String args[]) {
        //using BeanFactory
        ClassPathResource res = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Movie movie = factory.getBean("movie", Movie.class);
        System.out.println(movie.display());

        //using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movie", Movie.class);
        System.out.println(movie1.display());

        //using beandefinitionregistry and beandefinitionreader
         BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
       BeanDefinitionReader beanDefinitionReader =new XmlBeanDefinitionReader(beanDefinitionRegistry);
       beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

       Movie movie2=((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie",Movie.class);
        System.out.println(movie2.display());





    }
}
