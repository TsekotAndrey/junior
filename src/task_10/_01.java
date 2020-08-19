package task_10;

public class _01 {
    public static void main(String args[]) {
        B b = new B();
        int result = b.getResult(0, 1);
        System.out.println("x = " + result);
    }
}

class A {

    public int getResult(int a, int b) {
        return a + b + 2;
    }
}

class B extends A {

    public int getResult(int a, int b) {
        return a + b + 1;
    }
}
