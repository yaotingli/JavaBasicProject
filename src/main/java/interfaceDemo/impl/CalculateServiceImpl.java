package interfaceDemo.impl;

import interfaceDemo.CalculateService;

public class CalculateServiceImpl implements CalculateService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
