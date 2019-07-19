package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.demo.BeanPostProcessorDemo;
import com.stackroute.domain.Movie;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class Main {
    public  static  void  main(String[] args)
    {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");//using ApplicationContext

        BeanLifeCycleDemo beanLifeCycleDemo=(BeanLifeCycleDemo) applicationContext.getBean("lifeCycle");
        BeanPostProcessorDemo bean=(BeanPostProcessorDemo) applicationContext.getBean("bean");
        applicationContext.close();





    }


}
