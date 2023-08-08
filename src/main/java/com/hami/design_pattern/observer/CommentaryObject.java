package com.hami.design_pattern.observer;

import java.util.List;

public class CommentaryObject implements Subject,Commentary{
    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for(Observer observer : observers){
            observer.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
