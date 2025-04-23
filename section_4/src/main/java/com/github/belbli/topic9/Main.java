package com.github.belbli.topic9;

// Это однострочный комментарий. Комментарии игнорируются компилятором.
//e reg


import java.util.Scanner;

/**
 * Это многострочный комментарий.
 * В нем можно писать объяснения к коду или отключать части программы.
 */
public class Main {  // 'BasicsExample' — это идентификатор (имя класса)

    static final String WORD_WORD = "efwf";

    public static void main(String[] args) {
        // ▪️ Лексемы — минимальные единицы языка: слова, числа, символы, операторы и т.д.

        // 🔹 Алфавит Java: латинские буквы, цифры, специальные символы (например, +, -, *, =, и др.)

        // 🔹 Зарезервированные слова (keywords): имеют специальное значение. Например:
        int number = 10; // int — зарезервированное слово (тип), number — идентификатор, 10 — целочисленная константа

        final double PI = 3.14159; // final — зарезервированное слово, PI — идентификатор (в верхнем регистре принято для констант)

        String name = "Alice"; // String — ссылочный тип, "Alice" — строковая константа

        char letter = 'A'; // char — символьный тип, 'A' — символьная константа

        boolean isJavaFun = true; // boolean — логический тип, true — логическая константа

        // 🔸 Операторы:
        int a = 5 + 3;     // + — оператор сложения
        int b = a * 2;     // * — оператор умножения
        int c = b - 4;     // - — оператор вычитания
        int d = c / 2;     // / — оператор деления
        int e = d % 3;     // % — остаток от деления

        // 🔸 Приоритет операций:
        // * и / имеют более высокий приоритет, чем + и -
        int result = 2 + 3 * 4; // result = 2 + (3 * 4) = 14
        int result2 = (2 + 3) * 4; // скобки меняют порядок: (2 + 3) * 4 = 20

        System.out.println(10/3.0);

        // 🔸 Выражения:
        int x = 10;
        int y = 20;
        int max = (true) ? x : y; // тернарный оператор — выражение, возвращающее большее из двух чисел

        // 🔹 Вывод на экран:
        System.out.println("Max: " + max); // Оператор + также используется для конкатенации строк

        // 🔹 Условное выражение (с выражением в скобках):

        // 🔹 Цикл — тоже выражение, выполняющееся по условию
        for (int i = 0; i < 5; i++) {
            System.out.println("Итерация " + i);
        }


        //===================================================================================================

        // ▶️ 1. Ввод/вывод:
        Scanner scanner = new Scanner(System.in); // создаём сканер для ввода с клавиатуры
        System.out.print("Введите ваше имя: "); // вывод без перехода на новую строку
        String name2 = scanner.nextLine(); // ввод строки

        System.out.println("Привет, " + name2 + "!"); // вывод с переводом строки

        // ▶️ 2. Операторы присваивания:
        int a1 = 5; // присваивание значения переменной
        a += 3;    // эквивалентно a = a + 3;
        a *= 2;    // эквивалентно a = a * 2;

        // ▶️ 3. Пустой оператор:
        // В Java пустой оператор — это просто точка с запятой
        ; // ничего не делает

        // ▶️ 4. Условный оператор if-else:
        if (a == 1) {

        } else {

        }
        if (a1 > 10) {
            System.out.println("a больше 10");
        } else if (a1 == 10) {
            System.out.println("a равно 10");
        } else {
            System.out.println("a меньше 10");
        }

        // ▶️ 5. Оператор выбора switch-case:
        System.out.print("Введите день недели (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Неверный номер дня");
        }

        // ▶️ 6. Организация циклов:
        // — while: цикл с предусловием
        short count = 0;
        while (count > -1) {
            System.out.println("while: " + count);
            count++;
        }

        // — do-while: цикл с постусловием (всегда выполняется хотя бы раз)
        int n = 0;
        do {
            System.out.println("do-while: " + n);
            n++;
        } while (n < 2);

        // — for: цикл с инициализацией, условием и шагом
        for (int i = 0; i < 3; i++) {
            System.out.println("for: " + i);
        }


        // ▶️ 8. Стандартные функции:
        int max1 = Math.max(100, 200); // Math — стандартная библиотека
        double sqrt = Math.sqrt(25);  // извлечение квадратного корня
        System.out.println("Максимум: " + max1 + ", корень: " + sqrt);

        // ▶️ 9. Дополнительные компоненты модуля:
        // Можно добавить вспомогательные методы:
        sayGoodbye(name);

        // Закрываем Scanner (необязательно, но хорошая практика)
        scanner.close();
    }

    // Пример дополнительного компонента — метод (в некоторых языках функция)
    static void sayGoodbye(String userName) {
        System.out.println("Пока, " + userName + "!");
    }
}