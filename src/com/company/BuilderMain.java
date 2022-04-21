package com.company;

import builder.*;

public class BuilderMain {
    public static void main(String[] args) {
        DeviceBuilder deviceBuilder = new DeviceBuilder();

        Device vegDevice = deviceBuilder.preparePixel6();
        System.out.println("Pixel 6");
        vegDevice.showItems();
        System.out.println("Total Cost: " + vegDevice.getCost());

        Device nonVegDevice = deviceBuilder.prepareiPhone13();
        System.out.println("\n\niPhone 13:");
        nonVegDevice.showItems();
        System.out.println("Total Cost: " + nonVegDevice.getCost());
    }
}
