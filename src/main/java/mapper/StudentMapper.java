package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Student;
import pojo.StudentOrginal;

import java.util.List;

public interface StudentMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select student.id,student.grade,name,class_name,major,student_num,password from student, class WHERE student.class_id=class.id")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("studentResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Student> selectAll();

        //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Student> selectByIds(@Param("ids") int[] ids);

    /**
     * 添加数据
     * @param studentOrginal
     */
    @Insert("INSERT INTO student VALUES(null,#{grade},#{classId},#{name},#{password},#{studentNum})")
    void add(StudentOrginal studentOrginal);

    /**
     * 编辑数据
     * @param studentOrginal
     */
    @Update("UPDATE student SET grade=#{grade} ,class_id=#{classId} ,name=#{name} ,password=#{password} ,student_num=#{studentNum} WHERE id=#{id}" )
    void update(StudentOrginal studentOrginal);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM student WHERE id=#{id}")
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
    List<StudentOrginal> selectStudentsByCondition(StudentOrginal studentOrginal);


}
