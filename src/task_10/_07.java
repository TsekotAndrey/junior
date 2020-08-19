package task_10;

public class _07 {
    public static void main(String[] args) {
        try {
            func();
        } catch (Exception e) {
            System.out.print("exception ");
        }
        System.out.print("finished");
    }

    private static void func() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.print("finally ");
        }
    }
}



