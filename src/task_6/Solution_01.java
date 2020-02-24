package task_6;

/**
 * Найти ошибку и исправить.
 */

public class Solution_01 {
    public static void main(String[] args) {
        Cat1 masik = new Cat1("Masik", "8");
        System.out.println("Cat name is: " + masik.catName);
        System.out.println("Cat age is: " + masik.catAge);
    }
}

class Cat1 {
    String catName;
    String catAge;

    public Cat1(String age, String name) {
        catName = name;
        catAge = age;
    }
}

