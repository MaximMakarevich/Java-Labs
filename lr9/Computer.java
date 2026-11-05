package org.example;

public abstract class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getProcessor() {
        return this.processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return this.storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public abstract String getPerformance();

    public abstract String getPurpose();

    public void displayInfo() {
        System.out.println("Процессор: " + this.processor + ", ОЗУ: " + this.ram + " ГБ, Накопитель: " + this.storage + " ГБ");
    }
}