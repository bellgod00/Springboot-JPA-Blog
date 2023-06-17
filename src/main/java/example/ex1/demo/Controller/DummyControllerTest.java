package example.ex1.demo.Controller;

import example.ex1.demo.Model.RoleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import example.ex1.demo.Model.User;
import example.ex1.demo.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

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

        user.setRole(RoleType.USER);
        log.debug("userRepository 실행");
        userRepository.save(user);

        return "회원가입이 완료되었습니다.";
    }

    //{id} 주소로 파마메터를 전달 받을 수 있음.
    //http://localhost:8000/blog/dumy/user/3
    @GetMapping("/dumy/user/{id}")
    public User detail(@PathVariable int id) {
        log.debug("User detail Call");
//        //user/4를 찾으면 내가 DB에서 못 찾아오게 되면 user가 null
//        //그럼 return이 null 해서 Optional로 싸서 return여부 판단.
//        User user = userRepository.findById(id).orElseGet(new Supplier<User>() {
//            @Override
//            public User get() {
//                return new User();
//            }
//        });
        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>(){
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("해당 유저는 없습니다.id"+id);
                //Thu May 11 17:56:34 KST 2023
                //There was an unexpected error (type=Internal Server Error, status=500).
                //해당 유저는 없습니다.id4
            }
        });

        return user;
        //{"id":2,"username":"hong","passwd":"1234","email":"hong@nate.com","role":"USER","createDate":"2023-05-11T08:40:57.933+00:00"}
    }

}
