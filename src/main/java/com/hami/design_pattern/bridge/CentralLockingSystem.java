package com.hami.design_pattern.bridge;

public class CentralLockingSystem implements Product{
    private final String productName;

    public CentralLockingSystem(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System...");
    }
}
