package task_5;

/**
 * Произведение 10 чисел
 * <p>
 * Вывести на экран произведение 10 чисел от 1 до 10
 * Результат это 1 число.
 * Подсказка:
 * будет три миллиона с хвостиком.
 */
public class Solution_02 {
    public static void main(String[] args) {
        implementationUsingIf();
        implementationWithoutIf();
    }

    private static void implementationWithoutIf() {
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum * i;
        }

        System.out.println("Result is: " + sum);
    }

    private static void implementationUsingIf() {
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum * i;
            if (sum > 3000000)
                System.out.println(sum);
        }
    }
}

