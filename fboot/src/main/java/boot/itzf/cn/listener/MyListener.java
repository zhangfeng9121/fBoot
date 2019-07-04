package boot.itzf.cn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/3
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("MyListener zhuce ...............");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("myListener destroy......................");
    }
}
