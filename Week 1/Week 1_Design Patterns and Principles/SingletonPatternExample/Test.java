public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        // Check if both are from the same instance
        if (logger1 == logger2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances were created.");
        }
    }
}
