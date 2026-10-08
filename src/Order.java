public class Order {
    private int number;
    private String date;
    private String customer;
    private String products;
    private double totalSum;
    private String status;
    private String payment;
    private String delivery;

    public Order() {
    }

    public Order(int number, String date, String customer,
                 String products, double totalSum, String status,
                 String payment, String delivery) {
        this.number = number;
        this.date = date;
        this.customer = customer;
        this.products = products;
        this.totalSum = totalSum;
        this.status = status;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void createOrder() {
    }

    public void calculateSum() {
    }

    public void changeStatus() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", customer='" + customer + '\'' +
                ", products='" + products + '\'' +
                ", totalSum=" + totalSum +
                ", status='" + status + '\'' +
                ", payment='" + payment + '\'' +
                ", delivery='" + delivery + '\'' +
                '}';
    }
}
