package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Andrey";
        names[1] = "Nikolay";
        names[2] = "Petr";
        names[3] = "Stanislav";
        System.out.println("ages length= " + ages.length + " surnames length= " + surnames.length + " prices length= " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
