
# 📘 Конспект: Массивы, строки и множества

---

## 🔷 1. Массивы

### 🔹 Определение

**Массив** — это упорядоченная коллекция однотипных элементов, доступ к которым осуществляется по индексу.

Пример (на языке Java):
```java
int[] numbers = {1, 2, 3, 4, 5};
```

### 🔹 Описание и размещение в памяти

- Элементы массива располагаются **непрерывно в оперативной памяти**.
- Индексация начинается с **нуля**.
- Память выделяется **одним блоком**.
- Размер массива фиксирован после создания.

### 🔹 Использование

- Хранение однотипных данных (например, список чисел, символов).
- Быстрый доступ по индексу: `O(1)`
- Итерации (циклы `for`, `foreach`)

### 🔹 Особенности работы

- Размер задаётся при создании:
  ```java
  int[] arr = new int[10];
  ```
- Выход за границы массива вызывает **ошибку времени выполнения**.
- В некоторых языках (C/C++) нет автоматической проверки выхода за границы.

---

## 🔷 2. Символьные переменные и строки

### 🔹 Символьные переменные

- Представляют **один символ** (`char`)
- Основаны на **кодировках** (например, ASCII, Unicode)

Пример:
```java
char letter = 'A';
```

### 🔹 Строки

**Строка** — это последовательность символов, завершающаяся нулевым символом (`\0`) в С-подобных языках.

Пример (Java):
```java
String name = "Alice";
```

### 🔹 Представление строк

- В **C** — массив символов, заканчивающийся `\0`.
- В **Java / Python** — объект с собственными методами (String, str).
- Строки в Java — **неизменяемы** (immutable).

### 🔹 Размещение в памяти

- В C строки хранятся в **непрерывной области памяти**.
- В Java — в **куче**, как объекты.

---

## 🔹 Обработка строк и символов

### 📌 Основные операции

- Получение длины: `strlen`, `.length()`
- Сравнение строк: `strcmp`, `.equals()`
- Конкатенация: `strcat`, `+` (в Java)
- Извлечение подстрок, поиск символов, замена

### 📌 Функции и процедуры

| Язык  | Примеры функций          |
|-------|--------------------------|
| C     | `strlen`, `strcpy`, `strcmp` |
| Java  | `.length()`, `.substring()`, `.equals()`, `.charAt()` |
| Python| `len()`, `.find()`, `.replace()`, slicing |

---

## 🔷 3. Множества

### 🔹 Определение

**Множество** — абстрактный тип данных, представляющий **неупорядоченную** коллекцию **уникальных** элементов.

Примеры:
- `Set<Integer>` в Java
- `set` в Python

### 🔹 Размещение в памяти

- Часто реализуются через **хеш-таблицы** или **битовые маски**.
- В битовом представлении каждому возможному элементу соответствует 1 бит.

Пример (битовое множество):
- Диапазон 0–31: `int` как 32-битная маска.

### 🔹 Операции над множествами

- Объединение: `A ∪ B`
- Пересечение: `A ∩ B`
- Разность: `A \ B`
- Проверка принадлежности: `x ∈ A`

### 🔹 Процедуры и функции

| Операция          | Java              | Python           |
|-------------------|-------------------|------------------|
| Добавление        | `set.add(x)`      | `s.add(x)`       |
| Удаление          | `set.remove(x)`   | `s.remove(x)`    |
| Объединение       | `set1.addAll(set2)` | `s1 | s2`      |
| Пересечение       | `retainAll`       | `s1 & s2`         |
| Проверка элемента | `contains(x)`     | `x in s`         |

---

## 🧠 Заключение

- **Массивы** — упорядоченные и индексируемые.
- **Строки** — последовательности символов с особенностями хранения.
- **Множества** — коллекции уникальных значений с поддержкой теоретико-множественных операций.
- Глубокое понимание структур данных помогает эффективно управлять памятью и выполнять типовые операции с минимальными затратами.

---
