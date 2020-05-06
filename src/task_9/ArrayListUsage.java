package task_9;

import java.util.ArrayList;

public class ArrayListUsage {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Petr");
        strings.add("Petrenko");
        strings.add("Sidorenko");
        strings.add("Pet");

        String value = getValueByIndex(2, strings);
        System.out.println("Expected: Sidorenko. Actual: " + value);

        String longestString = getTheLongestString(strings);
        System.out.println("Expected: Sidorenko .Actual: " + longestString);

        deleteAllStringsWhichStartFrom("P", strings);
        System.out.println("Expected: [Sidorenko]. Actual: " + strings);

        boolean response = listContains("Sidorenko", strings);
        System.out.println("Expected: true. Actual: " + response);

        boolean response2 = listContains("Petrenko", strings);
        System.out.println("Expected: false. Actual: " + response2);

        addToList("Fedor", strings);
        System.out.println("Expected: [Sidorenko, Fedor]. Actual: " + strings);
    }

    private static String getValueByIndex(int index, ArrayList<String> strings) {
        return "";
    }

    private static void addToList(String str, ArrayList<String> strings) {

    }

    private static boolean listContains(String str, ArrayList<String> strings) {
        return false;
    }

    private static void deleteAllStringsWhichStartFrom(String letter, ArrayList<String> strings) {

    }

    private static String getTheLongestString(ArrayList<String> strings) {

        return "";
    }
}
