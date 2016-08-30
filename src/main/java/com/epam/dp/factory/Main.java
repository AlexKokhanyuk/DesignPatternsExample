package com.epam.dp.factory;

import java.util.Objects;

/**
 * @author Ivan_Zhuravel
 */
public class Main {

    public static void main(String[] args) {


        ApplicationContext applicationContext=new ApplicationContext(new BeanFactory());
        applicationContext.toIngect();
        MyClass someClass = applicationContext.getBean("SomeClass");
        System.out.println(someClass.getTest());
    }
}
