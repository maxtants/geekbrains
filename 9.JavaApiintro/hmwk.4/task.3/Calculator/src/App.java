import java.util.ArrayDeque;

public class App {
   // static ArrayDeque<Integer> results = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        System.out.println(calculate('+', 3, 7));
        System.out.println(calculate('+', 4, 7));
        // results.removeLast();
        // System.out.println(results);
        // System.out.println(results.getLast());
        System.out.println(calculate('<', 0, 0));
    }

    public static int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                results.add(result);
                break;
            case '-':
                result = a - b;
                results.add(result);
                break;
            case '*':
                result = a * b;
                results.add(result);
                break;
            case '/':
                result = a / b;
                results.add(result);
                break;
            case '<':
                results.removeLast();
                result = results.getLast();
                break;
            default:
                break;
        }

        return result;
    }
}
