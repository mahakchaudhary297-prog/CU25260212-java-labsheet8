import java.util.ArrayList;

public class Labsheet8Q14 {
    public static <T> void displayList(ArrayList<T> list) {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("C++");

        displayList(intList);
        displayList(strList);
    }
}
