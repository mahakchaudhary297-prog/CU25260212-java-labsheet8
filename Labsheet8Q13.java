class Student13<T, U, V> {
    private T id;
    private U name;
    private V marks;

    public Student13(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Labsheet8Q13 {
    public static void main(String[] args) {
        Student13<Integer, String, Double> s1 = new Student13<>(1, "John", 88.5);
        Student13<String, String, Integer> s2 = new Student13<>("S02", "Emma", 95);
        Student13<Integer, String, Float> s3 = new Student13<>(3, "Alex", 76.4f);

        s1.display();
        s2.display();
        s3.display();
    }
}
