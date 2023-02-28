package com.example.JavaEE_HT2.controller;

import com.example.JavaEE_HT2.model.QueryBean;
import database_connector.Connector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "flatsForm", value = "/result")
public class FormFlatController extends HttpServlet {
    public void init() {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        QueryBean bean = new QueryBean();
        bean.setRegion(req.getParameter("region"));
        bean.setArea(Integer.parseInt(req.getParameter("area")));
        bean.setNoRooms(Integer.parseInt(req.getParameter("no_rooms")));
        bean.setPrice(Float.parseFloat(req.getParameter("price")));
        System.out.println(bean);
        req.getSession().setAttribute("set", Connector.getResultSet(bean));
        req.getServletContext().getRequestDispatcher("/result.jsp").forward(req, resp);
    }

    public void destroy() {
        try {
            Connector.closeCon();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}