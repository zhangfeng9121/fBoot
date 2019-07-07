package boot.itzf.cn.mapper;

import boot.itzf.cn.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author zf
 * @date 2019/7/7-15:20
 * @vesion CCS2
 */
//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    public Department getByid(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department (departmentName) values (#{departmentName})")
    public int addDepartment(Department department);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    public int editDepartment(Department department);

    @Delete("delete from department where id = #{id}")
    public int delDepartment(Integer id);
}
