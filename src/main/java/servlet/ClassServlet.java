package servlet;

import com.alibaba.fastjson.JSON;
import pojo.ClassPojo;
import pojo.Teacher;
import service.ClassService;
import service.impl.ClassServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/class/*")
public class ClassServlet extends BaseServlet {
    private ClassService classService=new ClassServiceImpl();
    public void selectAllClasses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("class selectAll");
        //2.调用service进行查询
        List<ClassPojo> classes = classService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(classes);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void addClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("class add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        ClassPojo classPojo = JSON.parseObject(params, ClassPojo.class);
        System.out.println(classPojo);
        //3.调用service添加
        classService.add(classPojo);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void updateClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("class edit");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        ClassPojo classPojo = JSON.parseObject(params, ClassPojo.class);
        //3.调用service添加
        System.out.println(classPojo);
        classService.updateClass(classPojo);;
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("class add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        classService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void deleteClasses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个id类似）
        int[] ids = JSON.parseObject(params, int[].class);
        //3.调用service添加
        classService.deleteByIds(ids);
        //4.响应成功的标识
        response.getWriter().write("success");
    }
    public void selectClassesByCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classes selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        ClassPojo classPojo = JSON.parseObject(params, ClassPojo.class);


        //2.调用service进行查询
        List<ClassPojo> classes = classService.selectClassesByCondition(classPojo);
        //3.转为json
        String jsonString = JSON.toJSONString(classes);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
