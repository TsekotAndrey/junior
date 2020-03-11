package task_7;
public class Calculator {
    public int getMinFromTreeValues(int first, int second, int third) {
        if (first < second) {
            if (first < third) {
                return first;
            } else {
                return second;
            }
        } else {
            if (second < third) {
                return second;
            } else {
                return third;
            }
        }
    }
    public int getMinFromFourValues(int first, int second, int third, int fourth) {
        if (first < second) {
            if (first < third)
                if (first < fourth) {
                    return first;
                } else {
                    return second;
                }
        } else {
            if (second < third) {
                if (second < fourth)
                return second;
            } else {
                return third;
            }
            if (third < fourth) {
                return third;
            } else {
                return fourth;
            }
        }
        return 0;
    }


    public int getMax(int first, int second) {
        return Math.max(first, second);
    }

    public int getMaxFromThree(int first, int second, int third) {
        int firstMax = Math.max(first, second);
        int secondMax = Math.max(second, third);
        return Math.max(firstMax, secondMax);
    }
    public int calculate(int firstValue, int secondValue, String operation) {
        int res = 0;
        switch (operation) {

            case "+":
                res = firstValue + secondValue;
                break;
            case "*":
                res = firstValue * secondValue;
                break;
            case "/":
                res = firstValue / secondValue;
                break;
        }
        return res;
    }
}
