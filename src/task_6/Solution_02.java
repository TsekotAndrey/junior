package task_6;

/**
 * Найти ошибку и исправить.
 */

public class Solution_02 {
    public static void main(String[] args) {
        Cat2 masik = new Cat2("Masik", "8");
        System.out.println("Cat name is: " + masik.getCatName());
        System.out.println("Cat age is: " + masik.getCatAge());
    }
}

class Cat2 {
    private String catName;
    private String catAge;

    public Cat2(String name, String age) {
        catName = name;
        catAge = age;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatAge() {
        return catAge;
    }
}

