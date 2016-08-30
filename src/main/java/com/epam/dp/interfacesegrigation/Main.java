package com.epam.dp.interfacesegrigation;


/**
 * @author Ivan_Zhuravel
 */
public class Main {
    public static void main(String[] args) {
        StandartDuckBehavior d = new FakeDuck();

//        d.eat();
        d.quack();
        d.swim();
    }
}
