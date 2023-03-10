package interfaceDemo;

public interface CalculateService {

    public final static int DEFAULT_VALUE = 0;

    /**
     * 加法
     *
     * @return 值
     */
    int add(int a, int b);

    /**
     * 接口中定义默认方法实现
     *
     * @return 值
     */
    default int sub(int a, int b) {
        return a - b;
    }
}
