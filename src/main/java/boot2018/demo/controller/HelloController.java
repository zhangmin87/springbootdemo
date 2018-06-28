package boot2018.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/source")
public class HelloController {
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("loginName","admin");
        model.addAttribute("loginId","28");
        return "index";
    }
}
