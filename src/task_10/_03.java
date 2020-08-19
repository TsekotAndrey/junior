package task_10;

public class _03 {
    public static void main(String args[]) {
        AAA b = new BBB();
        System.out.println("x = " + b.getResult(0, 1));
    }

}

class AAA {

     public int getResult(int a, int b) {
        return a + b + 2;
    }
}

class BBB extends AAA {

    public int getResult(int a, int b) {
        return a + b + 1;
    }
}
