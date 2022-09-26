package service.impl;
import mapper.CourseTeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.CourseTeacher;
import service.CourseTeacherService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class CourseTeacherServiceImpl implements CourseTeacherService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<CourseTeacher> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseTeacherMapper courseTeacherMapper = sqlSession.getMapper(CourseTeacherMapper.class);
        //4.调用方法
        List<CourseTeacher> courseTeachers = courseTeacherMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return courseTeachers;
    }

    @Override
    public void add(CourseTeacher courseTeacher) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseTeacherMapper courseTeacherMapper = sqlSession.getMapper(CourseTeacherMapper.class);
        //4.调用方法, 添加老师
        courseTeacherMapper.add(courseTeacher);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();


    }

    @Override
    public void update(CourseTeacher courseTeacher) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseTeacherMapper courseTeacherMapper = sqlSession.getMapper(CourseTeacherMapper.class);
        //4.调用方法, 添加老师
        courseTeacherMapper.update(courseTeacher);
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
        CourseTeacherMapper courseTeacherMapper = sqlSession.getMapper(CourseTeacherMapper.class);
        //4.调用方法, 删除单个
        courseTeacherMapper.deleteById(id);
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
        CourseTeacherMapper courseTeacherMapper = sqlSession.getMapper(CourseTeacherMapper.class);
        //4.调用方法, 删除多个
        courseTeacherMapper.deleteByIds(ids);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public List<CourseTeacher> selectByCondition(CourseTeacher courseTeacher) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        CourseTeacherMapper courseTeacherMapper = sqlSession.getMapper(CourseTeacherMapper.class);
        //4.调用方法, 删除多个
        List<CourseTeacher> courseTeachers=courseTeacherMapper.selectByCondition(courseTeacher);
        //6.释放资源
        sqlSession.close();
        return courseTeachers;
    }
}
