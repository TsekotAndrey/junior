package task_10;

public class _10 {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        addToInt(a, 15);

        b = plus(b, 10);

        System.out.println(a);

        System.out.println(b);
    }

    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }


    public static int plus(int x, int amountToAdd) {
        return x + amountToAdd;
    }

}

