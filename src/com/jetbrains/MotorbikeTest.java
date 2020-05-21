package com.jetbrains;

import static org.junit.Assert.*;

import Model.Motorbike;
import Model.Road;
import org.junit.Test;

public class MotorbikeTest {
   Motorbike bike = new Motorbike("3", new Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL));


    @Test
    public void getSpeed() {
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void getPosition() {
        assertEquals(-2, bike.getPosition());
    }

    @Test
    public void getId() {
        assertEquals("bike_3", bike.getId());
    }

}

