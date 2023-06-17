package example.ex1.demo.Model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Board {
    @Id
    //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob
    private String content; // 섬머노트 라이브러리 <html>태그가 섞여서 디자인이 됨.

    @ColumnDefault("0")
    private int count; //조회수

    @ManyToOne // Many = Board, User = One
    @JoinColumn(name = "userId")
    private User user; //DB는 Object를 저장할 수 없다. FK,자바는 Object를 저장할 수 있다.

    @CreationTimestamp
    private Timestamp createDate;
}
