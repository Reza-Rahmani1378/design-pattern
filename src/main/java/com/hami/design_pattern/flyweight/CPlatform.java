package com.hami.design_pattern.flyweight;

public class CPlatform implements Platform{

    public CPlatform() {
        System.out.println("C Platform...");
    }
    @Override
    public void execute(Code code) {
        System.out.println("Code Executing is :" + code.getCode());
    }
}
