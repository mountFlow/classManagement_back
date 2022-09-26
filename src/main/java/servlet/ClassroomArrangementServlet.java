package servlet;

import com.alibaba.fastjson.JSON;
import pojo.ClassroomArrangement;
import service.ClassroomArrangementService;
import service.impl.ClassroomArrangementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/classroomArrangement/*")
public class ClassroomArrangementServlet extends BaseServlet {
    private ClassroomArrangementService classroomArrangementService=new ClassroomArrangementServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomArrangement selectAll");
        //2.调用service进行查询
        List<ClassroomArrangement> courses = classroomArrangementService.selectAll();
        //3.转为json
        String jsonString = JSON.toJSONString(courses);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomArrangement add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        ClassroomArrangement classroomArrangement = JSON.parseObject(params, ClassroomArrangement.class);
        System.out.println(classroomArrangement);
        //3.调用service添加
        classroomArrangementService.add(classroomArrangement);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomArrangement edit");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        ClassroomArrangement classroomArrangement = JSON.parseObject(params, ClassroomArrangement.class);
        //3.调用service添加
        System.out.println(classroomArrangement);
        classroomArrangementService.update(classroomArrangement);;
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("classroomArrangement del");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        classroomArrangementService.deleteById(id);
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
        classroomArrangementService.deleteByIds(ids);
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
        ClassroomArrangement classroomArrangement = JSON.parseObject(params, ClassroomArrangement.class);


        //2.调用service进行查询
        List<ClassroomArrangement> classroomArrangements = classroomArrangementService.selectByCondition(classroomArrangement);
        //3.转为json
        String jsonString = JSON.toJSONString(classroomArrangements);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
