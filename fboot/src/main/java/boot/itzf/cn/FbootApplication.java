package boot.itzf.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("boot.itzf.cn.mapper")
@SpringBootApplication
public class FbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FbootApplication.class, args);
    }
}
