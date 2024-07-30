public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(4, "book1", "author1"),
            new Book(3, "book2", "author2"),
            new Book(2, "book3", "author3"),
            new Book(5, "book4", "author4"),
            new Book(1, "book5", "author5")
        };

        //linear search
        System.out.println("Linear Search:");
        Book res = linearSearch.search(books, "book2");
        System.out.println(res);
        

        System.out.println("--------------------------------------------");

        Book[] books1 = {
            new Book(1, "book1", "author1"),
            new Book(2, "book2", "author2"),
            new Book(3, "book3", "author3"),
            new Book(4, "book4", "author4"),
            new Book(5, "book5", "author5")
        };

        System.out.println("Binary Search:");
        Book res1 = binarySearch.search(books1, "book2");
        System.out.println(res1);
    }
}
