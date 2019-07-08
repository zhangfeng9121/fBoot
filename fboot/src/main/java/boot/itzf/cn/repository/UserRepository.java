package boot.itzf.cn.repository;

import boot.itzf.cn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/8
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
