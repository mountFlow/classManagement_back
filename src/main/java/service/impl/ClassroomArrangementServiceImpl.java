package service.impl;

import mapper.ClassroomArrangementMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.ClassroomArrangement;
import service.ClassroomArrangementService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class ClassroomArrangementServiceImpl implements ClassroomArrangementService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<ClassroomArrangement> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomArrangementMapper classroomArrangementMapper = sqlSession.getMapper(ClassroomArrangementMapper.class);
        //4.调用方法
        List<ClassroomArrangement> classroomArrangements = classroomArrangementMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classroomArrangements;
    }

    @Override
    public void add(ClassroomArrangement classroomArrangement) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomArrangementMapper classroomArrangementMapper = sqlSession.getMapper(ClassroomArrangementMapper.class);
        //4.调用方法, 添加老师
        classroomArrangementMapper.add(classroomArrangement);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();


    }

    @Override
    public void update(ClassroomArrangement classroomArrangement) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomArrangementMapper classroomArrangementMapper = sqlSession.getMapper(ClassroomArrangementMapper.class);
        //4.调用方法, 添加老师
        classroomArrangementMapper.update(classroomArrangement);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public void deleteById(int id) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomArrangementMapper classroomArrangementMapper = sqlSession.getMapper(ClassroomArrangementMapper.class);
        //4.调用方法, 删除单个
        classroomArrangementMapper.deleteById(id);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomArrangementMapper classroomArrangementMapper = sqlSession.getMapper(ClassroomArrangementMapper.class);
        //4.调用方法, 删除多个
        classroomArrangementMapper.deleteByIds(ids);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public List<ClassroomArrangement> selectByCondition(ClassroomArrangement classroomArrangement) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomArrangementMapper classroomArrangementMapper = sqlSession.getMapper(ClassroomArrangementMapper.class);
        //4.调用方法, 删除多个
        List<ClassroomArrangement> classroomArrangements=classroomArrangementMapper.selectByCondition(classroomArrangement);
        //6.释放资源
        sqlSession.close();
        return classroomArrangements;
    }
}
