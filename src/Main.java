public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                1,
                "Ліна",
                "Кравченко",
                "+380991234567",
                "kravlin45@gmail.com",
                "Одеса"
        );

        Product product = new Product(
                101,
                "Смартфон Samsung Galaxy",
                "Сучасний смартфон",
                "Samsung",
                25999.99,
                15,
                "256 GB, 8 GB RAM"
        );

        Order order = new Order(
                1001,
                "08.10.2026",
                "Ліна Кравченко",
                "Samsung Galaxy",
                25999.99,
                "Нове",
                "Картка",
                "Нова пошта"
        );

        System.out.println(customer.toString());
        System.out.println(product.toString());
        System.out.println(order.toString());
    }
}
