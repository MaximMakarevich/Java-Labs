package org.example;

public class Building {
    private String address;
    private int floors;
    private double totalArea;

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return this.floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getTotalArea() {
        return this.totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double averageAreaPerFloor() {
        if (this.floors <= 0) {
            return 0.0;
        }
        return this.totalArea / this.floors;
    }
}