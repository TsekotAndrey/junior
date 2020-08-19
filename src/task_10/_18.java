package task_10;

public class _18 {
    public static void main(String[] args) {

        Rabbit one = new Rabbit(1);
        Rabbit two = new Rabbit(2);

        Rabbit three = one;
//
//        one.run();
//        two.run();
//        three.run();

        one = null;

        one.run();
        two.run();
        three.run();
    }
}

class Rabbit {
    private int id;

    public Rabbit(int id) {
        this.id = id;
    }

    void run() {
        System.out.println(id + " is running");
    }
}
