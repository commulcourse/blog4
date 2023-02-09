package shop.mtcoding.blog4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {
    @GetMapping("/")
    public String temp() {
        return "temp";
    }
}
