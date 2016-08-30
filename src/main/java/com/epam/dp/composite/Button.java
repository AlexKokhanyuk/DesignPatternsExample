package com.epam.dp.composite;

/**
 * @author Ivan_Zhuravel
 */
public class Button extends AbstractContainer {
    @Override
    public void draw() {
        System.out.println("I'm button");
    }
}
