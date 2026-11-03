import java.util.ArrayList;

class Student15<T, U, V> {
    private T id;
    private U name;
    private V marks;

    public Student15(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public U getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Labsheet8Q15 {
    public static void main(String[] args) {
        ArrayList<Student15<Integer, String, Double>> students = new ArrayList<>();
        students.add(new Student15<>(1, "Alice", 85.5));
        students.add(new Student15<>(2, "Bob", 90.0));
        students.add(new Student15<>(3, "Charlie", 78.5));
        students.add(new Student15<>(4, "Diana", 92.0));
        students.add(new Student15<>(5, "Ethan", 88.0));

        System.out.println("All Students:");
        for (Student15<Integer, String, Double> s : students) {
            s.display();
        }

        System.out.println("Total number of students: " + students.size());

        String searchName = "Charlie";
        boolean found = false;
        for (Student15<Integer, String, Double> s : students) {
            if (s.getName().equals(searchName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student " + searchName + " found.");
        } else {
            System.out.println("Student " + searchName + " not found.");
        }

        System.out.println("Type safety ensured at compile time via generics.");
    }
}
