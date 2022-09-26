package servlet;

import com.alibaba.fastjson.JSON;
import pojo.Classroom;
import service.ClassroomService;
import service.impl.ClassroomServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/classroom/*")
public class ClassroomServlet extends BaseServlet {
    private ClassroomService classroomService=new ClassroomServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom selectAll");
        //2.调用service进行查询
        List<Classroom> classrooms = classroomService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(classrooms);
        //4. 返回数据给html页面
        //response.setHeader("Access-Control-Allow-Origin", "*");
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }

    public void selectAll3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom selectAll");
        //2.调用service进行查询
        List<Classroom> classrooms = classroomService.selectAll3();
        //3.转为json
        String jsonString = JSON.toJSONString(classrooms);
        //4. 返回数据给html页面
        //response.setHeader("Access-Control-Allow-Origin", "*");
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void selectAll4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom selectAll");
        //2.调用service进行查询
        List<Classroom> classrooms = classroomService.selectAll4();
        //3.转为json
        String jsonString = JSON.toJSONString(classrooms);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }

    public void selectAll3Lent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom selectAll3lent");
        //2.调用service进行查询
        List<Classroom> classrooms = classroomService.selectAll3Lent();
        //3.转为json
        String jsonString = JSON.toJSONString(classrooms);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void selectAll4Lent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom selectAll4lent");
        //2.调用service进行查询
        List<Classroom> classrooms = classroomService.selectAll4Lent();
        //3.转为json
        String jsonString = JSON.toJSONString(classrooms);
        //4. 返回数据给html页面
        System.out.println(jsonString);
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void add3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Classroom classroom = JSON.parseObject(params, Classroom.class);
        System.out.println(classroom);
        //3.调用service添加
        classroomService.add3(classroom);
        //4.响应成功的标识
        response.getWriter().write("success");
    }
    public void add4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Classroom classroom = JSON.parseObject(params, Classroom.class);
        System.out.println(classroom);
        //3.调用service添加
        classroomService.add4(classroom);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom edit");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Classroom classroom = JSON.parseObject(params, Classroom.class);
        //3.调用service添加
        System.out.println(classroom);
        classroomService.update(classroom);;
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom del");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        classroomService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Classroom dels");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个id类似）
        int[] ids = JSON.parseObject(params, int[].class);
        //3.调用service添加
        classroomService.deleteByIds(ids);
        //4.响应成功的标识
        response.getWriter().write("success");
    }
    public void selectByCondition3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Classroom classroom = JSON.parseObject(params, Classroom.class);


        //2.调用service进行查询
        List<Classroom> classrooms = classroomService.selectByCondition3(classroom);
        //3.转为json
        String jsonString = JSON.toJSONString(classrooms);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void selectByCondition4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("course selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Classroom classroom = JSON.parseObject(params, Classroom.class);


        //2.调用service进行查询
        List<Classroom> classrooms = classroomService.selectByCondition4(classroom);
        //3.转为json
        String jsonString = JSON.toJSONString(classrooms);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
