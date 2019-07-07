package boot.itzf.cn.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author zf
 * @date 2019/7/7-0:11
 * @vesion CCS2
 */
@ResponseBody
@Controller
public class JdbcControl {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/department")
    public Map<String, Object> getMap() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department");
        return maps.get(0);
    }


}
