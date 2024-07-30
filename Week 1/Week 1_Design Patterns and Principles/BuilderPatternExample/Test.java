public class Test {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder("intel i5").setRAM("8 GB").setStorage("256 GB").build();
        System.out.println(comp);
    }
}
