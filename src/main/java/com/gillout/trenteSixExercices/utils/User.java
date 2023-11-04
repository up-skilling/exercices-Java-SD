package com.gillout.trenteSixExercices.utils;

public class User {
    String name;
    Boolean isDoctor;
    Boolean safe;

    public User(String name, boolean isDoctor, boolean safe) {
        this.name = name;
        this.isDoctor = isDoctor;
        this.safe = safe;
    }

    public boolean isDoctor() {
        return isDoctor;
    }

    public boolean isSafe() {
        return safe;
    }
}
