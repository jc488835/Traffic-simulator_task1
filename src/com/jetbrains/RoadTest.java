package com.jetbrains;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class RoadTest {
    Road road = new Road("5", 10,  new int[]{0, 0});

    @Test
    public void getId() {
        assertEquals("road_5", road.getId());
    }


    @Test
    public void getLength() {
        assertEquals(10, road.getLength());
    }

    @Test
    public void getStartLocation() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, road.getStartLocation());
    }

    @Test
    public void getEndLocation() {
        int[] expected = {10, 0};
        assertArrayEquals(expected, road.getEndLocation());
    }

    @Test
    public void getCars() {
        ArrayList<Car> expected = new ArrayList<>();
        assertEquals(expected, road.getCarsOnRoad());
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
