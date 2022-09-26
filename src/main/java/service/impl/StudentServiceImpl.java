package service.impl;

import mapper.StudentMapper;
import mapper.StudentMapper;
import mapper.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Student;
import pojo.StudentOrginal;
import pojo.Student;
import pojo.Teacher;
import service.StudentService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Student> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        //4.调用方法
        List<Student> students = studentMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return students;
    }
    @Override
    public List<Student> selectByIds(int[] ids) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        //4.调用方法
        List<Student> students = studentMapper.selectByIds(ids);
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return students;
    }
    @Override
    public void add(StudentOrginal studentOrginal) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        //4.调用方法, 添加老师
        studentMapper.add(studentOrginal);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
    }
    @Override
    public void updateStudent(StudentOrginal studentOrginal) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        //4.调用方法, 添加老师
        studentMapper.update(studentOrginal);
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
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        //4.调用方法, 删除单个
        studentMapper.deleteById(id);
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
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        //4.调用方法, 删除多个
        studentMapper.deleteByIds(ids);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public List<StudentOrginal> selectStudentsByCondition(StudentOrginal studentOrginal) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        //4.调用方法, 删除多个
        List<StudentOrginal> studentOrginals=studentMapper.selectStudentsByCondition(studentOrginal);
        System.out.println("inservice:"+studentOrginals);

        //6.释放资源
        sqlSession.close();
        return studentOrginals;
    }
}
