package web_hibernate.service;

import org.springframework.stereotype.Service;
import web_hibernate.model.User;

import java.util.List;

@Service
public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUserById(Long id);

}
