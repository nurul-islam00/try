package com.example.MongoPractice.controller;

import com.example.MongoPractice.model.User;
import com.example.MongoPractice.service.UserService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;
import net.minidev.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import com.example.MongoPractice.model.Student;

@RestController
@RequestMapping("/api")
public class UserController {
    public  final UserService userService;
    public final MongoTemplate mongoTemplate;


    public UserController(UserService userService, MongoTemplate mongoTemplate) {
        this.userService = userService;
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping("/save")
    List<User> save(@RequestBody  JSONObject jsonObject)
    {

        String id= (String) jsonObject.get("id");
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        List<Student> lst= mongoTemplate.find(query,Student.class);
         System.out.println(lst);
    JSONObject JS=    mongoTemplate.findById("id", JSONObject.class,"Student");
    System.out.println(JS);
        List<User> users=null;


        return users;
    }

    @GetMapping("/find/{price}/{available}/{authorName}")
    List<User> query_find(@PathVariable int price, @PathVariable boolean available,@PathVariable String authorName)
    {
        // System.out.println(user);
        return userService.query_find(price,available,authorName);
    }
}
