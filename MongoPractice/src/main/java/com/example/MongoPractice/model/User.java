package com.example.MongoPractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;


@Data

@Document(collection = "User")
public class User {

    @Id
    private String id;
    private String bookName;
    private String authorName;
    private int price;
    private boolean available;




}
