package service.impl;

import mapper.ClassroomMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Classroom;
import service.ClassroomService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class ClassroomServiceImpl implements ClassroomService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Classroom> selectAll3() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法
        List<Classroom> classrooms = classroomMapper.selectAll3();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classrooms;
    }
    @Override
    public List<Classroom> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法
        List<Classroom> classrooms = classroomMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classrooms;
    }
    @Override
    public List<Classroom> selectAll4() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法
        List<Classroom> classrooms = classroomMapper.selectAll4();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classrooms;
    }

    @Override
    public List<Classroom> selectAll4Lent() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法
        List<Classroom> classrooms = classroomMapper.selectAll4Lent();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classrooms;
    }
    @Override
    public List<Classroom> selectAll3Lent() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法
        List<Classroom> classrooms = classroomMapper.selectAll3Lent();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return classrooms;
    }

    @Override
    public void add3(Classroom classroom) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法, 添加老师
        classroomMapper.add3(classroom);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }
    @Override
    public void add4(Classroom classroom) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法, 添加老师
        classroomMapper.add4(classroom);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
    }
    @Override
    public void update(Classroom classroom) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法, 添加老师
        classroomMapper.update(classroom);
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
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法, 删除单个
        classroomMapper.deleteById(id);
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
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法, 删除多个
        classroomMapper.deleteByIds(ids);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

    @Override
    public List<Classroom> selectByCondition3(Classroom classroom) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法, 删除多个
        List<Classroom> courses=classroomMapper.selectByCondition3(classroom);
        //6.释放资源
        sqlSession.close();
        return courses;
    }

    @Override
    public List<Classroom> selectByCondition4(Classroom classroom) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        ClassroomMapper classroomMapper = sqlSession.getMapper(ClassroomMapper.class);
        //4.调用方法, 删除多个
        List<Classroom> courses=classroomMapper.selectByCondition4(classroom);
        //6.释放资源
        sqlSession.close();
        return courses;
    }
}
