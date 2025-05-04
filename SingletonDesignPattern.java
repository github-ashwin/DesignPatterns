class Logger {
    // Step 1: Static variable to hold single instance
    private static Logger instance;

    // Step 2: Private constructor so no one else can create objects
    private Logger() {
        System.out.println("Logger started.");
    }

    // Step 3: Public method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create only once
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        System.out.println(logger1 == logger2); // Output: true (same object)
    }
}
