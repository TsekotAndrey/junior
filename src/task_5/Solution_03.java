package task_5;
/**
 Таблица умножения
 Выведи на экран таблицу умножения 10 на 10 в следующем виде:
 1 2 3 …
 2 4 6 …
 3 6 9 …
 …
 */
public class Solution_03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a<=10){
            while (b<=10){
                System.out.print( a * b + "" );
                b++;
            }
            System.out.println("");
            a++;
            b=1;
        }
    }
}
