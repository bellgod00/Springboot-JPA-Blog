package example.ex1.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;

//아무 아규먼트 없는 생성자 생성
@NoArgsConstructor
// 전체 아규먼트 생성자 생성
@AllArgsConstructor
// Getter & Setter
@Data
// final이 붙은 변수에 대한 생성자 생성.
// @RequiredArgsConstructor
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;

}
