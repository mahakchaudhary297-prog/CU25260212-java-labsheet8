public class Labsheet8Q7 {
    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        display(123);
        display(45.67);
        display("Java Programming");
        display('A');
    }
}
