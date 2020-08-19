package task_10;

public class _14 {
    public static void main(String[] args) {
//        Man man = new Man();
//        man.run();

//        Man superMan = new SuperMan();
//        superMan.run();

//        Runnable runner = new SuperMan();
//        runner.run();

//        Runnable runner = new Man();
//        runner.run();

//        Runnable runner = new Runnable();
//        runner.run();

//        Man runner = new SuperMan();
//        runner.run();
    }
}

interface Runnable {
    void run();
}

class Man implements Runnable {

    public void run() {
        System.out.println("running");
    }
}

class SuperMan extends Man {

    public void run() {
        System.out.println("super fast running");
    }
}
