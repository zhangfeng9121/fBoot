package boot.itzf.cn.control;

import boot.itzf.cn.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.RequestWrapper;

/**
 * @author zf
 * @date 2019/6/28-22:37
 * @vesion CCS2
 */
@Controller
public class HelloControl {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("user") String user){
        if ("123".equals(user)){
            throw new MyException();
        }
        return "redirect:/index.html";
    }
}
