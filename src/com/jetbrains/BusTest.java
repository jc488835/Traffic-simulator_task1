package com.jetbrains;

import static org.junit.Assert.*;
import org.junit.Test;

public class BusTest {
    Road road = new Road("0", 1, new int[]{0, 0});
    Bus bus = new Bus("2");


    @Test
    public void getSpeed() {
        assertEquals(1, bus.getSpeed());
    }

    @Test
    public void getPosition() {
        assertEquals(1, bus.getPosition());
    }

    @Test
    public void getId() {
        assertEquals("bus_2", bus.getId());
    }

}
