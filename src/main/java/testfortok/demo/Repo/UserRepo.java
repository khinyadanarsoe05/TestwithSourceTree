package testfortok.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import testfortok.demo.Model.User;

public interface UserRepo extends JpaRepository<User,Long>{

}
