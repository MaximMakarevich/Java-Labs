package org.example;

public class City {
    private String name;
    private String country;
    private int population;

    private static int totalCities = 0;
    private static long totalPopulation = 0;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;

        totalCities++;
        totalPopulation += population;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public int getPopulation() {
        return this.population;
    }

    public static int getTotalCities() {
        return totalCities;
    }

    public static long getTotalPopulation() {
        return totalPopulation;
    }

    public static double getAveragePopulation() {
        if (totalCities == 0) {
            return 0.0;
        }
        return (double) totalPopulation / totalCities;
    }
}