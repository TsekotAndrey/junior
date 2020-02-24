package task_2;

public class App {
    public static void main(String[] args) {
        Parent bob = new Parent("Bob", 23);
        System.out.println(bob.toString());
        // please fix behaviour of method System.out.println
        // current implementation prints task_2.Parent@1540e19d
        // I would like to see the result of printing as 'Parent with name Bob and age 23'
    }
}
