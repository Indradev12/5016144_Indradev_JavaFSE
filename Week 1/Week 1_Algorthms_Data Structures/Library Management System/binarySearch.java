public class binarySearch {
    public static Book search(Book[] book, String title) {
        int start = 0;
        int end = book.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int comparison = book[mid].getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return book[mid];
            }

            if (comparison < 0) {
                start = mid + 1;
            }

            else
                end = mid - 1;
        }

        return null;
    }
}
