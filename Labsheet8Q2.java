class Result<T> {
    private T marks;

    public Result(T marks) {
        this.marks = marks;
    }

    public T getMarks() {
        return marks;
    }
}

public class Labsheet8Q2 {
    public static void main(String[] args) {
        Result<Integer> intResult = new Result<>(85);
        Result<Double> dblResult = new Result<>(92.5);

        System.out.println("Integer Marks: " + intResult.getMarks());
        System.out.println("Double Marks: " + dblResult.getMarks());
    }
}
