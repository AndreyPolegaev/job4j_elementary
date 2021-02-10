package ru.job4j.condition;

public class Cinema2 {
    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }

    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema");
        } else {
            System.out.println("I can't go to the cinema");
        }
    }
}
