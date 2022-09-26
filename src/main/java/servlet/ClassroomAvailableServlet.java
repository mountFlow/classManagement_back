package servlet;

import com.alibaba.fastjson.JSON;
import pojo.ClassroomAvailable;
import service.ClassroomAvailableService;
import service.impl.ClassroomAvailableServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/classroomAvailable/*")
public class ClassroomAvailableServlet extends BaseServlet {
    private ClassroomAvailableService classroomAvailableService=new ClassroomAvailableServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomAvailable selectAll");
        //2.调用service进行查询
        List<ClassroomAvailable> courses = classroomAvailableService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(courses);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomAvailable add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        ClassroomAvailable classroomAvailable = JSON.parseObject(params, ClassroomAvailable.class);
        System.out.println(classroomAvailable);
        //3.调用service添加
        classroomAvailableService.add(classroomAvailable);
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomAvailable del");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        classroomAvailableService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void selectByCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomAvailable selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        ClassroomAvailable classroomAvailable = JSON.parseObject(params, ClassroomAvailable.class);


        //2.调用service进行查询
        List<ClassroomAvailable> classroomAvailables = classroomAvailableService.selectByCondition(classroomAvailable);
        //3.转为json
        String jsonString = JSON.toJSONString(classroomAvailables);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
