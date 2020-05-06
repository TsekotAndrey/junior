package task_1;
public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Result="+calculator.plus(0, 1));
        System.out.println("Result="+calculator.minus(10, 8));
        System.out.println("Result="+calculator.multiple(3, 1));
        System.out.println("Result="+calculator.divide(12, 3));
    }
}
