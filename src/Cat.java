public class Cat implements Meowable {
    private String name; // Имя кота

    // Конструктор для инициализации имени кота
    public Cat(String name) {
        this.name = name;
    }

    // Реализация метода meow из интерфейса Meowable
    public void meow() {
        // Выводит имя кота и звук мяу
        System.out.println(name + ": мяу!");
    }

    // Переопределение метода toString для удобного отображения информации о коте
    @Override
    public String toString() {
        return "кот: " + name;
    }

    // Метод для получения имени кота, полезен для отслеживания мяуканий
    public String getName() {
        return name; // нужен для отслеживания мяуканий
    }
}

// Класс MeowCounter для подсчета мяуканий
class MeowCounter {
    // Счетчик мяуканий
    private int meowCount = 0;

    // Метод, принимающий массив Meowable и вызывает их метод meow
    public void makeThemMeow(Meowable[] meowables) {
        for (Meowable meowable : meowables) {
            // Вызов метода meow для каждого объекта
            meowable.meow();
            // Увеличиваем счетчик мяуканий
            meowCount++;
        }
    }

    // Метод для получения текущего количества мяуканий
    public int getMeowCount() {
        return meowCount;
    }
}
