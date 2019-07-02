package boot.itzf.cn.control;

import boot.itzf.cn.dao.DepartmentDao;
import boot.itzf.cn.dao.EmployeeDao;
import boot.itzf.cn.entities.Department;
import boot.itzf.cn.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @AUTHOR ZF
 * @DATE 2019/7/1
 */
@Controller
public class EmployeeControl {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    /**
     *  获取员工列表
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String getList(Model model) {
        Collection<Employee> allList = employeeDao.getAll();
        model.addAttribute("emps", allList);
        return "emp/list";
    }

    /**
     * 获取添加页面
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String getaddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        System.out.println("=================" + departments.toString());
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    /**
     * 添加成员信息
     * @return
     */
    @PostMapping("/emp")
    public String addEmps(Employee employee, Model model) {
        employeeDao.save(employee);
        model.addAttribute("suMsg","success");
        return  "redirect:/emps";
    }

    /**
     * 获取单个用户信息
     * ***路径变量
     */
    @GetMapping("/emp/{id}")
    public String getEmps(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    /**
     * 编辑用户
     */
    @PutMapping("/emp")
    public String editEmps(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/emp/{id}")
    public String delEmp(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}

