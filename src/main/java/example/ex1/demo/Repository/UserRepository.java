package example.ex1.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.ex1.demo.Model.User;

// DAO
//@Repository // 자동으로 bean 등록이 된다.(생략가능하다.)
public interface UserRepository extends JpaRepository<User, Integer> {

}
