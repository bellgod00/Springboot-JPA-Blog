package example.ex1.demo.Model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity //User class가 MySQL에 테이블이 생성이 된다.
public class User {
    @Id //Entity만 사용하고 Id 없으면 다음의 오류 발생 Caused by: org.hibernate.AnnotationException: No identifier specified for entity
    //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)//프로젝트에 연결된 DB의 Numbering 전략을 따라간다.
    private int id;//Sequence, Auto-Increment

    @Column(nullable = false, length = 50)
    private String username; //ID

    @Column(nullable = false, length = 100)
    private String passwd;  //패스워드 Hash 암호화.

    @Column(nullable = false, length = 50)
    private String email; //Email 주소

    @ColumnDefault("'user'")
    private String role; //추후 enum으로 변경해야 한다. //회원등급 관리 admin,user,manager

    @CreationTimestamp //시간이 자동 입력.
    private Timestamp createDate; //생성일자

}
