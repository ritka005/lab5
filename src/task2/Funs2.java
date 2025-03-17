package task2;
import java.util.List;

public class Funs2 {
    public static void meowsCare(List<Meowable2> meowables) {
        for (Meowable2 meowable : meowables) {
            meowable.meow();
        }
    }
}