package GenericDemo.impl;

import GenericDemo.Generator;

public class GeneratorImpl<T> implements Generator<T> {
    @Override
    public T method() {
        System.out.println("return T");
        return null;
    }
}
