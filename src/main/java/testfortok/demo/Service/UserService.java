package testfortok.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testfortok.demo.Model.User;
import testfortok.demo.Repo.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
public List<User> findAll(){
    return userRepo.findAll();
}

public User findById(Long id){
    return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
}

public void save(User user){
    userRepo.save(user);
}

}
