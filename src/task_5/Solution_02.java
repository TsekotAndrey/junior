package task_5;
/**
 * Произведение 10 чисел
 *
 * Вывести на экран произведение 10 чисел от 1 до 10
 * Результат это 1 число.
 * Подсказка:
 * будет три миллиона с хвостиком.
 */
public class Solution_02 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum=sum*i;
            if (sum > 3000000)
            System.out.println(sum);
                }
    }
}