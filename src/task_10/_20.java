package task_10;

import java.util.ArrayList;
import java.util.List;

public class _20 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(14);

        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }
    }
}
