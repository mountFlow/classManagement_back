package service;

import pojo.Teacher;

import java.util.List;

public interface TeacherService {

    /**
     * 查询所有老师
     * @return
     */
    List<Teacher> selectAll();

    /**
     * 添加老师
     * @param teacher
     */
    void add(Teacher teacher);

    /**
     * 编辑数据
     * @param teacher
     */
    void updateTeacher(Teacher teacher);

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
    List<Teacher> selectTeachersByCondition(Teacher teacher);

}
