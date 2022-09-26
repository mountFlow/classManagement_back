package service;

import pojo.ClassroomArrangement;

import java.util.List;

public interface ClassroomArrangementService {

    /**
     * 查询所有老师
     * @return
     */
    List<ClassroomArrangement> selectAll();

    /**
     * 添加老师
     * @param classroomArrangement
     */
    void add(ClassroomArrangement classroomArrangement);

    /**
     * 编辑数据
     * @param classroomArrangement
     */
    void update(ClassroomArrangement classroomArrangement);

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
    List<ClassroomArrangement> selectByCondition(ClassroomArrangement classroomArrangement);

}
