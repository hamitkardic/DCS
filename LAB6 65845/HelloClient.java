import java.rmi.Naming;
import java.util.Scanner;

public class HelloClient {
    public static void main(String[] argv) {
        try {
            HelloInterface hi = (HelloInterface) Naming.lookup("//localhost:5001/Hello");
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Choose an option:");
                System.out.println("1. Add a user");
                System.out.println("2. View all users");
                System.out.println("3. Shutdown server");
                System.out.println("4. Exit client");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        
                        User user = new User("Paul", "Schneider", "1957-06-14", 45000.0, "Male", "HR", "Manager");
                        hi.addUser(user);
                        System.out.println("User added.");
                        break;

                    case 2:
                        System.out.println("Current users:");
                        hi.getAllUsers().forEach(u -> System.out.println(u.getFirstname() + " " + u.getLastname()));
                        break;

                    case 3:
                        System.out.println("Shutting down the server...");
                        hi.shutdown();
                        running = false;
                        break;

                    case 4:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
