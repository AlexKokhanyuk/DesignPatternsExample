package com.epam.dp.sigleton;

/**
 * @author Ivan_Zhuravel
 */
public class IdeaSingleton {
    private static IdeaSingleton ourInstance = new IdeaSingleton();

    public static IdeaSingleton getInstance() {
        return ourInstance;
    }

    private IdeaSingleton() {
    }
}
