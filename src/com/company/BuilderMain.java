package com.company;

import builder.*;

public class BuilderMain {
    public static void main(String[] args) {
        DeviceBuilder deviceBuilder = new DeviceBuilder();

        Device vegDevice = deviceBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegDevice.showItems();
        System.out.println("Total Cost: " + vegDevice.getCost());

        Device nonVegDevice = deviceBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegDevice.showItems();
        System.out.println("Total Cost: " + nonVegDevice.getCost());
    }
}
