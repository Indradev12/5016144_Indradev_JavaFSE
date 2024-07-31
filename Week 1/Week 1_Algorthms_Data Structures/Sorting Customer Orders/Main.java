import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(4, "Ram", 265.20),
            new Order(2, "Shyam", 150.75),
            new Order(1, "Sanjay", 300.00),
            new Order(3, "Khush", 100.25)
        };

        System.out.println("Bubble Sort:");
        List<Order> o1 = bubbleSort.sort(orders1);
        o1.stream().forEach(e ->System.out.println(e));

        System.out.println("--------------------------------------------");

        Order[] orders2 = {
            new Order(4, "Ram", 649.20),
            new Order(2, "Shyam", 498.75),
            new Order(1, "Sanjay", 589.00),
            new Order(3, "Khush", 616.25)
        };


        System.out.println("Quick Sort:");
        List<Order> o2 = quickSort.sort(orders2,0,orders2.length-1);
        o2.stream().forEach(e ->System.out.println(e));
    }
}
