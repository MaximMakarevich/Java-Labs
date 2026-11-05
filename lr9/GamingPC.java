package org.example;

public class GamingPC extends Computer {
    private String videoCard;

    public GamingPC(String processor, int ram, int storage, String videoCard) {
        super(processor, ram, storage);
        this.videoCard = videoCard;
    }

    public String getVideoCard() {
        return this.videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String getPerformance() {
        return "Высокая";
    }

    @Override
    public String getPurpose() {
        return "Для игр";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Игровой ПК, Видеокарта: " + this.videoCard);
    }
}