package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGenerator {
    private static final List<String> WORDS = new ArrayList<>();

    static {
        try (InputStream inputStream = WordGenerator.class
                .getClassLoader()
                .getResourceAsStream("russian_nouns_1000.txt")) {

            if (inputStream == null) {
                throw new IllegalStateException("Файл russian_nouns_1000.txt не найден в ресурсах.");
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    WORDS.add(line.trim());
                }
            }

            if (WORDS.isEmpty()) {
                throw new IllegalStateException("Файл пуст. Нет слов для игры.");
            }

        } catch (IOException e) {
            throw new RuntimeException("Ошибка при загрузке слов: " + e.getMessage(), e);
        }
    }

    private final Random random = new Random();

    public String generateWord() {
        return WORDS.get(random.nextInt(WORDS.size()));
    }
}


