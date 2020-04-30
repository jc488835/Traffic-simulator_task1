package com.jetbrains;

import static org.junit.Assert.*;
import org.junit.Test;

public class MotorbikeTest {
    Road road = new Road("0", 1, new int[]{0, 0});
    Motorbike motorbike = new Motorbike("3");


    @Test
    public void getSpeed() {
        assertEquals(1, motorbike.getSpeed());
    }

    @Test
    public void getPosition() {
        assertEquals(1, motorbike.getPosition());
    }

    @Test
    public void getId() {
        assertEquals("motorbike_3", motorbike.getId());
    }

}

