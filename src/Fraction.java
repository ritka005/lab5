import java.util.Objects;
// Интерфейс для дробей
public class Fraction implements FractionInterface {
    private int numerator; // Числитель
    private int denominator; // Знаменатель
    private Double cachedValue; // Кэш для значения дроби

    // Конструктор для инициализации дроби
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулевым.");
        }
        // Убираем знак минус из знаменателя
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    // Метод для получения значения дроби
    @Override
    public double getValue() {
        if (cachedValue == null) {
            cachedValue = (double) numerator / denominator;
        }
        return cachedValue;
    }

    // Метод для установки числителя
    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        cachedValue = null; // Сбрасываем кеш
    }

    // Метод для установки знаменателя
    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулевым.");
        }
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.denominator = denominator;
        }
        cachedValue = null; // Сбрасываем кеш
    }

    // Переопределение метода toString для вывода дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Переопределение метода equals для сравнения дробей
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }

    // Переопределение хэш-кода
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}