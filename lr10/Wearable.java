package org.example;

public interface Wearable {
    void wear();
    String getSize();
    final int size = 48;
    default void wear2()
    {
        System.out.println("Метод wear2");
    }
}