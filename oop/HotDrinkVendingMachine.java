package oop;

import java.util.Scanner;

public class HotDrinkVendingMachine { // vновый класс с меню
    private HotDrinkWithTemperature product;

    public HotDrinkVendingMachine(HotDrinkWithTemperature product) {
        this.product = product;
    }

    public HotDrinkWithTemperature getProduct() {
        return product;
    }

    public void setProduct(HotDrinkWithTemperature product) {
        this.product = product;
    }
    // перегруженный метод getProduct
    public HotDrinkWithTemperature getProduct (String name, double volume, double temperature) {
        product.setName(name);
        product.setVolume(volume);
        product.setTemperature(temperature);
        return product;
    }
    // реализация меню
    public static String[] menu () {
        System.out.println("Выберите название напитка из списка:\n" +
                            "1 - чай\n" +
                            "2 - кофе\n" +
                            "3 - кофе с молоком\n" +
                            "4 - какао\n" +
                            "5 - горячий шоколад");
        try (Scanner iScanner = new Scanner(System.in)) {
            int drink = iScanner.nextInt();

            System.out.println("Выберите объем напитка:\n" +
                                "1 - 0.2л\n" +
                                "2 - 0.5л\n" +
                                "3 - 0.7л\n");
            int vol = iScanner.nextInt();

            System.out.println("Выберите температуоу напитка:\n" +
                                    "1 - 70C\n" + 
                                    "2 - 75C\n" + 
                                    "3 - 80C\n" + 
                                    "4 - 85C"); 
            int temp = iScanner.nextInt();

            String[] prod = new String [3];
            for (int i = 0; i < prod.length; i++) {
                if (drink == 1) {
                    prod[0] = "чай";
                } else if (drink == 2) {
                    prod[0] = "кофе";
                } else if (drink == 3) {
                    prod[0] = "кофе с молоком";
                } else if (drink == 4) {
                    prod[0] = "какао";
                }
                else if (drink == 5) {
                    prod[0] = "горячий шоколад";
                }
                if (vol == 1) {
                    prod[1] = "0.2";
                } else if (vol == 2) {
                    prod[1] = "0.5";
                } else if (vol == 3) {
                    prod[1] = "0.7";
                }
                if (temp == 1) {
                    prod[2] = "70";
                } else if (temp == 2) {
                    prod[2] = "75";
                } else if (temp == 3) {
                    prod[2] = "80";
                } else if (temp == 4) {
                    prod[2] = "85";
                }
            }
            return prod;
        }
    }
    // снова метод для корректного отображения в консоле
    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
            "name=" + product.getName() +
            ", volume=" + product.getVolume() +
            ", temperature=" + product.getTemperature() +
            '}';
    }
}
