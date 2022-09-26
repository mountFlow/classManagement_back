package service.impl;

import mapper.AskMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Ask;
import pojo.ClassroomArrangement;
import service.AskService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class AskServiceImpl implements AskService {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Ask> selectAll() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        AskMapper askMapper = sqlSession.getMapper(AskMapper.class);
        //4.调用方法
        List<Ask> asks = askMapper.selectAll();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return asks;
    }

    @Override
    public int selectTotal() {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        AskMapper askMapper = sqlSession.getMapper(AskMapper.class);
        //4.调用方法
        int num = askMapper.selectTotal();
        //5.释放资源
        sqlSession.close();
        //6.返回获取的数据
        return num;
    }

    @Override
    public void add(Ask ask) {
        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        AskMapper askMapper = sqlSession.getMapper(AskMapper.class);
        //4.调用方法, 添加老师
        askMapper.add(ask);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
    }
    @Override
    public void update(Ask ask) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapper
        AskMapper askMapper = sqlSession.getMapper(AskMapper.class);
        //4.调用方法, 添加老师
        askMapper.update(ask);
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
        AskMapper askMapper = sqlSession.getMapper(AskMapper.class);
        //4.调用方法, 删除单个
        askMapper.deleteById(id);
        //5.提交
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
    }


    @Override
    public List<Ask> selectByCondition(Ask ask) {

        //2.获取sqlsession请求
        SqlSession sqlSession = factory.openSession();
        //3.获取teachermapperClassroomAvailable
        AskMapper askMapper = sqlSession.getMapper(AskMapper.class);
        //4.调用方法, 删除多个
        List<Ask> asks=askMapper.selectByCondition(ask);
        //6.释放资源
        sqlSession.close();
        return asks;
    }
}
