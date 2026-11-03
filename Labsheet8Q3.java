class Student<T> {
    private T id;

    public Student(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}

public class Labsheet8Q3 {
    public static void main(String[] args) {
        Student<Integer> student = new Student<>(101);
        System.out.println("Student ID: " + student.getId());
    }
}
