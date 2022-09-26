package service.impl;

import mapper.ClassMapper;
import mapper.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.ClassPojo;
import pojo.Teacher;
import service.ClassService;
import service.TeacherService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class ClassServiceImpl implements ClassService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<ClassPojo> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
        //4.调用方法
        List<ClassPojo> classes = classMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classes;
    }

    @Override
    public void add(ClassPojo classPojo) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
        //4.调用方法, 添加老师
        classMapper.add(classPojo);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();


    }

    @Override
    public void updateClass(ClassPojo classPojo) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
        //4.调用方法, 添加老师
        classMapper.update(classPojo);
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
        ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
        //4.调用方法, 删除单个
        classMapper.deleteById(id);
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
        ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
        //4.调用方法, 删除多个
        classMapper.deleteByIds(ids);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public List<ClassPojo> selectClassesByCondition(ClassPojo classPojo) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
        //4.调用方法, 删除多个
        List<ClassPojo> classes=classMapper.selectClassesByCondition(classPojo);
        //6.释放资源
        sqlSession.close();
        return classes;
    }
}
