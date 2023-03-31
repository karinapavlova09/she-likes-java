package com.sda.she_likes_java.objects;

public class House {
    private int numberOfRooms;
    private int numberofBathrooms;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberofBathrooms() {
        return numberofBathrooms;
    }

    public void setNumberofBathrooms(int numberofBathrooms) {
        this.numberofBathrooms = numberofBathrooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberofBathrooms=" + numberofBathrooms +
                '}';
    }

    public House(int numberOfRooms, int numberofBathrooms) {
        this.numberOfRooms = numberOfRooms;
        this.numberofBathrooms = numberofBathrooms;


    }
}
