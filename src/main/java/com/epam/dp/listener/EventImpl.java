package com.epam.dp.listener;

/**
 * @author Ivan_Zhuravel
 */
public class EventImpl implements Event {
    @Override
    public void doEvent() {
        System.out.println("event");
    }
}
