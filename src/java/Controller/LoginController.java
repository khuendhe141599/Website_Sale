/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ControllerDAO.DAO;
import entity.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Khue Nguyen
 */
@WebServlet(name = "LoginController", urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        HttpSession session = request.getSession();
        DAO dao = new DAO();
        Account a = (Account) dao.checkAccount(user, pass);

        if (a != null) {
            String remember = request.getParameter("remember");
            if (remember != null) {

                Cookie c_user = new Cookie("username", user);
                Cookie c_pass = new Cookie("password", pass);

                c_user.setMaxAge(3600 * 24 * 30);
                c_pass.setMaxAge(3600 * 24 * 30);

                response.addCookie(c_user);
                response.addCookie(c_pass);

            }
            session.setAttribute("account", a);

            session.setAttribute("user", a.getUsername());
            session.setAttribute("email", a.getEmail());
            session.setAttribute("address", a.getAddress());
            session.setAttribute("phone", a.getPhone());
            session.setAttribute("date1", a.getDate());
            session.setAttribute("id", a.getId());
            if (a.getId() == 1) {
                request.getRequestDispatcher("Admin.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("pagingController").forward(request, response);
            }
        } else {
            request.setAttribute("MessError", "Login Failed. Please check again.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
