package service;


import pojo.Ask;
import pojo.ClassroomArrangement;

import java.util.List;

public interface AskService {

    /**
     * 查询所有老师
     * @return
     */
    List<Ask> selectAll();

    int selectTotal();

    /**
     * 添加老师
     * @param ask
     */
    void add(Ask ask);

    void update(Ask ask);


    /**
     * 删除单个老师
     * @param id
     */
    void deleteById(int id);

   /**
     *  条件查询
     * @return
     */
    List<Ask> selectByCondition(Ask ask);

}
