package javaObject;

public class Flower1 {
    //2. Create 10 objects with random data and print them

    //NOte: create two files, one for the class and another with main method to use the class

    String Name;
    String color;
    boolean isSmell;

    public Flower1(String name, String color, boolean isSmell) {
        Name = name;
        this.color = color;
        this.isSmell = isSmell;
    }

    @Override
    public String toString() {
        return "Flower1{" +
                "Name='" + Name + '\'' +
                ", color='" + color + '\'' +
                ", isSmell=" + isSmell +
                '}';
    }
}
