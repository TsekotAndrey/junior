package task_10;
public class _09 {
    public static void main(String[] args) {
        f(2);
        d(2);
    }

    private static void f(int i) {
        switch (i) {
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }
    }

    private static void d(int i) {
        switch (i) {
            case 2:
                System.out.println(2);
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
            case 3:
                System.out.println(3);
        }
    }
}
