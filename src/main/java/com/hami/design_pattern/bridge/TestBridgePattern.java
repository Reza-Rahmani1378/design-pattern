package com.hami.design_pattern.bridge;

public class TestBridgePattern {
    public static void main(String[] args) {
        Product product = new CentralLockingSystem("Central Locking System");
        Product product1 = new GearLockingSystem("Gear Locking System");

        Car car = new BigWheel(product,"BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        car = new BigWheel(product1 , "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}
