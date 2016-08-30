package com.epam.dp.sigleton;

/**
 * @author Ivan_Zhuravel
 */
public class LazySigleton {

    private static volatile LazySigleton instance= null;

    private LazySigleton() {}

    public synchronized static LazySigleton getInstance() {
        if (instance == null) {
            instance = new LazySigleton();
        }

        return instance;
    }
}
