package equalsDemo;

public class EqualsTest {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println(a == b);

        Integer aa = new Integer(0);
        Integer bb = new Integer(0);
        System.out.println(aa.equals(bb));
    }
}
