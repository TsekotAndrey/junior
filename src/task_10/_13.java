package task_10;

public class _13 {
    public static void main(String[] args) {
        DD deer = new DD(5);
    }
}

class DD extends RR {

    public DD() {
        System.out.print("DD");
    }

    public DD(int age) {
        System.out.print("DD + " + age);
    }
}

class RR {

    public RR() {
        System.out.println("RR");
    }
}

