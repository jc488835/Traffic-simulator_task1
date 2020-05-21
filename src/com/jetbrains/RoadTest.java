package com.jetbrains;

import static org.junit.Assert.*;
import java.util.ArrayList;

import Model.Car;
import Model.Road;
import Model.TrafficLight;
import org.junit.Test;

public class RoadTest {
    Road road = new Road("5", 1, 5, new int[]{0, 0}, Road.Orientation.HORIZONTAL);


    @Test
    public void getLength() {
        assertEquals(5, road.getLength());
    }

    @Test
    public void getStartLocation() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, road.getStartLocation());
    }

    @Test
    public void getEndLocation() {
        int[] expected = {5, 0};
        assertArrayEquals(expected, road.getEndLocation());
    }

    @Test
    public void getCars() {
        ArrayList<Car> expected = new ArrayList<>();
        assertEquals(expected, road.getVehiclesOnRoad());
    }

    @Test
    public void getLights() {
        ArrayList<TrafficLight> expected = new ArrayList<>();
        assertEquals(expected, road.getLightsOnRoad());
    }

    @Test
    public void getConnectedRoads() {
        ArrayList<Road> expected = new ArrayList<>();
        assertEquals(expected, road.getConnectedRoads());
    }
}
