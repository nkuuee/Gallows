package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGenerator {
    public String generateWord() {
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nkuue\\OneDrive\\Документы\\russian_nouns_1000.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if (words.isEmpty()) {
            throw new IllegalStateException("Словарь пуст или несуществует.");
        }
        return words.get(new Random().nextInt(words.size()));
    }
}
