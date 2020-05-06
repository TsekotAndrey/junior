package task_9;

import java.util.ArrayList;
import java.util.HashSet;

public class HasSetUsage {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<String>();
        strings.add("Petrenko");
        strings.add("Sidorenko");
        strings.add("Petr");
        strings.add("Petr");

        int size = getSizeOfSet(strings);
        System.out.println("Expected: 3. Actual: " + size);

        String firstValueInSet = getFirstValue(strings);
        System.out.println("Expected: [Sidorenko] .Actual: " + firstValueInSet);

        ArrayList<String> list = getAllStringsWhichStartFrom("P", strings);
        System.out.println("Expected: [Petr, Petrenko]. Actual: " + list);

        boolean response = listContains("Sidorenko", strings);
        System.out.println("Expected: true. Actual: " + response);

        addToSet("Fedor", strings);
        System.out.println("Expected: [Fedor, Sidorenko, Petr, Petrenko]. Actual: " + strings);

        addToSet("Petr", strings);
        System.out.println("Expected: [Fedor, Sidorenko, Petr, Petrenko]. Actual: " + strings);
    }

    // to implement this method read about iterator in HashSet.
    //https://beginnersbook.com/2014/08/how-to-iterate-over-a-sethashset/
    //https://stackoverflow.com/questions/12455737/how-to-iterate-over-a-set-hashset-without-an-iterator
    private static String getFirstValue(HashSet<String> strings) {
      return "";
    }

    private static int getSizeOfSet(HashSet<String> strings) {
        return 0;
    }

    private static void addToSet(String str, HashSet<String> strings) {

    }

    private static boolean listContains(String str, HashSet<String> strings) {
        return false;
    }

    private static ArrayList<String> getAllStringsWhichStartFrom(String letter, HashSet<String> strings) {
        return null;
    }
}
