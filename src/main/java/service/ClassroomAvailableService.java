package service;

import pojo.ClassroomArrangement;
import pojo.ClassroomAvailable;

import java.util.List;

public interface ClassroomAvailableService {

    /**
     * 查询所有老师
     * @return
     */
    List<ClassroomAvailable> selectAll();

    /**
     * 添加老师
     * @param classroomAvailable
     */
    void add(ClassroomAvailable classroomAvailable);


    /**
     * 删除单个老师
     * @param id
     */
    void deleteById(int id);

   /**
     *  条件查询
     * @return
     */
    List<ClassroomAvailable> selectByCondition(ClassroomAvailable classroomAvailable);

}
