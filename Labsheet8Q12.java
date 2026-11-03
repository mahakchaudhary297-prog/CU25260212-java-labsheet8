class Container<T> {
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class Labsheet8Q12 {
    public static void main(String[] args) {
        Container<Integer> c1 = new Container<>();
        c1.add(500);
        System.out.println("Integer Container: " + c1.get());

        Container<String> c2 = new Container<>();
        c2.add("Generics Container");
        System.out.println("String Container: " + c2.get());

        Container<Double> c3 = new Container<>();
        c3.add(3.14159);
        System.out.println("Double Container: " + c3.get());
    }
}
