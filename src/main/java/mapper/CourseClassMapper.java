package mapper;

import org.apache.ibatis.annotations.*;
import pojo.CourseClass;

import java.util.List;

public interface CourseClassMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from course_class")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("courseClassResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<CourseClass> selectAll();

    /**
     * 添加数据
     * @param courseClass
     */
    @Insert("INSERT INTO course_class VALUES(null,#{courseTeacherId},#{classId})")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add(CourseClass courseClass);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM course_class WHERE id=#{id}")
    void deleteById(int id);

}
