package javaObject;

public class myPlant1 {
    //2. Create 10 objects with random data and print them

    //NOte: create two files, one for the class and another with main method to use the class



    public static void main(String[] args) {
        Flower1 plant = new Flower1("Lily", "pink", true);
        Flower1 plant2 = new Flower1("Rose", "red", true);
        Flower1 plant3 = new Flower1("jasmine", "white", true);
        Flower1 plant4 = new Flower1("Tulip", "yellow", false);
        Flower1 plant5 = new Flower1("Hibiscus", "orange", false);
        Flower1 plant6 = new Flower1("Lotus", "pink", true);
        Flower1 plant7 = new Flower1("Delia", "red", false);
        Flower1 plant8 = new Flower1("Sunflower", "yellow", false);
        Flower1 plant9 = new Flower1("Marigold", "orange", false);
        Flower1 plant10 = new Flower1("Zenia", "Blue", false);
        System.out.println(plant);
        System.out.println(plant2);
        System.out.println(plant3);
        System.out.println(plant4);
        System.out.println(plant5);
        System.out.println(plant6);
        System.out.println(plant7);
        System.out.println(plant8);
        System.out.println(plant9);
        System.out.println(plant10);
    }
}
