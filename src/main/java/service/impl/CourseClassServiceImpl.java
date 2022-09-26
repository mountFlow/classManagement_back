package service.impl;

import mapper.CourseClassMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.CourseClass;
import service.CourseClassService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class CourseClassServiceImpl implements CourseClassService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<CourseClass> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseClassMapper courseClassMapper = sqlSession.getMapper(CourseClassMapper.class);
        //4.调用方法
        List<CourseClass> courseClasses = courseClassMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return courseClasses;
    }

    @Override
    public void add(CourseClass courseClass) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseClassMapper courseClassMapper = sqlSession.getMapper(CourseClassMapper.class);
        //4.调用方法, 添加老师
        courseClassMapper.add(courseClass);
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
        CourseClassMapper courseClassMapper = sqlSession.getMapper(CourseClassMapper.class);
        //4.调用方法, 删除单个
        courseClassMapper.deleteById(id);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
    }


}
