package com.epam.dp.factory;

import org.reflections.Reflections;

import java.util.*;

/**
 * Created by Oleksandr_Kokhanyuk on 8/30/2016.
 */
public class ApplicationContext {
    private BeanFactory beanFactory;
    private Map<String, BeanPostProccessor> ingectors = new HashMap<>();

    public ApplicationContext(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }


    {
        Reflections reflections = new Reflections("com.epam.dp.factory");
        Set<Class<? extends BeanPostProccessor>> subTypesOf = reflections.getSubTypesOf(BeanPostProccessor.class);
        for (Class<? extends BeanPostProccessor> aClass : subTypesOf) {
            init(aClass);
        }
    }

    public void toIngect() {
        Collection<BeanPostProccessor> ingectorsBean = ingectors.values();
        Collection<SomeClass> beansForIngect = beanFactory.getAllBeans();
        for (BeanPostProccessor beanPostProccessor : ingectorsBean) {
            for (SomeClass bean : beansForIngect) {
                beanPostProccessor.inject(bean);
            }
        }
    }

    public MyClass getBean(String id) {
        return beanFactory.getBean(id);
    }

    private void init(Class<? extends BeanPostProccessor> toInit) {
        try {
            ingectors.put(toInit.getName(), toInit.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
