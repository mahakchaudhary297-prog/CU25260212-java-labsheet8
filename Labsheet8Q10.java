import java.util.ArrayList;

public class Labsheet8Q10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Eve");

        System.out.println("Element at index 1: " + names.get(1));
        
        names.set(1, "Bobby");
        System.out.println("After set at index 1: " + names.get(1));
        
        names.remove("Eve");
        System.out.println("Size after removal: " + names.size());
    }
}
