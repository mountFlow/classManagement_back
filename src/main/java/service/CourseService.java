package service;

import pojo.Course;

import java.util.List;

public interface CourseService {

    /**
     * 查询所有老师
     * @return
     */
    List<Course> selectAll();

    /**
     * 添加老师
     * @param course
     */
    void add(Course course);

    /**
     * 编辑数据
     * @param course
     */
    void update(Course course);

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
    List<Course> selectByCondition(Course course);

}
