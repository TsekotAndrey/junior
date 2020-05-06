package task_9;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> salaryMap = new HashMap<String, Integer>();
        salaryMap.put("Semen", 30);
        salaryMap.put("Petr", 35);
        salaryMap.put("Alex", 20);
        salaryMap.put("Vano", 15);
        salaryMap.put("Semen", 25);


        Integer salaryAlex = getSalaryFromMapByName("Alex", salaryMap);
        System.out.println("Expected: 20. Actual: " + salaryAlex);

        Integer salarySemen = getSalaryFromMapByName("Semen", salaryMap);
        System.out.println("Expected: 25. Actual: " + salarySemen);

        boolean result = doWeHaveSalaryForUserWithName("Dimon", salaryMap);
        System.out.println("Expected: false. Actual: " + result);

        boolean result2 = doWeHaveSalary(20, salaryMap);
        System.out.println("Expected: true. Actual: " + result2);

        // advance topic and not required

        Integer result3 = howManyPersonDoWeHaveWithSalaryBiggerThan(15, salaryMap);
        System.out.println("Expected: 3. Actual: " + result3);

        HashMap<String, ArrayList<String>> automobilesMap = new HashMap<>();

        ArrayList<String> alexList = new ArrayList<>();
        alexList.add("BMV");
        alexList.add("AUDI");
        automobilesMap.put("Alex", alexList);

        ArrayList<String> dimonList = new ArrayList<>();
        dimonList.add("ЖИГА");
        dimonList.add("МЕРС");
        automobilesMap.put("Dimon", dimonList);

        System.out.println(automobilesMap);

        addNewPersonWithAutomobList("Vadim", "MAZDA", "NISSAN");
        System.out.println("Excpeted: {Alex=[BMV, AUDI], Dimon=[ЖИГА, МЕРС], Vadim=[MAZDA,NISSAN]}. Actual: " + automobilesMap);


        ArrayList<String> list = getAutomobListByName("Alex", automobilesMap);
        System.out.println("Expected: [BMV, AUDI]. Actual: " + list);
    }

    private static ArrayList<String> getAutomobListByName(String name, HashMap<String, ArrayList<String>> automobilesMap) {
        return null;
    }

    private static void addNewPersonWithAutomobList(String name, String firstAuto, String secondAuto) {

    }

    private static boolean doWeHaveSalary(Integer salary, HashMap<String, Integer> salaryMap) {
        return false;
    }

    private static boolean doWeHaveSalaryForUserWithName(String name, HashMap<String, Integer> salaryMap) {
        return false;
    }

    private static Integer getSalaryFromMapByName(String name, HashMap<String, Integer> salaryMap) {
        return 0;
    }

    private static Integer howManyPersonDoWeHaveWithSalaryBiggerThan(int salary, HashMap<String, Integer> salaryMap) {
        return 0;
    }
}
