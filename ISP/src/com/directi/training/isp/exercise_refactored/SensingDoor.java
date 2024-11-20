package com.directi.training.isp.exercise_refactored;

public class SensingDoor implements Door, SensorDependant {
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor) {
        sensor.register(this);
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
    public void proximityCallback() {
        System.out.println("Proximity callback triggered.");
        if (!_locked) {
            open();
        }
    }
}