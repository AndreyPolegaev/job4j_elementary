package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = "";
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четерг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресение";
                break;
            default: name = "Ошибка";
            }
        return name;
    }
    public static void main(String[] args) {
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(2));
        System.out.println(nameOfDay(10));
    }
}
