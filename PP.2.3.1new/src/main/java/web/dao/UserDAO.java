package web.dao;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User getByIdUser(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
