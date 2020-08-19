package task_10;

public class _15 {
    public static void main(String[] args) {
        new Zoo();
    }
}

class Zoo {

    public Zoo() {
        this(10);
        System.out.println("empty");
    }

    public Zoo(int value) {
        System.out.println("value : " + value);
    }

    public Zoo(int value, int two) {
        System.out.println("value : " + value);
    }

}
