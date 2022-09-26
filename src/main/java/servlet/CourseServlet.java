package servlet;

import com.alibaba.fastjson.JSON;
import pojo.Course;
import service.CourseService;
import service.impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/course/*")
public class CourseServlet extends BaseServlet {
    private CourseService courseService=new CourseServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course selectAll");
        //2.调用service进行查询
        List<Course> courses = courseService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(courses);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Course course = JSON.parseObject(params, Course.class);
        System.out.println(course);
        //3.调用service添加
        courseService.add(course);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course edit");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Course course = JSON.parseObject(params, Course.class);
        //3.调用service添加
        System.out.println(course);
        courseService.update(course);;
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course del");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        courseService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course dels");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个id类似）
        int[] ids = JSON.parseObject(params, int[].class);
        //3.调用service添加
        courseService.deleteByIds(ids);
        //4.响应成功的标识
        response.getWriter().write("success");
    }
    public void selectByCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Course course = JSON.parseObject(params, Course.class);


        //2.调用service进行查询
        List<Course> courses = courseService.selectByCondition(course);
        //3.转为json
        String jsonString = JSON.toJSONString(courses);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
