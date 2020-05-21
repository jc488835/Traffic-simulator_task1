package com.jetbrains;

import static org.junit.Assert.*;

import Model.Bus;
import Model.Road;
import org.junit.Test;

public class BusTest {
    Road road = new Road("2", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    Bus bus = new Bus("2", road);


    @Test
    public void getSpeed() {
        assertEquals(0, bus.getSpeed());
    }

    @Test
    public void getPosition() {
        assertEquals(-12, bus.getPosition());
    }

    @Test
    public void getId() {
        assertEquals("bus_2", bus.getId());
    }

}
