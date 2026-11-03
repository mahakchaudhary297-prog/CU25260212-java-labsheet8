public class Labsheet8Q8 {
    public static <T> void displayThree(T a, T b, T c) {
        System.out.println(a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        displayThree(1, 2, 3);
        displayThree("Apple", "Banana", "Cherry");
        displayThree(1.1, 2.2, 3.3);
    }
}
