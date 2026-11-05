package org.example;

public class Train {
    private String destination;
    private String trainNumber;
    private String departureTime;

    public Train(String destination, String trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public void isDelayed(int minutes) {
        String[] timeParts = this.departureTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int mins = Integer.parseInt(timeParts[1]);

        int totalMinutes = hours * 60 + mins + minutes;
        int newHours = (totalMinutes / 60) % 24;
        int newMins = totalMinutes % 60;

        String formattedHours = newHours < 10 ? "0" + newHours : String.valueOf(newHours);
        String formattedMins = newMins < 10 ? "0" + newMins : String.valueOf(newMins);

        this.departureTime = formattedHours + ":" + formattedMins;
    }

    public void displayInfo() {
        System.out.println("Поезд №" + this.trainNumber + " в направлении " + this.destination + ", время отправления: " + this.departureTime);
    }
}