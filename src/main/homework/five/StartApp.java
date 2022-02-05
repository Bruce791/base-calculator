package main.homework.five;

import java.io.File;
import java.util.Map;

public class StartApp {
    public static void main(String[] args) {
        // Два вида пути к файлу
        File absolutePath = new File("C:\\Users\\User\\IdeaProjects\\homework-java\\src\\main\\homework\\five\\input.txt");
        File relativePath = new File("src/main/homework/five/input.txt");

        FrequentWord frequentWord = new FrequentWord();

        // Считать строки из файла
        frequentWord.readFile(relativePath);

        // Подсчет количества слов
        Map<String, Integer> currentMap = null;
        try {
            currentMap = frequentWord.countWords(frequentWord.getSplitStr());
            System.out.println(currentMap);
        } catch (NullPointerException ex) {
            System.out.println("**Файл пуст**");
        }
        // Вывод статистики слов
        frequentWord.findingTheFrequency(currentMap);
    }
}
