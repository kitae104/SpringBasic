package inhatc.cse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("data", "Hello World! 스프링 시작");
        return "index";
    }
}
