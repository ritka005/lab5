import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        //1 Задание
        System.out.println("Задание 1.1.");
        // Создание дробей
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction fraction3 = new Fraction(3, 4);

        // Вывод дробей
        System.out.println("Fraction 1: " + fraction1); // 1/2
        System.out.println("Fraction 2: " + fraction2); // 2/4
        System.out.println("Fraction 3: " + fraction3); // 3/4

        // Вывод значений дробей
        System.out.println("Value of Fraction 1: " + fraction1.getValue()); // 0.5
        System.out.println("Value of Fraction 2: " + fraction2.getValue()); // 0.5
        System.out.println("Value of Fraction 3: " + fraction3.getValue()); // 0.75

        // Сравнение дробей
        System.out.println("Fraction 1 equals Fraction 2: " + fraction1.equals(fraction2)); // true
        System.out.println("Fraction 1 equals Fraction 3: " + fraction1.equals(fraction3)); // false

        // Изменение числителя и вывод новой дроби и её значения
        fraction1.setNumerator(3);
        System.out.println("Updated Fraction 1: " + fraction1); // 3/2
        System.out.println("Value of Updated Fraction 1: " + fraction1.getValue()); // 1.5

        // Попытка установить знаменатель в ноль
        try {
            fraction2.setDenominator(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Знаменатель не может быть нулевым.
        }

        //2 Задание
        System.out.println("\nЗадание 2.1.");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Василиса");

        Meowable[] cats = { cat1, cat2 };

        MeowCounter counter = new MeowCounter();
        counter.makeThemMeow(cats);

        System.out.println("Количество мяуканий: " + counter.getMeowCount());

        //3 Задание
        System.out.println("\nЗадание 3.1.");
        // Создаем список объектов Item
        List<Item> list = new ArrayList<>();
        list.add(new Item("apple", 1));
        list.add(new Item("banana", 2));
        list.add(new Item("orange", 3));
        list.add(new Item("banana", 4));
        list.add(new Item("grape", 5));

        // Выводим исходный список
        System.out.println("Исходный список: " + list);

        // Элемент, который нужно удалить
        Item itemToRemove = new Item("banana", 2);

        // Удаляем все вхождения элемента
        RemoveElements.removeElement(list, itemToRemove);

        // Выводим измененный список
        System.out.println("Список после удаления элемента " + itemToRemove + ": " + list);

        //4 Задание
        System.out.println("\nЗадание 4.1.");

        Map<String, Integer> surnameCount = new HashMap<>();
        String filePath = "C:\\Users\\HUAWEI\\OneDrive\\Desktop\\students.txt"; // Укажите путь к вашему файлу

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length != 2) {
                    System.out.println("Некорректный ввод, строка пропущена: " + line);
                    continue;
                }
                String surname = parts[0];
                String name = parts[1];

                Student student = new Student(surname, name);
                surnameCount.put(surname, surnameCount.getOrDefault(surname, 0) + 1);

                // Генерация логина
                String login;
                int count = surnameCount.get(surname);
                if (count == 1) {
                    login = surname;
                } else {
                    login = surname + count;
                }

                // Печатаем логин
                System.out.println("Сгенерированный логин: " + login);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        //5 Задание
        System.out.println("\nЗадание 5.1.");
        String filePath2 = "C:\\Users\\HUAWEI\\OneDrive\\Desktop\\text.txt";
        Set<Consonant> consonantsSet = new TreeSet<>((c1, c2) -> Character.compare(c1.getLetter(), c2.getLetter()));

        // Звонкие согласные для вашего языка
        String VOICED_CONSONANTS = "aeiouy";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath2), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+"); // Разбиваем строку на слова
                for (String word : words) {
                    for (char c : word.toCharArray()) {
                        if (VOICED_CONSONANTS.indexOf(c) != -1) {
                            System.out.println("Найдена звонкая согласная: " + c); // Отладочное сообщение
                            consonantsSet.add(new Consonant(c));
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Печатаем все звонкие согласные в алфавитном порядке
        System.out.println("Звонкие согласные буквы в алфавитном порядке:");
        if (consonantsSet.isEmpty()) {
            System.out.println("Звонкие согласные не найдены.");
        } else {
            for (Consonant consonant : consonantsSet) {
                System.out.println(consonant);
            }
        }


        //6 Задание
        System.out.println("\nЗадание 6.1.");

        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(new Node(1));
        myQueue.enqueue(new Node(2));
        myQueue.enqueue(new Node(3));
        myQueue.enqueue(new Node(4));

        System.out.println("Элементы очереди в обратном порядке:");
        myQueue.printReverse();

        //8 Задание
        System.out.println("\nЗадание 7.2.");

        String filePath3 = "C:\\Users\\HUAWEI\\OneDrive\\Desktop\\people.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<Person> people = br.lines()
                    .map(line -> line.split(":"))
                    .filter(arr -> arr.length == 2 && !arr[0].isEmpty() && !arr[1].isEmpty())
                    .map(arr -> new Person(formatName(arr[0]), Integer.parseInt(arr[1])))
                    .toList();

            Map<Integer, List<Person>> groupedPeople = people.stream()
                    .filter(person -> person.getNumber() != null)
                    .collect(Collectors.groupingBy(Person::getNumber));

            System.out.println(groupedPeople);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}