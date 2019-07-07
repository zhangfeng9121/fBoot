package boot.itzf.cn.mapper;

import boot.itzf.cn.bean.Employee;

/**
 * @author zf
 * @date 2019/7/7-18:49
 * @vesion CCS2
 */
public interface EmployeeMapper {

    Employee getById(Integer id);

    int addEmployee(Employee employee);
}
