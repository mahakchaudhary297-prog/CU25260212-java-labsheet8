class Pair<T, U> {
    private T employeeId;
    private U employeeName;

    public Pair(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName);
    }
}

public class Labsheet8Q4 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1001, "Alice Smith");
        pair.display();
    }
}
