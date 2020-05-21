package com.jetbrains;

import static org.junit.Assert.*;

import Model.Car;
import Model.Road;
import org.junit.Test;

public class CarTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    Car car = new Car("1", road);

    @Test
    public void testMove() {
        car.move();
        assertEquals(-3, car.getPosition());
    }

    @Test
    public void getSpeed() {
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void getPosition() {
        assertEquals(-4, car.getPosition());
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