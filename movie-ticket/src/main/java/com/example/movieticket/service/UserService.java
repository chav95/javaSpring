package com.example.movieticket.service;

import com.example.movieticket.model.User;
import com.example.movieticket.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUserById(Long id){
        return userRepo.findById(id).get();
    }

    public User createUser(User user){
        return userRepo.save(user);
    }

    public User updateUser(Long id, User user){
        User entity = userRepo.findById(id).get();
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());

        return userRepo.save(entity);
    }

    public String deleteUser(Long id){
        try{
            userRepo.deleteById(id);
            return "User Deleted";
        }catch (Exception e){
            // TODO: handle exc
            return "User Not Found";
        }
    }
}
