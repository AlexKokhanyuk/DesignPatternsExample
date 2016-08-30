package com.epam.dp.factory;

/**
 * @author Ivan_Zhuravel
 */
@Component("SomeClass")
public class SomeClass extends MyClass{

    private String test = "test";
    @InjectRandomInt
    private int someInt=1;

    private int someInt1=1;

    public int getSomeInt1() {
        return someInt1;
    }
    public String getTest() {
        return test;
    }

    public int getSomeInt() {
        return someInt;
    }
}
