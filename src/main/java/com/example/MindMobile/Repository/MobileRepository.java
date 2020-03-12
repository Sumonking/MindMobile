package com.example.MindMobile.Repository;

import com.example.MindMobile.Model.Mobile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MobileRepository extends MongoRepository<Mobile,String> {
}
