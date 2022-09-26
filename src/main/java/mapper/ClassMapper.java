package mapper;

import org.apache.ibatis.annotations.*;
import pojo.ClassPojo;
import pojo.Student;
import pojo.StudentOrginal;

import java.util.List;

public interface ClassMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from class")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("classResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<ClassPojo> selectAll();

    /**
     * 添加数据
     * @param classPojo
     */
    @Insert("INSERT INTO class VALUES(null,#{grade},#{className},#{totalStudents},#{major})")
    void add(ClassPojo classPojo);

    /**
     * 编辑数据
     * @param classPojo
     */
    @Update("UPDATE class SET grade=#{grade},class_name=#{className},total_students=#{totalStudents},major=#{major} WHERE id=#{id}" )
    void update(ClassPojo classPojo);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM class WHERE id=#{id}")
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
    List<ClassPojo> selectClassesByCondition(ClassPojo classPojo);


}
