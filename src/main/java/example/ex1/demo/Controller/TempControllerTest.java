package example.ex1.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TempControllerTest {
    @GetMapping("/temp/home")
    public String tempHome() {
        log.debug("catch tempHome()");
        System.out.println("It's sout memssage tempHome()");
        return "home";
    }

    @GetMapping("/temp/jsp")
    public String tempJsp() {
        log.debug("catch tempJsp()");
        System.out.println("It's sout memssage tempJsp()");
        return "test";
    }
}
