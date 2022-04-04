package com.company;
//import


import observer.Desktop;
import observer.Laptop;
import observer.Updater;

public class Main {

    public static void main(String[] args) {
        Updater updater = new Updater(1.0);
        Laptop vivobox = new Laptop(updater);
        Laptop proBook = new Laptop(updater);
        Desktop desktop = new Desktop(updater);
        updater.updateVersion(1.1);
    }
}
