package task_6;

/**
 * Найти ошибку и исправить.
 */

public class Solution_03 {
    public static void main(String[] args) {
        Cat3 masik = new Cat3("Masik", "8");
        System.out.println("Cat name is: " + masik.getCatName());
        System.out.println("Cat age is: " + masik.getCatAge());
    }
}

class Cat3 {
    private String catName;
    private String catAge;
    private String ageCat;
    private String nameCat;

    public Cat3(String name, String age) {
        catName = name;
        catAge = age;
    }

    public String getCatName() {
        return nameCat;
    }

    public String getCatAge() {
        return ageCat;
    }
}

