package boot.itzf.cn.component;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/4
 */

import boot.itzf.cn.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 配置异常处理类
 */
@ControllerAdvice
public class MyExceptionHandler {

    /*@ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String, Object> handleException(Exception e) {
        Map<String, Object> mapReq = new HashMap<>();
        mapReq.put("code", "userNoExit");
        mapReq.put("message", e.getMessage());
        return mapReq;
    }*/


    @ExceptionHandler(MyException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        request.setAttribute("javax.servlet.error.status_code",500);
        Map<String, Object> mapReq = new HashMap<>();
        mapReq.put("code", "userNoExit");
        mapReq.put("message", e.getMessage());
        request.setAttribute("ext", mapReq);
        return "forward:/error";
    }
}
