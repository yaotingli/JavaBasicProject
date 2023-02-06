package GenericDemo;

public class Generic <K> {
    private K key;

    public Generic(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public static void main(String[] args) {
        Generic ddd = new Generic<String>("ddd");
        System.out.println(ddd.getKey());
    }
}
