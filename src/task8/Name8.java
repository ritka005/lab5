package task8;

public class Name8 {
    // Метод для приведения строки к формату с заглавной буквой
    public static String right(String name) {
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
    }
}
