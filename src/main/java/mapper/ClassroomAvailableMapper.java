package mapper;

import org.apache.ibatis.annotations.*;
import pojo.ClassroomArrangement;
import pojo.ClassroomAvailable;

import java.util.List;

public interface ClassroomAvailableMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from classroom_available")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("ClassroomAvailableResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<ClassroomAvailable> selectAll();

    /**
     * 添加数据
     * @param classroomAvailable
     */
    @Insert("INSERT INTO classroom_available VALUES(null,#{classroomId},#{week},#{date},#{time})")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add(ClassroomAvailable classroomAvailable);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM classroom_available WHERE id=#{id}")
    void deleteById(int id);

    /**
     * 条件查询
     * @return
     */
    List<ClassroomAvailable> selectByCondition(ClassroomAvailable classroomAvailable);


}
