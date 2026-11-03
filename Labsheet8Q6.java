class Employee<T, U> {
    private T employeeId;
    private U employeeName;

    public Employee(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName);
    }
}

public class Labsheet8Q6 {
    public static void main(String[] args) {
        Employee<Integer, String> emp = new Employee<>(501, "Bob Jones");
        emp.display();
    }
}
