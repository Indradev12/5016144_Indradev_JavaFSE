public class Main {
    public static void main(String[] args) {
        
        Product[] products = {
            new Product(4, "Laptop", "Electronics"),
            new Product(5, "Smartphone", "Electronics"),
            new Product(1, "Tablet", "Electronics"),
            new Product(2, "Headphones", "Accessories"),
            new Product(3, "Charger", "Accessories")
        };

        System.out.println("Linear Search:");
        long startTime = System.nanoTime();
        System.out.println(linearSearch.linear(products, 2));
        long endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime));

        System.out.println("--------------------------------------------");
        // As this exercise focuses on searching algorithm we have given a sorted array
        Product[] products2 = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics"),
            new Product(4, "Headphones", "Accessories"),
            new Product(5, "Charger", "Accessories")
        };


        System.out.println("Binary Search:");
        startTime = System.nanoTime();
        System.out.println(binarySearch.binary(products2, 2));
        endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime));
        
    }
}
