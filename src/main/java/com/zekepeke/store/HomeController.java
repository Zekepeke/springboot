package com.zekepeke.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// a form of syntactic metadata (information about the program)
// that can be added to code elements like classes, methods, and fields
// Label or tag that gives instructions or additional context to the complier
@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        System.out.println("AppName: " + appName);
        return "index.html";
    }

    @RequestMapping("/looky")
    public String testing() {
        System.out.println("AppName: " + appName);
        return "looky.html";
    }



}
