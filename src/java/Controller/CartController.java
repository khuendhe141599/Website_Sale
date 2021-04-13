/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ControllerDAO.DAO;
import entity.productCart;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Khue Nguyen
 */
@WebServlet(name = "CartController", urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

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

        HttpSession session = request.getSession();
        int quatity = 1, count = 0, tax = 0;
        float sum = 0;
        DAO dao = new DAO();

        String name = request.getParameter("pName");
        String userName = (String) session.getAttribute("user");
        int id = Integer.parseInt(request.getParameter("sId"));
        float price = Float.parseFloat(request.getParameter("price"));
        String image = request.getParameter("img");

        productCart cartItems = dao.getItemCartByName(id, userName);

        if (cartItems == null) {
            dao.insertToCart(id, name, (float) price, image, userName, quatity);
        } else if (cartItems != null) {
            quatity = cartItems.getQuatity() + 1;
            dao.updateQuatity(id, quatity);
        }

        List<productCart> list1 = dao.list(userName);
        if (list1 != null) {
            for (productCart cart : list1) {
                count += cart.getQuatity();
                sum = sum + Float.parseFloat(cart.getPrice()) * (float) (cart.getQuatity());
            }
        }

        if (sum >= 150) {
            tax = 0;
        } else if (sum > 0 && sum < 150) {
            tax = 3;
        } else {
            tax = 0;
        }

        session.setAttribute("Tax", tax);
        session.setAttribute("listC", list1);
        session.setAttribute("countProduct", count);
        session.setAttribute("Sum", sum);

        request.setAttribute("list", list1);
        request.getRequestDispatcher("pagingController").forward(request, response);
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
