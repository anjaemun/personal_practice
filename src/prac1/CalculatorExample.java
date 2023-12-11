package prac1;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.powerOn();

        int result1 = cal.plus(4, 3);
        System.out.println("4 + 3 = " + result1);

        int x = 6, y = 3;
        double result2 = cal.divide(x, y);
        System.out.println(x + " / " + y + " = " + result2);

        cal.powerOff();
    }
}

