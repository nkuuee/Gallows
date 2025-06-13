# 🎮 <span style="color:#FF6B6B">Gallows Game</span> <img src="https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk" alt="Java 17+"> <img src="https://img.shields.io/badge/License-MIT-green" alt="MIT License">

<div align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExcDFtZ3VjNG5xYzNkY2V5YnR6YzF5dWJjZ3B6eWJ0dWZqY2N6eGZ0ZyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/xT5LMHxhOfscxPfIfm/giphy.gif" width="250" alt="Анимация виселицы">
</div>

🔴 **Игра «Виселица»** с консольным интерфейсом на Java. Угадайте слово до того, как человечек будет повешен!

---

## 🎨 <span style="color:#4ECDC4">Особенности</span>
- 🎲 **Случайные слова** из встроенного словаря
- 📊 **Статистика** побед/поражений
- 🖥️ **ASCII-графика** виселицы (пример ниже)

```ascii
  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========
```

---

## 🚀 <span style="color:#FFD166">Быстрый старт</span>

### Требования
- Java 17+
- Maven 3.6+

```bash
# 1. Клонируйте репозиторий
git clone https://github.com/nkuuee/Gallows.git

# 2. Соберите проект
cd Gallows
mvn clean package

# 3. Запустите игру
java -jar target/gallows-1.0-SNAPSHOT.jar
```

---

## 📜 <span style="color:#118AB2">Правила</span>
1. У вас есть **7 попыток** 
2. Угадывайте буквы или всё слово
3. Каждая ошибка = +1 к виселице
4. Победа — если угадано слово до завершения рисунка

---


## 🤝 <span style="color:#073B4C">Как помочь проекту?</span>
1. Добавьте новые слова в `words.txt`
2. Предложите улучшения ASCII-графики
3. Напишите больше тестов
4. Добавьте новый функционал

---

<div align="center">
  <sub>Сделано с ❤️ и <span style="color:red">O</span><span style="color:orange">O</span><span style="color:yellow">P</span></sub>
</div>
