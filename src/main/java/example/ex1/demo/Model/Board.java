package example.ex1.demo.Model;

<<<<<<< HEAD
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Board {
    @Id
    //PK
=======
import lombok.Builder;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data // Getter Setter
@NoArgsConstructor // 아규먼트 없는 생성자 생성
@AllArgsConstructor // 전체 아규먼트 생성자 생성
@Builder // 빌더 패턴
@Entity
public class Board {
    @Id
    // PK
>>>>>>> 88d6f3f49ca889443c0a6599b70fe0febc34de8f
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob
    private String content; // 섬머노트 라이브러리 <html>태그가 섞여서 디자인이 됨.

    @ColumnDefault("0")
<<<<<<< HEAD
    private int count; //조회수

    @ManyToOne // Many = Board, User = One
    @JoinColumn(name = "userId")
    private User user; //DB는 Object를 저장할 수 없다. FK,자바는 Object를 저장할 수 있다.
=======
    private int count; // 조회수

    @ManyToOne(fetch = FetchType.EAGER) // Many = Board, User = One
    @JoinColumn(name = "userId")
    private User user; // DB는 Object를 저장할 수 없다. FK,자바는 Object를 저장할 수 있다.

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER) // mappedBy 연관관계의 주인이 아니다.(난 FK가 아니예요) DB에 컬럼 만들지 X
    private List<Reply> reply;
>>>>>>> 88d6f3f49ca889443c0a6599b70fe0febc34de8f

    @CreationTimestamp
    private Timestamp createDate;
}
