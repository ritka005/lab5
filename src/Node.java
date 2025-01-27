class Node {
    // Поле для хранения данных узла
    private int data;

    // Конструктор, инициализирующий узел с заданным значением
    public Node(int data) {
        this.data = data;
    }

    // Переопределение метода toString для представления узла как строки
    @Override
    public String toString() {
        // Возвращаем строковое представление данных узла
        return String.valueOf(data);
    }

    // Метод для получения значения данных узла
    public int getData() {
        // Возвращаем значение поля data
        return data;
    }
}