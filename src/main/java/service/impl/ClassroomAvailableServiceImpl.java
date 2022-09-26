package service.impl;

import mapper.ClassroomAvailableMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.ClassroomAvailable;
import service.ClassroomArrangementService;
import service.ClassroomAvailableService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class ClassroomAvailableServiceImpl implements ClassroomAvailableService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<ClassroomAvailable> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomAvailableMapper classroomAvailableMapper = sqlSession.getMapper(ClassroomAvailableMapper.class);
        //4.调用方法
        List<ClassroomAvailable> classroomAvailables = classroomAvailableMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classroomAvailables;
    }

    @Override
    public void add(ClassroomAvailable classroomAvailable) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomAvailableMapper classroomAvailableMapper = sqlSession.getMapper(ClassroomAvailableMapper.class);
        //4.调用方法, 添加老师
        classroomAvailableMapper.add(classroomAvailable);
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
        ClassroomAvailableMapper classroomAvailableMapper = sqlSession.getMapper(ClassroomAvailableMapper.class);
        //4.调用方法, 删除单个
        classroomAvailableMapper.deleteById(id);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
    }


    @Override
    public List<ClassroomAvailable> selectByCondition(ClassroomAvailable classroomAvailable) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapperClassroomAvailable
        ClassroomAvailableMapper classroomAvailableMapper = sqlSession.getMapper(ClassroomAvailableMapper.class);
        //4.调用方法, 删除多个
        List<ClassroomAvailable> classroomAvailables=classroomAvailableMapper.selectByCondition(classroomAvailable);
        //6.释放资源
        sqlSession.close();
        return classroomAvailables;
    }
}
