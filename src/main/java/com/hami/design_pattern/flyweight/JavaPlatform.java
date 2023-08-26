package com.hami.design_pattern.flyweight;

public class JavaPlatform implements Platform{

    public JavaPlatform() {
        System.out.println("Java Platform...");
    }
    @Override
    public void execute(Code code) {
        System.out.println("Code Executing is :" + code.getCode());
    }
}
