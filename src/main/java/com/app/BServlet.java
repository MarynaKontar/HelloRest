package com.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by denys on 7/4/2017.
 *///без аннотации @WebServlet тоже работает
public class BServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String varTextA = "Hello World!";
//        req.setAttribute("textA", varTextA);
//        String varTextB = "It JSP.";
//        req.setAttribute("textB", varTextB);
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.html");
//        dispatcher.forward(req, resp);


        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
       resp.getWriter().println("Hihihihih");

    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("ServletB");
//
//
//    }
}