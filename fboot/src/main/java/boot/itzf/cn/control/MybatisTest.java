package boot.itzf.cn.control;

import boot.itzf.cn.bean.Department;
import boot.itzf.cn.bean.Employee;
import boot.itzf.cn.mapper.DepartmentMapper;
import boot.itzf.cn.mapper.EmployeeMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zf
 * @date 2019/7/7-15:31
 * @vesion CCS2
 */
@RestController
public class MybatisTest {

    @Resource
    private DepartmentMapper departmentMapper;

    @Resource
    private EmployeeMapper employeeMapper;

    @GetMapping("/em/{id}")
    public Employee getEmployeeInfo(@PathVariable("id") Integer id) {
        Employee byId = employeeMapper.getById(id);
        return byId;
    }

    @GetMapping("/em")
    public Employee addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
        return  employee;
    }

    @GetMapping("/depart/{id}")
    public Department getDepartInfo(@PathVariable("id") Integer id) {
        System.out.println("-------------------------------------------------------------------");
        Department byid = departmentMapper.getByid(id);
        return byid;
    }

    @GetMapping("/depart")
    public Department addDepart(Department department) {
        departmentMapper.addDepartment(department);
        return  department;
    }


}
