package in.anil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author anil
 * Created by AH00554631 on 8/31/2018.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        System.out.println("ttttttttttt");
        return "Spring Boot Example";
    }
}