import java.util.Arrays;
import java.util.List;

public class quickSort {
    public static List<Order> sort(Order[] orders, int start, int end) {
        if (start < end) {
            int pi = partition(orders, start, end);

            sort(orders, start, pi - 1);
            sort(orders, pi + 1, end);
        }

        return Arrays.asList(orders);
    }

    private static int partition(Order[] orders, int start, int end) {
        Order pivot = orders[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (orders[j].getTotalPrice() <= pivot.getTotalPrice()) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[end];
        orders[end] = temp;

        return i + 1;
    }
}
