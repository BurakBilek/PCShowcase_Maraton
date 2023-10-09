package com.burak.service;

import com.burak.repository.UserRepository;
import com.burak.repository.entity.User;

import java.util.Scanner;

public class UserService {
    UserRepository userRepository;
    Scanner scanner;

    public UserService(){
        this.userRepository = new UserRepository();
    }


    public User save(User user) {
        return userRepository.save(user);
    }
    public User kullaniciOlustur(){
        return userRepository.kullaniciOlustur();
    }
public void Login (User user)

}
