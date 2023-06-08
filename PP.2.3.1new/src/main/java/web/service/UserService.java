package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getByIdUser(int id);

    void saveUser(User user);

    public void update(User user);

    void deleteUser(int id);
}
