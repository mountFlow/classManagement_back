package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Course;

import java.util.List;

public interface CourseMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from course")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("courseResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Course> selectAll();

    /**
     * 添加数据
     * @param course
     */
    @Insert("INSERT INTO course VALUES(null,#{courseName},#{totalHour},#{classType},#{evaluationMode})")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add(Course course);

    /**
     * 编辑数据
     * @param course
     */
    @Update("UPDATE course SET course_name=#{courseName} ,total_hour=#{totalHour} ,class_type=#{classType} ,evaluation_mode=#{evaluationMode} WHERE id=#{id}" )
    void update(Course course);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM course WHERE id=#{id}")
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
    List<Course> selectByCondition(Course course);


}
