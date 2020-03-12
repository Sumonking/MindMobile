package com.example.MindMobile.Controller;

import com.example.MindMobile.Model.Mobile;
import com.example.MindMobile.Repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    MobileRepository mobileRepository;

    @RequestMapping("/Hello")
    public String Hello(){
        return ("Hello Mind");
    }

    @RequestMapping("/Mobile")
    public List<Mobile> getData(){
        return mobileRepository.findAll();
    }

}
