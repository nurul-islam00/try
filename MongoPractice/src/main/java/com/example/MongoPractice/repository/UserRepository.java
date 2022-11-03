package com.example.MongoPractice.repository;

import com.example.MongoPractice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,String> {


   // @Query("{$and:[{'available':?1},{$and:[{'price':{$gte:500}},{'price':{$lte:?0}}]}]}")

    @Query("{'authorName':?2}")
    List<User> query_find(int price, boolean available,String authorName);
    /*
          Childhood is the sweetest and most memory.
     */

}
