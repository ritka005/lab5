class Person {
    private String name; // Поле для хранения имени человека
    private Integer number; // Поле для хранения номера

    // Конструктор, инициализирующий человека с заданными именем и номером
    public Person(String name, Integer number) {
        this.name = name; // Инициализация имени
        this.number = number; // Инициализация номера
    }

    // Метод для получения имени человека
    public String getName() {
        // Возвращаем значение поля name
        return name;
    }

    public Integer getNumber() {
        return number;
        // Возвращаем значение поля number
    }

    // Переопределение метода toString для представления человека как строки
    @Override
    public String toString() {
        // Возвращаем только имя для строкового представления
        return name;
    }
}