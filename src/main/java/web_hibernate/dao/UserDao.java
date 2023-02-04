package web_hibernate.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web_hibernate.model.User;



@Repository
public interface UserDao extends CrudRepository<User, Long> {
}
