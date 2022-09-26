package service.impl;

import mapper.StudentMapper;
import mapper.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Student;
import pojo.Teacher;
import service.StudentService;
import service.TeacherService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Teacher> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        //4.调用方法
        List<Teacher> teachers = teacherMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return teachers;
    }

    @Override
    public void add(Teacher teacher) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        //4.调用方法, 添加老师
        teacherMapper.add(teacher);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();


    }

    @Override
    public void updateTeacher(Teacher teacher) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        //4.调用方法, 添加老师
        teacherMapper.update(teacher);
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
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        //4.调用方法, 删除单个
        teacherMapper.deleteById(id);
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
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        //4.调用方法, 删除多个
        teacherMapper.deleteByIds(ids);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public List<Teacher> selectTeachersByCondition(Teacher teacher) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        //4.调用方法, 删除多个
        List<Teacher> teachers=teacherMapper.selectTeachersByCondition(teacher);
        //6.释放资源
        sqlSession.close();
        return teachers;
    }
}
