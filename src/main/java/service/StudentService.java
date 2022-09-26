package service;

import pojo.Student;
import pojo.StudentOrginal;

import java.util.List;

public interface StudentService {

    /**
     * 查询所有老师
     * @return
     */
    List<Student> selectAll();

    /**
     * 查询所有老师
     * @return
     */
    List<Student> selectByIds(int[] ids);

    /**
     * 添加老师
     * @param studentOrginal
     */
    void add(StudentOrginal studentOrginal);

    /**
     * 编辑数据
     * @param studentOrginal
     */
    void updateStudent(StudentOrginal studentOrginal);

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
    List<StudentOrginal> selectStudentsByCondition(StudentOrginal studentOrginal);

}
