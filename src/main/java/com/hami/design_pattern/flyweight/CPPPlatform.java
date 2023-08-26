package com.hami.design_pattern.flyweight;

public class CPPPlatform implements Platform{

    public CPPPlatform() {
        System.out.println("CPP Platform...");
    }
    @Override
    public void execute(Code code) {
        System.out.println("Code Executing is :" + code.getCode());
    }
}
