package boot.itzf.cn.control;

import boot.itzf.cn.dao.EmployeeDao;
import boot.itzf.cn.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/1
 */
@Controller
public class EmployeeControl {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String getList(Model model) {
        Collection<Employee> allList = employeeDao.getAll();
        model.addAttribute("emps", allList);
        return "emp/list";
    }
}
