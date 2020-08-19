package task_10;

public class _16 {
    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();

        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}

class WaterBottle {
    public String brand;
    public boolean empty;
}

