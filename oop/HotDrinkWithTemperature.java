package oop;

public class HotDrinkWithTemperature extends HotDrink { // дочерний класс, расширенный температурой напитка
    private double temperature;

    public HotDrinkWithTemperature(String name, double volume, double temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    // плюс перезаписан метод для корректного отображения экземпляра класса в консоли
    @Override
    public String toString() {
        return "HotDrinkTemperature{" +
                "name=" + name +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
