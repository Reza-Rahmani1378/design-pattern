package com.hami.design_pattern.observer;

import java.util.Objects;

public class SMSUsers implements Observer{

    private final Subject subject;
    private String desc;
    private String userInfo;

    public SMSUsers(Subject subject , String userInfo) {
        if (Objects.isNull(subject)) {
            throw new IllegalStateException("Publisher Not Found");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }


    @Override
    public void subscribe() {
        System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails());
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing "+userInfo+" to "+subject.subjectDetails() + " ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }

    private void display() {
        System.out.println("{" + userInfo + "}:" + desc);
    }
}
