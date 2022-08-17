package com.eg.controller;

import com.eg.model.User;
import com.eg.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController {

    private final UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public ModelAndView mainPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tem");
        return modelAndView;
    }

    @GetMapping("/registration")
    public ModelAndView registrationPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView registration(@ModelAttribute (name = "newUser") User user){
        ModelAndView modelAndView = new ModelAndView();
        userService.addUser(user);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("userpage");
        return modelAndView;
    }


    //НЕ РАБОЧИЙ СОБОСОБ С ПЕРЕНАПРАВЛЕНИЕМ НА СТРАНИЦУ
//    @GetMapping("/delete/{login}")
//    public ModelAndView deletePage(@ModelAttribute String login){
//        ModelAndView modelAndView = new ModelAndView();
//        User user = userService.getUser(login);
//        modelAndView.addObject(user);
//        modelAndView.setViewName("DeleteAccount");
//        return modelAndView;
//    }
//
//    @GetMapping("/deleteAcc/")
//    public ModelAndView delete(@ModelAttribute(name = "userLogin") String login){
//        ModelAndView modelAndView = new ModelAndView();
//        User user = userService.getUser(login);
//        System.out.println(user.toString());
//        userService.delete(user);
//        modelAndView.setViewName("tem");
//        return modelAndView;
//    }

    @GetMapping(value="/delete/{id}")
    public ModelAndView delete(@ModelAttribute(name = "id") int id){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getUserById(id);
        userService.delete(user);
        modelAndView.setViewName("tem");
        return modelAndView;
    }



}
