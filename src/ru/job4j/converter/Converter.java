package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars.");
        //Testing both methods
        int in = 140;  //first method
        int out = 2;
        int expected = rubleToEuro(in);
        boolean passed = expected == out;
        int in2 = 120; //second method
        int out2 = 2;
        int expected2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles into Euro are 2. Test result: <" + passed + ">");
        System.out.println("120 rubles into Dollars are 2.Test result <" + passed2 + ">");

    }

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
}

