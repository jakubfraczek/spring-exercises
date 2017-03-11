package pl.sda.user;


import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
    public User getUserByLogin(String login);

}
