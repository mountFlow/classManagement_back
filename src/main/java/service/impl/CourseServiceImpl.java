package service.impl;

import mapper.CourseMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Course;
import service.CourseService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Course> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.调用方法
        List<Course> courses = courseMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return courses;
    }

    @Override
    public void add(Course course) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.调用方法, 添加老师
        courseMapper.add(course);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();


    }

    @Override
    public void update(Course course) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.调用方法, 添加老师
        courseMapper.update(course);
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
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.调用方法, 删除单个
        courseMapper.deleteById(id);
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
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.调用方法, 删除多个
        courseMapper.deleteByIds(ids);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public List<Course> selectByCondition(Course course) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        //4.调用方法, 删除多个
        List<Course> courses=courseMapper.selectByCondition(course);
        //6.释放资源
        sqlSession.close();
        return courses;
    }
}
