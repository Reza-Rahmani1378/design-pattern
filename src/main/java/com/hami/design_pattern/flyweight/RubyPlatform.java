package com.hami.design_pattern.flyweight;

public class RubyPlatform implements Platform{

    public RubyPlatform() {
        System.out.println("Ruby Platform...");
    }
    @Override
    public void execute(Code code) {
        System.out.println("Code Executing is :" + code.getCode());
    }
}
