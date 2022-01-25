package seeu.edu.java_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import seeu.edu.java_project.pojo.entity.Product;
import seeu.edu.java_project.pojo.entity.User;
import seeu.edu.java_project.pojo.input.UserInput;
import seeu.edu.java_project.repository.UserRepository;
import seeu.edu.java_project.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

   @GetMapping("/user")
    public List<User> getUsers(){
       return userRepository.findAll();
    }

        @GetMapping("/user/{id}")
    public User getOneUserById(@PathVariable Integer id){
        return userRepository.findUserById(id);
    }

    @PostMapping("/userr")
    public User createUser(@RequestBody UserInput userInput){
        String newFullName = userInput.getFull_name();
        String newEmail = userInput.getEmail();
        String newPassword = userInput.getPassword();
        String newDateOfBirth = userInput.getDate_of_birth();
        String newCreatedAt = userInput.getCreated_at();
        String newGender = userInput.getGender();

        User user = new User();
        user.setFull_name(newFullName);
        user.setEmail(newEmail);
        user.setPassword(newPassword);
        user.setDate_of_birth(newDateOfBirth);
        user.setCreated_at(newCreatedAt);
        user.setGender(newGender);

        userRepository.save(user);
        return (user);

    }
    @PutMapping("user/{id}")
    public User updateUser(@PathVariable Integer id,
                           @RequestBody UserInput userInput){

       User user = userRepository.findUserById(id);
       if(user ==null){
           return null;
       }
        String updatedFullName = userInput.getFull_name();
        String updatedEmail = userInput.getEmail();
        String updatedPassword = userInput.getPassword();
        String updatedDateOfBirth = userInput.getDate_of_birth();
        String updatedCreatedAt = userInput.getCreated_at();
        String  updatedGender = userInput.getGender();

        user.setFull_name(updatedFullName);
        user.setEmail(updatedEmail);
        user.setPassword(updatedPassword);
        user.setDate_of_birth(updatedDateOfBirth);
        user.setCreated_at(updatedCreatedAt);
        user.setGender(updatedGender);

        return userRepository.save(user);

    }
    @DeleteMapping ("/user/{id}")
    public String deleteUser(@PathVariable Integer id){
        User user = userRepository.findUserById(id);
        if(user == null){
            return "The user with id:"+ id+ " dose not exist!";
        }
        userRepository.delete(user);
        return "The user with id:" + id + " is deleted successfully!";
    }
}
