package com.api.bechallenge.services;

import com.api.bechallenge.models.UserModel;
import com.api.bechallenge.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
    }

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }

    public UserModel getByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public UserModel updateById(UserModel request, Long id) {
        UserModel user = userRepository.findById(id).get();

        user.setName(request.getName());
        return user;
    }
}
