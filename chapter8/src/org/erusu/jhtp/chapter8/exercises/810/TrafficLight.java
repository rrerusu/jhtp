package org.erusu.jhtp.chapter8.exercises._810;

public enum TrafficLight {
    RED(0),
    YELLOW(0),
    GREEN(0);

    private final double dura;

    TrafficLight(double duration) {
        dura = duration;
    }

    public double getDuration() {
        return dura;
    }
}