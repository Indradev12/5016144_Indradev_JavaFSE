public class binarySearch {
    public static Product binary(Product[] product, int id) {
        int start = 0;
        int end = product.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (product[mid].getProductId() == id) {
                return product[mid];
            }

            if (product[mid].getProductId() < id) {
                start = mid + 1;
            }

            else
                end = mid - 1;
        }

        return null;
    }
}
