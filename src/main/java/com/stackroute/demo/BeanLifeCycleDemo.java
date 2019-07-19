package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {



    public  static  void main(String args []) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanFile.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("lifeCycle");





    }
    public void coustomInit ()
    {
        System.out.println("Initialization");
    }
    public  void clean()
    {
        System.out.println("Destroy Method");
    }

    public void destroy ()
    {
        System.out.println("Destroy");
    }

    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties");

    }
}
