package pl.sda.user;

import java.util.List;

public class InMemoryUserDAO implements UserDAO {
    private List<User> users;

    public InMemoryUserDAO() {}

    public InMemoryUserDAO(List<User> users) {
        this.users = users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserByLogin(String login) {
        for (User u : users) {
            if (u.getLogin().equals(login)) {
                return u;
            }
        }
        return null;
    }
}
