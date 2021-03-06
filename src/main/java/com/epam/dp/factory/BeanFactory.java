package com.epam.dp.factory;

import com.epam.dp.listener.Listener;
import org.reflections.Reflections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ivan_Zhuravel
 */
public class BeanFactory {

    private Reflections reflections = new Reflections("com.epam.dp.factory");
    private Map<String, Object> beans = new HashMap<>();

    {
        Set<Class<?>> annotatedWith = reflections
                .getTypesAnnotatedWith(Component.class);

        for (Class<?> clazz : annotatedWith) {
            tryAddToListeners(clazz);
        }
    }

    public MyClass getBean(final String id) {
        return (MyClass) beans.get(id);
    }

    public Collection getAllBeans() {
        return beans.values();
    }

    private void tryAddToListeners(Class<?> clazz) {
        try {
            Component annotation = clazz.getAnnotation(Component.class);
            beans.put(annotation.value(), clazz.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
