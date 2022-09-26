package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Ask;
import pojo.ClassroomArrangement;
import pojo.ClassroomAvailable;

import java.util.List;

public interface AskMapper {

    /**
     * 查询所有
     * @return
     */
    //1.设置sql语句
    @Select("select * from ask")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("AskResultMap")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    List<Ask> selectAll();

    @Select("select count(*) from ask WHERE status = '等待审核'")
    //2.设置对应的resultMap，用于关联起数据库的下划线命名和java的驼峰命名
    @ResultMap("AskResultMap")
        //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    int selectTotal();

    /**
     * 编辑数据
     * @param ask
     */
    @Update("UPDATE ask SET  status=#{status} WHERE id=#{id}" )
    void update(Ask ask );

    /**
     * 添加数据
     * @param ask
     */
    @Insert("INSERT INTO ask VALUES(null,#{classroomId},#{studentId},#{week},#{date},#{time},#{status})")
    //需要回传数据并且是注解开发，就要在这里加resultmap，否则在xml中指定
    void add(Ask ask);

    /**
     * 删除数据
     * @param id
     */
    @Delete("DELETE FROM ask WHERE id=#{id}")
    void deleteById(int id);

    /**
     * 条件查询
     * @return
     */
    List<Ask> selectByCondition(Ask ask);


}
