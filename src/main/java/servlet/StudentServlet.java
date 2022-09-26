package servlet;

import com.alibaba.fastjson.JSON;
import pojo.Student;
import pojo.StudentOrginal;
import service.StudentService;
import service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/student/*")
public class StudentServlet extends BaseServlet {
    private StudentService studentService=new StudentServiceImpl();
    public void selectAllStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("student selectAll");
        //2.调用service进行查询
        List<Student> students = studentService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(students);
        //4. 返回数据给html页面
        System.out.println(jsonString);
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }

    public void selectByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("student selectbyids");
        //2.调用service进行查询
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个id类似）
        int[] ids = JSON.parseObject(params, int[].class);
        //3.调用service添加
        studentService.selectByIds(ids);
        //4.响应成功的标识
        response.getWriter().write("success");


    }
    public void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("student add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        StudentOrginal studentOrginal= JSON.parseObject(params, StudentOrginal.class);
        System.out.println(studentOrginal);

        System.out.println(studentOrginal);
        //3.调用service添加
        studentService.add(studentOrginal);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("student edit");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        StudentOrginal studentOrginal= JSON.parseObject(params, StudentOrginal.class);
        //3.调用service添加
        System.out.println(studentOrginal);
        studentService.updateStudent(studentOrginal);
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("student del");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        studentService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void deleteStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("student dels");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个id类似）
        int[] ids = JSON.parseObject(params, int[].class);
        //3.调用service添加
        studentService.deleteByIds(ids);
        //4.响应成功的标识
        response.getWriter().write("success");
    }
    public void selectStudentsByCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("STUDENT selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        StudentOrginal studentOrginal = JSON.parseObject(params, StudentOrginal.class);
        //2.调用service进行查询
        System.out.println("temp1"+studentOrginal);
        List<StudentOrginal> studentOrginals = studentService.selectStudentsByCondition(studentOrginal);
        //将id取出来，用id来查询返回
        System.out.println("temp"+studentOrginals);
        int[] ids=new int[studentOrginals.size()];
        for (int i = 0; i<studentOrginals.size();i++) {
            ids[i]= studentOrginals.get(i).getId();
        }
        System.out.println("temp2"+studentOrginal);
        List<Student> students = studentService.selectByIds(ids);
        //3.转为json
        String jsonString = JSON.toJSONString(students);
        //4. 返回数据给html页面
        System.out.println(jsonString);
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
