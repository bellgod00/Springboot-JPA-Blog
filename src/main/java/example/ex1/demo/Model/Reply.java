package example.ex1.demo.Model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter Setter
@NoArgsConstructor // 아규먼트 없는 생성자 생성
@AllArgsConstructor // 전체 아규먼트 생성자 생성
@Builder // 빌더 패턴
@Entity // User class가 MySQL에 테이블이 생성이 된다.
public class Reply {
    @Id
    // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne // Many = Board, User = One
    @JoinColumn(name = "boardId")
    private Board board; // DB는 Object를 저장할 수 없다. FK,자바는 Object를 저장할 수 있다.

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @CreationTimestamp
    private Timestamp createDate;
}
