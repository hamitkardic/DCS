import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Hello extends UnicastRemoteObject implements HelloInterface {
    private List<User> userList;

    public Hello(String msg) throws RemoteException {
        super();
        this.userList = new ArrayList<>();
    }

    @Override
    public void addUser(User user) throws RemoteException {
        userList.add(user);
    }

    @Override
    public void deleteUser(String firstname, String lastname) throws RemoteException {
        userList.removeIf(user -> user.getFirstname().equals(firstname) && user.getLastname().equals(lastname));
    }

    @Override
    public User getUser(String firstname, String lastname) throws RemoteException {
        return userList.stream()
                .filter(user -> user.getFirstname().equals(firstname) && user.getLastname().equals(lastname))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUsers() throws RemoteException {
        return userList;
    }

    @Override
    public void shutdown() throws RemoteException {
        System.out.println("Server is shutting down...");
        System.exit(0); // Gracefully terminate the server
    }

    @Override
    public void updateUser(String firstname, String lastname, User updatedUser) throws RemoteException {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getFirstname().equals(firstname) && user.getLastname().equals(lastname)) {
                userList.set(i, updatedUser);
                break;
            }
        }
    }
}
