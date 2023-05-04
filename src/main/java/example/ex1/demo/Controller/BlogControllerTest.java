package example.ex1.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BlogControllerTest {
    @GetMapping("/hello")
    public String hello() {
        log.debug("debug");
        return "<h1>hello spring boot</h1>";
    }
}
