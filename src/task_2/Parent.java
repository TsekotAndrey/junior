package task_2;

public class Parent {
    private String name = null;
    private int age = 0;
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Parent with name " + name + " and age " + age;
    }
}

