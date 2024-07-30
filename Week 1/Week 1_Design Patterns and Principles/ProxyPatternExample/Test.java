public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1");
        Image image2 = new ProxyImage("image2");

        image1.display();
        System.out.println("-------------------");

        image2.display();

    }
}
