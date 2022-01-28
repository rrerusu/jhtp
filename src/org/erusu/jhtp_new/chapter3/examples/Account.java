package org.erusu.jhtp_new.chapter3.examples;

public class Account {
    private String name;

    // 3.5 Update: Add Constructor
    public Account(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}