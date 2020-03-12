package com.example.MindMobile.Model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Mobile")
public class Mobile {

    @Id
    private ObjectId _id;
    private String color;
    private String price;
    private String name;
}
