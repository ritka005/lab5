import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Класс для реализации очереди с поддержкой вывода в обратном порядке
class MyQueue {
    // Очередь для хранения узлов
    private Queue<Node> queue;

    // Конструктор, инициализирующий пустую очередь
    public MyQueue() {
        this.queue = new LinkedList<>();
    }

    // Метод для добавления узла в очередь
    public void enqueue(Node node) {
        queue.add(node);
    }

    // Метод для печати элементов очереди в обратном порядке
    public void printReverse() {
        // Временный стек для переворота очереди
        Stack<Node> stack = new Stack<>();

        // Переносим элементы из очереди в стек
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Печатаем элементы из стека, что дает нам обратный порядок
        while (!stack.isEmpty()) {
            // Извлекаем узел из стека и печатаем его
            System.out.print(stack.pop() + " ");
        }
        // Печатаем перевод строки после вывода всех узлов
        System.out.println();
    }
}