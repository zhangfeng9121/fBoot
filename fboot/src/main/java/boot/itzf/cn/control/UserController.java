package boot.itzf.cn.control;

import boot.itzf.cn.entity.User;
import boot.itzf.cn.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/8
 */
@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;


    @GetMapping("/user/{id}")
    public Optional<User> getUserInfo(@PathVariable("id") Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }
}
