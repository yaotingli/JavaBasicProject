package GenericDemo.impl;

import GenericDemo.Generator;

public class GeneratorStringImpl implements Generator<String> {
    @Override
    public String method() {
        return "return str.";
    }
}
