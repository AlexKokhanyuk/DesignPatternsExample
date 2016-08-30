package com.epam.dp.composite;

/**
 * @author Ivan_Zhuravel
 */
public class Main {
    public static void main(String[] args) {
        AbstractContainer abstractContainer = new Window();

        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Button());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());
        abstractContainer.addElement(new Checkbox());

        abstractContainer.drawAll();
    }
}
