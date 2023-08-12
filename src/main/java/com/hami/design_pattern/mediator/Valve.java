package com.hami.design_pattern.mediator;

public class Valve implements Colleague{
    private MachineMediator mediator;
    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void open() {
        System.out.println("Valve is Opened...");
        System.out.println("Water is filling...");
        mediator.closed();
    }

    public void closed() {
        System.out.println("Valve is Closed...");
        mediator.on();
    }
}
