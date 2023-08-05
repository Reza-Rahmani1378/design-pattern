package com.hami.design_pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {


    @Serial
    private static final long serialVersionUID = -1093810940935189395L;
    private static Singleton sc = new Singleton();
    private Singleton() {
        if (sc != null) {
            throw new IllegalStateException("Already Created.");
        }
    }

    public static Singleton getInstance(){
        return sc;
    }

    @Serial
    private Object readResolve() throws ObjectStreamException{
        return sc;
    }

    @Serial
    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Singleton, cannot be clonned");
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null)
            classLoader = Singleton.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }
}
