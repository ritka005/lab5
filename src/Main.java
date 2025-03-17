import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
import task1.Fraction1;
import task2.Cat2;
import task2.Meowable2;
import task2.Funs2;
import task7.Point7;
import task7.Polyline7;
import task8.Name8;

public class Main {
    public static void main(String[] args) {
        //задание 1
        Fraction1 f1 = new Fraction1(1, 2);
        Fraction1 f2 = new Fraction1(-5, 2);
        Fraction1 f3 = new Fraction1(4, 5);
        System.out.println("Задание 1\nСоздание класса Дробь и добавление " +
                "двух методов: получение вещ. значения и " +
                "установки числ. и знам.\nДробь 1: " + f1 + "\nДробь 2: " + f2 + "\nДробь 3: " + f3 +
                "\nЗначение дроби 1 в вещественном виде: " + f1.getValue() +
                "\nЗначение дроби 2 в вещественном виде: " + f2.getValue() +
                "\nЗначение дроби 3 в вещественном виде: " + f3.getValue());
        f1.setFraction(3,5);
        System.out.println("Изменение дроби 1, числитель = 3, знаменатель = 5: " + f1);
        f1.setFraction(3,-5);
        System.out.println("Изменение дроби 1, числитель = 3, знаменатель = -5: " + f1 +
                "\nИзменение дроби 1, числитель = 3, знаменатель = 0");


        //задание 2
        Cat2 cat = new Cat2("Барсик");
        System.out.println("\nЗадание 2\nКоличество мяуканий");
        List<Meowable2> m = List.of(cat, cat, cat);
        Funs2.meowsCare(m);
        System.out.println("\nКот мяукал " +
                cat.getMeowCount()+ " раз(а)");

        //Задание 7
        Point7[] points = {
                new Point7(1, -1),
                new Point7(1, 1),
                new Point7(1, 2),
                new Point7(2, 3),
                new Point7(2, -2),
                new Point7(3, 4),
                new Point7(2, 3)
        };
        Polyline7 polyline = new Polyline7(Arrays.stream(points)
                .map(p -> new Point7(p.getX(), Math.abs(p.getY())))
                .distinct()
                .sorted(Comparator.comparingDouble(Point7::getX))
                .toArray(Point7[]::new));
        System.out.println("\nЗадание 7.1\nДан набор объектов типа Point: \n" +
                Arrays.toString(points) +
                "\nнеобходимо взять все Point в разных координатах," +
                "\nубрать с одинаковыми X,Y, отсортировать по X," +
                "\nотрицательные Y сделать положительными и собрать" +
                "\nэто все в ломаную (объект типа Polyline)\nРезультат: " + polyline);

        //Задание 8

        String file1 = "C:\\Users\\HUAWEI\\IdeaProjects\\lab5\\src\\file.txt";
        System.out.println("\nЗадание 7.2\nДан текстовый файл:");
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Все имена привести " +
                "к нижнему регистру, но с первой буквой в верхнем регистре," +
                "\nубрать из перечня всех людей без номеров, а имена оставшихся " +
                "\nсгруппировать по их номеру\nРезультат:");
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            Map<Integer, List<String>> groupedNames = br.lines()
                    .map(line -> line.split(":")) // Разделяем имя и номер
                    .filter(parts -> parts.length == 2 && !parts[1].trim().isEmpty()) // Убираем недопустимые строки
                    .collect(Collectors.groupingBy(
                            parts -> Integer.parseInt(parts[1].trim()), // Группируем по номеру
                            Collectors.mapping(
                                    parts -> Name8.right(parts[0].trim()), // Приводим к нужному регистру
                                    Collectors.toList() // Собираем в список
                            )
                    ));
            System.out.println(groupedNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}