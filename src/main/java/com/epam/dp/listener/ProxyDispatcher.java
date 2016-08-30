package com.epam.dp.listener;

import org.reflections.Reflections;

import java.lang.reflect.Proxy;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Ivan_Zhuravel
 */
public class ProxyDispatcher {

    private Reflections reflections =
            new Reflections("com.epam.dp.listener");
    private List<Listener> listeners =
            new LinkedList<>();

    {
        Set<Class<? extends Listener>> subTypesOf =
                reflections.getSubTypesOf(Listener.class);

        for (Class<? extends Listener> clazz : subTypesOf) {
            tryAddToListeners(clazz);
        }
    }

    public Event eventProxy(final Event event) {
        EventProxy eventProxy = new EventProxy(event, listeners);
        return (Event) Proxy.newProxyInstance(
                Event.class.getClassLoader(), new Class[]{Event.class}, eventProxy);
    }

    private void tryAddToListeners(Class<? extends Listener> clazz) {
        try {
            listeners.add(clazz.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
