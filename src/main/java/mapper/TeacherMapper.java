package mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;
import pojo.Teacher;

import java.util.List;

public interface TeacherMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from teacher")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("teacherResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Teacher> selectAll();

    /**
     * 添加数据
     * @param teacher
     */
    @Insert("INSERT INTO teacher VALUES(null,#{name},#{sex},#{experience},#{competent},#{password},#{employeeNum})")
    void add(Teacher teacher);

    /**
     * 编辑数据
     * @param teacher
     */
    @Update("UPDATE teacher SET name=#{name} ,sex=#{sex} ,experience=#{experience} ,competent=#{competent} ,password=#{password} ,employee_num=#{employeeNum} WHERE id=#{id}" )
    void update(Teacher teacher);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM teacher WHERE id=#{id}")
    void deleteById(int id);

    /**
     * 删除多个
     * @param ids
     */
    void deleteByIds(@Param("ids") int[] ids);

    /**
     * 条件查询
     * @return
     */
    List<Teacher> selectTeachersByCondition(Teacher teacher);


}
