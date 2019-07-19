package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//using ApplicationContextAware,BeanFactoryAware,BeanNameAware
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    Actor actor;
//setters and getter methods
    public ApplicationContext getApplicationContextAware() {
        return applicationContext;
    }

    public String getBeanNameAware() {
        return beanName;
    }

    public BeanFactory getBeanFactoryAware() {
        return beanFactory;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public String getBeanName() {
        return beanName;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    ApplicationContext applicationContext;
    String beanName;
    BeanFactory beanFactory;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor() {
        return actor;
    }

    public String display(){
        return actor.getName();
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;

    }

    @Override
    public void setBeanName(String s) {
        this.beanName=s;

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;

    }
}
