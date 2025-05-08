import java.util.List;

public interface HelloInterface extends java.rmi.Remote {
    void addUser(User user) throws java.rmi.RemoteException;
    void deleteUser(String firstname, String lastname) throws java.rmi.RemoteException;
    User getUser(String firstname, String lastname) throws java.rmi.RemoteException;
    List<User> getAllUsers() throws java.rmi.RemoteException;
    void updateUser(String firstname, String lastname, User updatedUser) throws java.rmi.RemoteException;
    void shutdown() throws java.rmi.RemoteException;
}
