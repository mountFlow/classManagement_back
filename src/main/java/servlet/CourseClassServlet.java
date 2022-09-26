package servlet;

import com.alibaba.fastjson.JSON;
import pojo.CourseClass;
import service.CourseClassService;
import service.impl.CourseClassServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/courseClass/*")
public class CourseClassServlet extends BaseServlet {
    private CourseClassService courseClassService=new CourseClassServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("courseClass selectAll");
        //2.调用service进行查询
        List<CourseClass> courseClasses = courseClassService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(courseClasses);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("courseClass add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        CourseClass courseClass = JSON.parseObject(params, CourseClass.class);
        System.out.println(courseClass);
        //3.调用service添加
        courseClassService.add(courseClass);
        //4.响应成功的标识
        response.getWriter().write("success");
    }



    public void deleteById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("courseClass del");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        courseClassService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }




}
