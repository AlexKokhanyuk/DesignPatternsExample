package com.epam.dp.templatemethod;

/**
 * @author Ivan_Zhuravel
 */
public class Drummer extends Musician {
    @Override
    protected void prepare() {
        System.out.println("drink 2x");
    }

    @Override
    protected void proccess() {
        System.out.println("blast beat");
    }

    @Override
    protected void finish() {
        System.out.println("порвать пластик на бочке");
    }
}
