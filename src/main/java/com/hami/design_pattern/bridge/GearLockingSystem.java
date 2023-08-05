package com.hami.design_pattern.bridge;

public class GearLockingSystem implements Product{
    private final String productName;

    public GearLockingSystem(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System...");
    }
}
