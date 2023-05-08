package com.example.SweetTrio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/")
    public String mainHOME( Model model) {
        model.addAttribute("title", "Home page");
        return "Home";
    }

    @GetMapping("/about")
    public String mainAbout( Model model) {
        model.addAttribute("title", "About page");
        return "About";
    }

    @GetMapping("/menu")
    public String mainMenu( Model model) {
        model.addAttribute("title", "Menu page");
        return "Menu";
    }

    @GetMapping("/order")
    public String mainOrder( Model model) {
        model.addAttribute("title", "Order page");
        return "Order";
    }

    @GetMapping("/contacts")
    public String mainContacts( Model model) {
        model.addAttribute("title", "Contacts page");
        return "Contacts";
    }

}
