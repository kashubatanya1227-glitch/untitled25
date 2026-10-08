public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName,
                    String phone, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public void register() {
    }

    public void login() {
    }

    public void viewProducts() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}