class Product<T, U> {
    private T productId;
    private U productPrice;

    public Product(T productId, U productPrice) {
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public void display() {
        System.out.println("Product ID: " + productId + ", Price: " + productPrice);
    }
}

public class Labsheet8Q5 {
    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 450.50);
        Product<String, Double> p2 = new Product<>("P002", 1200.00);
        Product<Integer, Integer> p3 = new Product<>(103, 99);

        p1.display();
        p2.display();
        p3.display();
    }
}
