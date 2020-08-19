package task_10;

public class _05 {

    public static void main(String[] args) {
        int count = 0;
        boolean[] b = new boolean[3];

        b[0] = true;
        b[2] = true;



        if (b[1] && b[2]) count += 7;

        if (b[1] || b[2]) count += 3;

        if (b[0] && b[1] || b[2]) count++;

        System.out.println("count = " + count);
    }
}
