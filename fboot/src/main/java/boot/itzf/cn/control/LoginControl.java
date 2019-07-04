package boot.itzf.cn.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/1
 */
@Controller
public class LoginControl {
    @PostMapping(value = "/login/user")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session) {
        if(!StringUtils.isEmpty(username) && "123".equals(password)) {
            session.setAttribute("userName", username);
            return "redirect:/main.html";
        }else {
            map.put("errorMsg","用户名/密码错误！！！");
            return "login";
        }
    }
}
