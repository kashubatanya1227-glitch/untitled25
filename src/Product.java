public class Product {
    private int id;
    private String name;
    private String description;
    private String manufacturer;
    private double price;
    private int quantity;
    private String characteristics;

    public Product() {
    }

    public Product(int id, String name, String description,
                   String manufacturer, double price,
                   int quantity, String characteristics) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
        this.characteristics = characteristics;
    }

    public void viewInformation() {
    }

    public void checkAvailability() {
    }

    public void changeData() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", characteristics='" + characteristics + '\'' +
                '}';
    }
}
