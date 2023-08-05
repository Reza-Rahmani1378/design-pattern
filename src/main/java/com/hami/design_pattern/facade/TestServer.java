package com.hami.design_pattern.facade;

public class TestServer {

    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facade = new ScheduleServerFacade(scheduleServer);
        System.out.println("Starting The Server");
        facade.startServer();
        facade.stopServer();
        System.out.println("Stopping The Server");
    }
}
