package task_3;
public class Cat extends Animal{
    public String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("My name is: Animal with name " + name);
        //  @Override
        // public String toString() {
        //     return "1My name is: Cat with name " + name;/
        //  }
        //cat.printName(); //fix to see the result as 'My name is: Cat with name Masik'
    }
}