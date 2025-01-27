class Student {
    // Поля для фамилии и имени студента
    private String surname;
    private String name;

    // Конструктор для инициализации студента с фамилией и именем
    public Student(String surname, String name) {
        this.surname = surname; // Устанавливаем фамилию
        this.name = name; // Устанавливаем имя
    }

    // Метод для получения фамилии студента
    public String getSurname() {
        return surname; // Возвращаем фамилию
    }

    // Переопределение метода toString для удобного отображения информации о студенте
    @Override
    public String toString() {
        return surname + " " + name;
        // Возвращаем строку с фамилией и именем
    }
}