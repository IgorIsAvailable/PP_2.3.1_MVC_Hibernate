package web_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web_hibernate.dao.UserDao;
import web_hibernate.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }
}

