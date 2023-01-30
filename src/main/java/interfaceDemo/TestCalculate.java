package interfaceDemo;

import interfaceDemo.impl.CalculateServiceImpl;

public class TestCalculate {
    public static void main(String[] args) {
        CalculateService cal = new CalculateServiceImpl();

        int addResult = cal.add(1, 2);
        System.out.println(addResult);

        int subResult = cal.sub(2, 1);
        System.out.println(subResult);
    }
}
