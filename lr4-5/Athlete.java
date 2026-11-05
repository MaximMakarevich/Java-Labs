package org.example;

public class Athlete {
    private String name;
    private String sport;
    private double score;

    public Athlete(String name, String sport, double score) {
        this.name = name;
        this.sport = sport;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public String getSport() {
        return this.sport;
    }

    public double getScore() {
        return this.score;
    }
}