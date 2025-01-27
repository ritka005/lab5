class Consonant {
    private char letter; // Переменная для хранения буквы

    // Конструктор для инициализации согласной буквы
    public Consonant(char letter) {
        this.letter = letter;
    }

    // Метод для получения согласной буквы
    public char getLetter() {
        return letter;
    }

    // Переопределение метода toString для удобного отображения буквы
    @Override
    public String toString() {
        return String.valueOf(letter);
    }
}