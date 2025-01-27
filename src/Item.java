class Item {
    // Приватные поля, хранящие данные об элементе
    private String name; // Название элемента
    private int value; // Значение элемента

    // Конструктор класса Item, инициализирующий поля name и value
    public Item(String name, int value) {
        this.name = name; // Устанавливаем имя элемента
        this.value = value; // Устанавливаем значение элемента
    }

    // Метод для получения имени элемента
    public String getName() {
        return name;
    }

    // Метод для получения значения элемента
    public int getValue() {
        return value;
    }


    // Переопределение метода toString для красивого представления объекта при выводе
    @Override
    public String toString() {
        return "Item{name='" + name + "', value=" + value + "}";
    }
}