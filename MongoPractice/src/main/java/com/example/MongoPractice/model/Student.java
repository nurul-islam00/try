package com.example.MongoPractice.model;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;


@Data

@Document(collection = "Student")
public class Student {

    @Id
    private String id;
    private String Name;
    private String HomeDistrict;
    private List<Ad> address;

}
