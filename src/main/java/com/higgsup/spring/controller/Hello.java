package com.higgsup.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by anhvu on 28-May-18.
 */
@Controller
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello( Model model){
        return "hello";
    }
}
