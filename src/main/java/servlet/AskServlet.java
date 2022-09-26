package servlet;

import com.alibaba.fastjson.JSON;
import pojo.Ask;
import service.AskService;
import service.impl.AskServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/studentAsk/*")
public class AskServlet extends BaseServlet {
    private AskService askService=new AskServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ask selectAll");

        //2.调用service进行查询
        List<Ask> asks = askService.selectAll();
        System.out.println(asks);
        //3.转为json
        String jsonString = JSON.toJSONString(asks);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void selectTotal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ask selectTotal");

        //2.调用service进行查询
        int num = askService.selectTotal();
        System.out.println(num);
        //3.转为json
        String jsonString = JSON.toJSONString(num);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ask add");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Ask ask = JSON.parseObject(params, Ask.class);
        System.out.println(ask);
        //3.调用service添加
        askService.add(ask);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Ask update");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Ask ask = JSON.parseObject(params, Ask.class);
        //3.调用service添加
        System.out.println(ask);
        askService.update(ask);;
        //4.响应成功的标识
        response.getWriter().write("success");
    }


    public void deleteById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ask del");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象(如果是传某个值，就只传一个属性的类型）
        int id = JSON.parseObject(params, Integer.class);
        //3.调用service添加
        askService.deleteById(id);
        //4.响应成功的标识
        response.getWriter().write("success");
    }

    public void selectByCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ask selectByCondition");
        //1.接收品牌数据,获取json格式提交过来的数据
        request.setCharacterEncoding("UTF-8");
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        System.out.println(params);
        //2.json字符串转换为对象
        Ask ask = JSON.parseObject(params, Ask.class);


        //2.调用service进行查询
        List<Ask> asks = askService.selectByCondition(ask);
        //3.转为json
        String jsonString = JSON.toJSONString(asks);
        //4. 返回数据给html页面
        response.setContentType("text/json;charset=UTF-8");
        response.getWriter().write(jsonString);

    }


}
