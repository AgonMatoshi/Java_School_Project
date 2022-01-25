package seeu.edu.java_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.edu.java_project.pojo.entity.User;
import seeu.edu.java_project.repository.UserRepository;

import java.util.List;

public class DefaultUserService implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        if (id == null) {
            return null;
        }
        return userRepository.findUserById(id);
    }
}
