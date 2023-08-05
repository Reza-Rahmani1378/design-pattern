package com.hami.design_pattern.singleton;

/*
* Although we can use all these techniques, there is one simple and easier way of creating a singleton class. As of JDK 1.5, you
can create a singleton class using enums. The Enum constants are implicitly static and final and you cannot change their values
once created.
* */
public class SingletonEnum {

    public enum SingleEnum {
        SINGLE_ENUM
    }
}
