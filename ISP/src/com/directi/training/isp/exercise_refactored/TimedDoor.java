package com.directi.training.isp.exercise_refactored;

public class TimedDoor implements Door, Timed {
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer) {
        timer.register(TIME_OUT, this);
        _locked = true;
        _opened = false;
    }

    @Override
    public void lock() {
        _locked = true;
        System.out.println("Door locked.");
    }

    @Override
    public void unlock() {
        _locked = false;
        System.out.println("Door unlocked.");
    }

    @Override
    public void open() {
        if (_locked) {
            System.out.println("Cannot open locked door.");
        } else {
            _opened = true;
            System.out.println("Door opened.");
        }
    }

    @Override
    public void close() {
        _opened = false;
        System.out.println("Door closed.");
    }

    @Override
    public void timeOutCallback() {
        System.out.println("Time out callback triggered.");
        close();
        lock();
    }
}