package boot2018.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
    @RequestMapping("/source")
public class HelloController {

    @RequestMapping(value = "/say",method = {RequestMethod.GET,RequestMethod.POST})
    public String hello(Model model) {
        model.addAttribute("loginName","admin888");
        model.addAttribute("loginId","4848ddfefed");
        return "index";
    }
//
//    @RequestMapping(value = "/mock",method = {RequestMethod.GET,RequestMethod.POST})
//    public String execte(Model model) {
//        model.addAttribute("hello","hello,Spring Boot");
//
//    }
}
