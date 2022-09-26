package service;

import pojo.ClassPojo;
import pojo.Teacher;

import java.util.List;

public interface ClassService {

    /**
     * 查询所有老师
     * @return
     */
    List<ClassPojo> selectAll();

    /**
     * 添加老师
     * @param classPojo
     */
    void add(ClassPojo classPojo);

    /**
     * 编辑数据
     * @param classPojo
     */
    void updateClass(ClassPojo classPojo);

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
    List<ClassPojo> selectClassesByCondition(ClassPojo classPojo);

}
