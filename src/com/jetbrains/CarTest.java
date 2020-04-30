package com.jetbrains;

import static org.junit.Assert.*;
import org.junit.Test;

public class CarTest {
    Road road = new Road("0", 1, new int[]{0, 0});
    Car car = new Car("1", road);

    @Test
    public void testMove() {
        car.move();
        assertEquals(1, car.getPosition());
    }

    @Test
    public void getSpeed() {
        assertEquals(1, car.getSpeed());
    }

    @Test
    public void getPosition() {
        assertEquals(1, car.getPosition());
    }

    @Test
    public void getRoad() {
        assertEquals(road, car.getCurrentRoad());
    }

    @Test
    public void getId() {
        assertEquals("car_1", car.getId());
    }

}