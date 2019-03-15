package com.education.demo.servlet;

import com.education.demo.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by issuser on 2019/3/15.
 */
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public StudentServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("aa", "aa");
        Student s1 = new Student();
        s1.setName("张三");
        Student s2 = new Student();
        s2.setName("李四");
        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        req.setAttribute("list", list);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }
}
