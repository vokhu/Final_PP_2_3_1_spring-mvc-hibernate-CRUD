package myapp.dao;

import myapp.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAll();

    User getUserById(int id);

    void updUser(User upduser);

    void deleteUsr(int id);

    void addNewUser(User newUser);
}
