package org.example;

public class OfficePC extends Computer {
    private double monitorSize;

    public OfficePC(String processor, int ram, int storage, double monitorSize) {
        super(processor, ram, storage);
        this.monitorSize = monitorSize;
    }

    public double getMonitorSize() {
        return this.monitorSize;
    }

    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }

    @Override
    public String getPerformance() {
        return "Средняя";
    }

    @Override
    public String getPurpose() {
        return "Для офисной работы";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Офисный ПК, Диагональ монитора: " + this.monitorSize + "\"");
    }
}