package Servlets;

import Beans.Heroes;
import Daos.DaoHeroe;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletHeroe", value = "/ServletHeroe")
public class ServletHeroe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        action = (action == null) ? "listar" : action;

        DaoHeroe daoUsuarios = new DaoHeroe();
        RequestDispatcher requestDispatcher;
        Heroes heroes;
        String idHeroe;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
