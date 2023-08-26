package com.hami.design_pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        Code code = new Code();
        code.setCode("C code is Running.");
        Platform platform = PlatformFactory.getPlatform("C");
        platform.execute(code);
        code = new Code();
        code.setCode("C 2 Code is Running.");
        platform = PlatformFactory.getPlatform("C");
        platform.execute(code);

        code.setCode("Java code is Running.");
        platform = PlatformFactory.getPlatform("Java");
        platform.execute(code);
        code = new Code();
        code.setCode("Java 2 Code is Running.");
        platform = PlatformFactory.getPlatform("Java");
        platform.execute(code);

        code.setCode("Ruby code is Running.");
        platform = PlatformFactory.getPlatform("Ruby");
        platform.execute(code);
        code = new Code();
        code.setCode("Ruby 2 Code is Running.");
        platform = PlatformFactory.getPlatform("Ruby");
        platform.execute(code);
    }
}
