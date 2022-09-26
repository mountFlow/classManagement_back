package mapper;

import org.apache.ibatis.annotations.*;
import pojo.CourseTeacher;

import java.util.List;

public interface CourseTeacherMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from course_teacher")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("courseTeacherResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<CourseTeacher> selectAll();

    /**
     * 添加数据
     * @param courseTeacher
     */
    @Insert("INSERT INTO course_teacher VALUES(null,#{courseId},#{teacherId})")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add(CourseTeacher courseTeacher);

    /**
     * 编辑数据
     * @param courseTeacher
     */
    @Update("UPDATE course_teacher SET teacher_id=#{teacherId} ,course_id=#{courseId} WHERE id=#{id}" )
    void update(CourseTeacher courseTeacher);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM course_teacher WHERE id=#{id}")
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
    List<CourseTeacher> selectByCondition(CourseTeacher courseTeacher);


}
