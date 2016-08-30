package com.epam.dp.interfacesegrigation;

/**
 * @author Ivan_Zhuravel
 */
public class LiveDuck implements StandartDuckBehavior, RealDuckBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
