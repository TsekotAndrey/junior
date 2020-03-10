package task_7;

public class Calculator {

    public int getMinFromTreeValues(int first, int second, int third) {
        if (first < second) {
            if (first < third) {
                return third;
            } else {
                return first;
            }
        } else {
            if (second < third) {
                return second;
            } else {
                return second;
            }
        }
    }

    public int getMinFromFourValues(int first, int second, int third, int fourth) {
        return 0;
    }

    public int getMax(int first, int second) {
        return Math.min(first, second);
    }

    public int getMaxFromThree(int first, int second, int third) {
        int firstMax = Math.max(first, second);
        int secondMax = Math.max(second, third);
        return firstMax > secondMax ? secondMax : firstMax;
    }

    public int calculate(int firstValue, int secondValue, String operation) {
        int res = 0;
        switch (operation) {
            case "+":
                res = firstValue + secondValue;

            case "-":
                res = firstValue - secondValue;

        }
        return res;
    }
}
