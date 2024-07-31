public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();

        Product laptop = new Product(1, "Laptop", 10, 50000.00);
        Product smartphone = new Product(2, "Smartphone", 20, 15000.00);
        Product keyboard = new Product(3, "KeyBoard", 5, 1000.00);
        Product mouse = new Product(4, "Mouse", 15, 700.00);

        operation.addProduct(laptop);
        operation.addProduct(smartphone);
        operation.addProduct(keyboard);
        operation.addProduct(mouse);

        System.out.println(operation.getProductById(4));
        System.out.println("----------------------------------------------------");
        operation.getAllProduct();
    }
}
