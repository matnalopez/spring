package com.matnalopez.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    @PostMapping("/index")
    public String controller(Model model){
        return "index";
    }

}