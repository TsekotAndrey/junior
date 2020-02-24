package task_4;
/***
 * Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. Метод должен переводить
 * температуру и возвращать значение в градусах Фаренгейта.
 * Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
 * TC = (TF – 32) * 5/9.
 * Пример:
 * В метод convertCelsiumToFahrenheit на вход подается значение 41.
 * Пример вывода:
 * 105.8
 *
 *
 * Требования:
 * 1.	Метод convertCelsiumToFahrenheit(int) должен быть публичным и статическим.
 * 2.	Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
 * 3.	Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
 * 4.	Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.
 */
public class Solution_01 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }
    public static double convertCelsiumToFahrenheit(int celsium) {
        double Fahrenheit = 1.8 * celsium + 32;
        return Fahrenheit;
    }
}
