package service;

import pojo.CourseClass;

import java.util.List;

public interface CourseClassService {

    /**
     * 查询所有老师
     * @return
     */
    List<CourseClass> selectAll();

    /**
     * 添加
     * @param courseClass
     */
    void add(CourseClass courseClass);

    /**
     * 删除单个老师
     * @param id
     */
    void deleteById(int id);



}
