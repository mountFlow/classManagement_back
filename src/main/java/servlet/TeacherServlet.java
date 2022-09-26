package servlet;

import com.alibaba.fastjson.JSON;
import pojo.Teacher;
import service.TeacherService;
import service.impl.TeacherServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/teacher/*")
public class TeacherServlet extends BaseServlet {
    private TeacherService teacherService=new TeacherServiceImpl();
    public void selectAllTeachers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("teacher selectAll");
        //2.调用service进行查询
        List<Teacher> teachers = teacherService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(teachers);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void addTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("teacher add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Teacher teacher = JSON.parseObject(params, Teacher.class);
        System.out.println(teacher);
        //3.调用service添加
        teacherService.add(teacher);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void updateTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("teacher edit");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Teacher teacher = JSON.parseObject(params, Teacher.class);
        //3.调用service添加
        System.out.println(teacher);
        teacherService.updateTeacher(teacher);;
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("teacher add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        teacherService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void deleteTeachers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("teacher add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个id类似）
        int[] ids = JSON.parseObject(params, int[].class);
        //3.调用service添加
        teacherService.deleteByIds(ids);
        //4.响应成功的标识
        response.getWriter().write("success");
    }
    public void selectTeachersByCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("teacher selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Teacher teacher = JSON.parseObject(params, Teacher.class);


        //2.调用service进行查询
        List<Teacher> teachers = teacherService.selectTeachersByCondition(teacher);
        //3.转为json
        String jsonString = JSON.toJSONString(teachers);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
