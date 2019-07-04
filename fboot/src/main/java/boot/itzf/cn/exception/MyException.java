package boot.itzf.cn.exception;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/4
 */
public class MyException extends RuntimeException{
    public MyException() {
        super("该用户不存在！！！！");
    }
}
