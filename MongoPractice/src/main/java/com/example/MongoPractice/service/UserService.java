package com.example.MongoPractice.service;

import com.example.MongoPractice.model.User;
import com.example.MongoPractice.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class UserService {
    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> saveData(User user)
    {
       // System.out.println(user);

        userRepository.save(user);

         List<User> ab= userRepository.findAll();
        return ab;
    }


    public List<User> query_find(int price, boolean available,String authorName)
    {
        List<User>ab=userRepository.query_find(price,available,authorName);
        return ab;
    }
}
