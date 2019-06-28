package boot.itzf.cn.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @author zf
 * @date 2019/6/28-22:37
 * @vesion CCS2
 */
@Controller
public class HelloControl {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "index.html";
    }
}
