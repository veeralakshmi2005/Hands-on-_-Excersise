public class SingletonTest {

    public static void main(String[] args) {

        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.display("First Message");
        log2.display("Second Message");

        if (log1 == log2) {
            System.out.println("Only one object created");
        } else {
            System.out.println("Different objects created");
        }
    }
}