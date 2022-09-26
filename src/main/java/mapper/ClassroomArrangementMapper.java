package mapper;

import org.apache.ibatis.annotations.*;
import pojo.ClassroomArrangement;

import java.util.List;

public interface ClassroomArrangementMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from classroom_arrangement")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("ClassroomArrangementResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<ClassroomArrangement> selectAll();

    /**
     * 添加数据
     * @param classroomArrangement
     */
    @Insert("INSERT INTO classroom_arrangement VALUES(null,#{classroomId},4,#{studentId},#{week},#{date},#{time})")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add(ClassroomArrangement classroomArrangement);

    /**
     * 编辑数据
     * @param classroomArrangement
     */
    @Update("UPDATE classroom_arrangement SET classroom_id=#{classroomId} ,course_teacher_id=4 ,student_id=#{studentId} ,week=#{week} ,date=#{date},time=#{time} WHERE id=#{id}" )
    void update(ClassroomArrangement classroomArrangement);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM classroom_arrangement WHERE id=#{id}")
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
    List<ClassroomArrangement> selectByCondition(ClassroomArrangement classroomArrangement);


}
