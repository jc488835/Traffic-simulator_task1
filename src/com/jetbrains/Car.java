package com.jetbrains;

public class Car {
    private static final int STOPPED = 0; //when the car reaches the end of the road or meets a red light
    private static final int NEXT_ROAD_INDEX = 0;
    private static final int START_POSITION = 1;
    String id;
    static float length;
    private static float breadth;
    public int speed = 1 ; //the speed of car is 1
    private int position; // position on current road
    private Road currentRoad; //the road is the car on

    public Car(String id, Road currentRoad) {
        this.id = "car_" + id;
        this.currentRoad = currentRoad;
        length = 2f;
        breadth = length * 0.5f;
        position = 1;
        this.currentRoad.getCarsOnRoad().add(this);
    }

    public Car() {
        id = "0";
        length = 2f;
        breadth = length * 0.5f;
        position = 1;
    }

    public void move() {
        /* when a car meets a red light */
        if (!this.currentRoad.getLightsOnRoad().isEmpty() && this.position == this.currentRoad.getLightsOnRoad().get(0).getPosition() && this.currentRoad.getLightsOnRoad().get(0).getState().equals("red")) {
            this.speed = STOPPED;
        } else {
            /* when a car enter next road */
            if (this.currentRoad.getLength() == this.getPosition() && !this.currentRoad.getConnectedRoads().isEmpty()) {
                this.currentRoad.getCarsOnRoad().remove(this);
                this.currentRoad = this.currentRoad.getConnectedRoads().get(NEXT_ROAD_INDEX);
                this.currentRoad.getCarsOnRoad().add(this);
                this.position = START_POSITION;
            } else if (this.currentRoad.getLength() > this.getPosition()) {
                this.position = (this.position + this.speed);
            } else {
                this.speed = STOPPED;
            }
        }
    }

    public void printCarStatus() {
        System.out.printf("%s going:%dm/s on %s at position:%s%n", this.getId(), this.getSpeed(), this.getCurrentRoad().
                getId(), this.getPosition());
    }

    public float getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosition() {
        return position;
    }

    public Road getCurrentRoad() {
        return currentRoad;
    }

    public String getId() {
        return id;
    }


}
