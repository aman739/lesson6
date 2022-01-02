package com.example.lesson6.data;

import java.util.ArrayList;

public class GameClient {

    public static ArrayList<GameModel> gameList = new ArrayList<>();

    public static ArrayList<GameModel> getGameList() {
        gameList.add(new GameModel("First", "Страна с самым маленьким населением", "Нигерия", "Ватикан", "Тувалу", "Палау", "Ватикан"));
        gameList.add(new GameModel("Second", "Страна с самым большим населением", "Китай", "Россия", "Кыргызыстан", "Канада", "Китай"));
        gameList.add(new GameModel("Third", "Cтрана с самой большой зарплатой", "Америка", "Германия", "Швейцария", "Россия", "Швейцария"));
        gameList.add(new GameModel("Fourth", "Cтрана с самой большой территорией", "Канада", "Америка", "Бельгия", "Россия", "Россия"));
        gameList.add(new GameModel("Fifth", "Cамая безопасная страна", "Исландия", "Гермния", "Япония", "Чехия", "Исландия"));
        gameList.add(new GameModel("Sixth", "Лучшая страна по образованию", "Америка", "Россия", "Великобритания", "Чехия", "Гермния"));
        gameList.add(new GameModel("Seventh", "Какая Страна занимает 1 место в рейтинге ФИФА", "Бельгия", "Франция", "Испания", "Бразилия", "Бельгия"));
        gameList.add(new GameModel("Eighth", "Самая лучшая страна в центральной азии", "Казахстан", "Кыргызстан", "Таджикистан", "Узбекистан", "Кыргызстан"));
        gameList.add(new GameModel("Ninth", "Страны с самым лучшим интернетом", "Сингапур", "Америка", "Гонконг", "Таиланд", "Сингапур"));
        gameList.add(new GameModel("Tenth", "Самая тупая страна", "Нигер", "Южный Судан", "Чид", "Мали", "Нигер"));
        return gameList;
    }
}
