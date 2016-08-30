package com.epam.dp.templatemethod;

/**
 * @author Ivan_Zhuravel
 */
public class GutairMan extends Musician {
    @Override
    protected void prepare() {
        System.out.println("drink");
    }

    @Override
    protected void proccess() {
        System.out.println("брынь брынь");
    }

    @Override
    protected void finish() {
        System.out.println("протереть пивом струны");
    }
}
