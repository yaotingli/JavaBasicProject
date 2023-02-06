package GenericDemo;

public class GenericUtils<T> {

    public T fun1(T t) {
        return t;
    }

    public static <E> E fun2(E e) {
        return e;
    }

    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer fun2 = GenericUtils.fun2(i);
        System.out.println(fun2.intValue());

        GenericUtils<String> ut = new GenericUtils<>();
        System.out.println(ut.fun1("fun1"));
    }
}
