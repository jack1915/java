package oop;

public class Main {
    public static void main(String[] args) {
        String[] product = HotDrinkVendingMachine.menu(); // вызываем меню
        for (String string : product) {
            System.out.println(string);
        }
        // создаем экземпляры классов
        HotDrinkWithTemperature product1 = new HotDrinkWithTemperature(product[0], Double.parseDouble(product[1]), Double.parseDouble(product[2]));
        HotDrinkVendingMachine product2 = new HotDrinkVendingMachine(product1);
        System.out.println(product1);
        System.out.println(product2);
        // меняем экземпляр класса vending.. с помощью перегруженного метода
        product2.getProduct("чай", 0.2, 85);
        System.out.println(product2);
    }
}
