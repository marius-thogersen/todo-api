package com.thogersen.view;

import org.springframework.stereotype.Controller;

@Controller
public class ViewController {

    public String index(){
        return "index";
    }
}
