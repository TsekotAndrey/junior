package task_7;

/***
 *
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Expected:  5. Actual: " + calculator.getMinFromTreeValues(28, 8, 5)); // Найти ошибку и исправить
        System.out.println("Expected:  5. Actual: " + calculator.getMinFromFourValues(28, 8, 5, 7)); // Реализовать
        System.out.println("Expected:  5. Actual: " + calculator.getMax(1, 5)); // Найти ошибку и исправить
        System.out.println("Expected:  5. Actual: " + calculator.getMaxFromThree(1, 2, 5)); // Найти ошибку и исправить
        System.out.println("Expected:  3. Actual: " + calculator.calculate(1, 2, "+")); // Найти ошибку и исправить
        System.out.println("Expected:  3. Actual: " + calculator.calculate(1, 2, "*")); // Найти ошибку и исправить
        System.out.println("Expected:  3. Actual: " + calculator.calculate(1, 2, "/")); // Найти ошибку и исправить


    }
}


