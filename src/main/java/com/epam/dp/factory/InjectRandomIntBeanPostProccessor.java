package com.epam.dp.factory;

import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Set;

/**
 * Created by Oleksandr_Kokhanyuk on 8/30/2016.
 */
public class InjectRandomIntBeanPostProccessor implements BeanPostProccessor {

    @Override
    public void inject(SomeClass forIngect) {
        System.out.println(forIngect.getSomeInt());
        System.out.println(forIngect.getSomeInt1());
        Reflections reflections = new Reflections(forIngect.getClass(), new FieldAnnotationsScanner());
        Set<Field> field = reflections.getFieldsAnnotatedWith(InjectRandomInt.class);
        for (Field field1 : field) {
            try {
                field1.setAccessible(true);
                field1.setInt(forIngect, new Random().nextInt());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(forIngect.getSomeInt());
        System.out.println(forIngect.getSomeInt1());
    }

}
