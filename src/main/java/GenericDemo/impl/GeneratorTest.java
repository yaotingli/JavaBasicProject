package GenericDemo.impl;

import GenericDemo.Generator;

public class GeneratorTest {

    public static void main(String[] args) {
        Generator integerGenerator = new GeneratorImpl<>();
        integerGenerator.method();

        Generator stringGenerator = new GeneratorStringImpl();
        System.out.println(stringGenerator.method());
    }
}
