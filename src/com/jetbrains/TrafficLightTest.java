package com.jetbrains;

import static org.junit.Assert.*;
import org.junit.Test;

public class TrafficLightTest {
    Road road = new Road("0", 6,  new int[]{0, 0});
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
        assertEquals(6, light.getPosition());
    }

    @Test
    public void getId() {
        assertEquals("light_3", light.getId());
    }
}

