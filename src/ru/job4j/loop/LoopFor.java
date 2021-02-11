package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        for (int index = 0; index <= 5; index++) {
            System.out.println(index);
        }
        System.out.println("__________");
        for (int index = 5; index <= 10; index++) {
            System.out.print(index + " ");
        }
    }
}
