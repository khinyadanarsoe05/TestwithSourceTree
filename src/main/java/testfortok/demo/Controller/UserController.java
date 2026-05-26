package testfortok.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/user")
public class UserController {
@GetMapping
public String getAll(Model Model) {
    
    return new String();
}

}
