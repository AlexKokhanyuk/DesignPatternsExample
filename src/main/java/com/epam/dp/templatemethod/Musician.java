package com.epam.dp.templatemethod;

/**
 * @author Ivan_Zhuravel
 */
public abstract class Musician {

    public void play() {
        prepare();
        proccess();
        finish();
    }

    protected abstract void prepare();
    protected abstract void proccess();
    protected abstract void finish();
}
