package service;

import pojo.CourseTeacher;

import java.util.List;

public interface CourseTeacherService {

    /**
     * 查询所有老师
     * @return
     */
    List<CourseTeacher> selectAll();

    /**
     * 添加老师
     * @param courseTeacher
     */
    void add(CourseTeacher courseTeacher);

    /**
     * 编辑数据
     * @param courseTeacher
     */
    void update(CourseTeacher courseTeacher);

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
    List<CourseTeacher> selectByCondition(CourseTeacher courseTeacher);

}
