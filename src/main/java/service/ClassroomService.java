package service;

import pojo.Classroom;
import pojo.Course;

import java.util.List;

public interface ClassroomService {

    /**
     * 查询所有老师
     * @return
     */
    List<Classroom> selectAll3();

    /**
     * 查询所有老师
     * @return
     */
    List<Classroom> selectAll4();

    List<Classroom> selectAll3Lent();

    /**
     * 查询所有老师
     * @return
     */
    List<Classroom> selectAll4Lent();

    List<Classroom> selectAll();

    /**
     * 添加老师
     * @param classroom
     */
    void add3(Classroom classroom);

    /**
     * 添加老师
     * @param classroom
     */
    void add4(Classroom classroom);

    /**
     * 编辑数据
     * @param classroom
     */
    void update(Classroom classroom);

    /**
     * 删除单个老师
     * @param id
     */
    void deleteById(int id);

    /**
     * 批量删除老师
     * @param ids
     */
    void deleteByIds(int[] ids);

    /**
     *  条件查询
     * @return
     */
    List<Classroom> selectByCondition3(Classroom classroom);

    List<Classroom> selectByCondition4(Classroom classroom);

}
