package example.ex1.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.ex1.demo.Member;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//사용자가 요청 -> 응답(HTML 파일)
//@Controller

@Slf4j
// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

    // 브라우저 요청은 get만 가능.
    // http://localhost:8080/http/get
    @GetMapping("/http/get")
    // public String getTest(@RequestParam int id, @RequestParam String username) {
    public String getTest(Member m) {
        log.debug("get " + "," + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail());
        return "get " + "," + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }

    // http://localhost:8080/http/post
    @PostMapping("/http/post")
    // public String postTest(Member m) {
    public String postTest(@RequestBody Member m) { // Spring Boot Message Converter가
        return "post " + "," + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }

    // http://localhost:8080/http/put
    @PutMapping("/http/put")
    public String putTest(@RequestBody Member m) {
        log.debug("put " + "," + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail());
        return "put " + "," + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }

    // http://localhost:8080/http/delete$
    @DeleteMapping("http/delete")
    public String deleteTest() {
        log.debug("delete");
        return "delete 요청";
    }
}
