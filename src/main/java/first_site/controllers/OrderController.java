package first_site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/orders")
    public String orders(Model model){
        model.addAttribute("title2", "Test message");
        return "orders";
    }
}
