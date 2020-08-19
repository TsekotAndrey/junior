package task_10;

public class _08 {

    public static int y;

    public static void main(String[] args) {

        bar(7);
        foo(8);

        System.out.println(y);
    }


    public static void foo(int x) {
        System.out.print("foo ");
        y = x;
    }

    public static void bar(int z) {
        System.out.print("bar ");
        y = z;
    }
}
