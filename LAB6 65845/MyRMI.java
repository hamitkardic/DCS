
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class MyRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry r = LocateRegistry.getRegistry(5001);
            r.rebind("Hello", new Hello("Hello from the RMI server!"));
            System.out.println("The RMI server is up!");
        }
        catch (Exception e)
        {
            System.out.println("Server error: " + e.getMessage());
        }      
    }   
}
