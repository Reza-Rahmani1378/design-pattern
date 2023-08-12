package com.hami.design_pattern.mediator;

public class TestMediator {

    public static void main(String[] args) {
        MachineMediator mediator;
        Sensor sensor = new Sensor();
        Heater heater = new Heater();
        Button button = new Button();
        Machine machine = new Machine();
        Motor motor = new Motor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Valve valve = new Valve();

        mediator = new CottonMediator(machine,heater,sensor,soilRemoval,valve,motor);
        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();

        System.out.println("\n");

        mediator = new DenimMediator(machine,heater,motor,sensor,soilRemoval,valve);
        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();

    }
}
