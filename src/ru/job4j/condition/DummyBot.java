package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "";
        if (question.equals("Привет Бот")) {
            rsl = "Привет умник";
        }
        if (question.equals("Пока.")) {
            rsl = "До скорой встречи";
        } else if (!question.equals("Привет Бот") && !question.equals("Пока")) {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Как дела?");
        System.out.println(rsl);
    }
}
