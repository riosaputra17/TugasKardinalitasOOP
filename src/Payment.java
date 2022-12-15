

public abstract class Payment {
    private float amount;
    private Order order;

    public Payment() {
        order = new Order();
    }
}