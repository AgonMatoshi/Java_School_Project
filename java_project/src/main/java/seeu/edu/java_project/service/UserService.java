package seeu.edu.java_project.service;

import seeu.edu.java_project.pojo.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findUserById(Integer id);
}
