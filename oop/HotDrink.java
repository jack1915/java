package oop;

public class HotDrink { // родительский класс 
    protected String name;
    protected double volume;

    public HotDrink(String name, double volume) {
        this.volume = volume;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
