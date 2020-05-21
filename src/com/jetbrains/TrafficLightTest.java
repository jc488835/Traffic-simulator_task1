package com.jetbrains;

import static org.junit.Assert.*;

import Model.Road;
import Model.TrafficLight;
import org.junit.Test;

public class TrafficLightTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    TrafficLight light = new TrafficLight("3", road);

    @Test
    public void testOperate() {
        light.operate(3515);
        assertEquals("green", light.getState());
    }

    @Test
    public void getState() {
        assertEquals("red", light.getState());
    }

    @Test
    public void getRoad() {
        assertEquals(road, light.getRoadAttachedTo());
    }

    @Test
    public void getPosition() {
        assertEquals(5, light.getPosition());
    }

    @Test
    public void getId() {
        assertEquals("light_3", light.getId());
    }
}

