package example.ex1.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SampleController {
    @GetMapping("/sample")
    // public ResponseEntity<?> index() {
    public String sample(Model model) {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.warn("메시지 출력 레벨 확인.");
        model.addAttribute("data", "This is data!!");
        return "sample Test";
        // return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
