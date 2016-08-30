package com.epam.dp.listener;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Ivan_Zhuravel
 */
public class EventProxy implements InvocationHandler {

    private final Event event;
    private final List<Listener> listeners;

    public EventProxy(Event event, List<Listener> listeners) {
        this.event = event;
        this.listeners = listeners;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        for (Listener listener : listeners) {
            listener.doListen();
        }

        return method.invoke(event, args);
    }
}
