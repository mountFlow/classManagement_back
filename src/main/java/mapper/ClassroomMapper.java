package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Classroom;
import pojo.Course;

import java.util.List;

public interface ClassroomMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from classroom")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("classroomResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Classroom> selectAll();
    //1.设置sql语句
    @Select("select * from classroom where building=3")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("classroomResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Classroom> selectAll3();

    //1.设置sql语句
    @Select("select * from classroom where building=4")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("classroomResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Classroom> selectAll4();



    //1.设置sql语句
    @Select("select * from classroom where building=3 and lent_status =0")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("classroomResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Classroom> selectAll3Lent();

    //1.设置sql语句
    @Select("select * from classroom where building=4 and lent_status =0")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("classroomResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Classroom> selectAll4Lent();


    /**
     * 添加数据
     * @param classroom
     */
    @Insert("INSERT INTO classroom VALUES(null,3,#{floor},#{num},#{type},0,#{lentStatus})")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add3(Classroom classroom);

    @Insert("INSERT INTO classroom VALUES(null,4,#{floor},#{num},#{type},0,#{lentStatus})")
        //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add4(Classroom classroom);

    /**
     * 编辑数据
     * @param classroom
     */
    @Update("UPDATE classroom SET floor=#{floor} ,num=#{num} ,type=#{type} ,status=#{status} ,lent_status=#{lentStatus} WHERE id=#{id}" )
    void update(Classroom classroom);


    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM classroom WHERE id=#{id}")
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
    List<Classroom> selectByCondition3(Classroom classroom);

    /**
     * 条件查询
     * @return
     */
    List<Classroom> selectByCondition4(Classroom classroom);


}
