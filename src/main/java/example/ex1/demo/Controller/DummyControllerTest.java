package example.ex1.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import example.ex1.demo.Model.User;
import example.ex1.demo.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DummyControllerTest {

    @Autowired // 의존성 주입(DI)
    private UserRepository userRepository;

    @PostMapping("/dumy/join")
    public String join(User user) {
        log.debug("id = " + user.getId());
        log.debug("username = " + user.getUsername());
        log.debug("password = " + user.getPasswd());
        log.debug("email = " + user.getEmail());
        log.debug("role = " + user.getRole());
        log.debug("createDate = " + user.getCreateDate());

        log.debug("userRepository 실행");
        userRepository.save(user);

        return "회원가입이 완료되었습니다.";
    }

}
