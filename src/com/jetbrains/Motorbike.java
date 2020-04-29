package com.jetbrains;

public class Motorbike extends Car {

    public Motorbike(String id) {
        this.id = ("motorbike_" + id);
        length = super.getLength() * 0.5f;
    }

}
