/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.users.UserDAO;
import sample.users.UserDTO;
import sample.users.UserErrorMessage;

/**
 *
 * @author HiGien
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})

public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final String LOGIN_PAGE = "login.jsp";
    private static final String REGISTER_PAGE = "register.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = REGISTER_PAGE;
        UserErrorMessage msg = new UserErrorMessage();;
        
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String passwordConfirm = request.getParameter("passwordConfirm");
            String name = request.getParameter("name");

            boolean isChecked = true;
            if (username.trim().length() <= 6 || username.trim().length() >= 20) {
                msg.setErrorUsername("Username length must > 6 and < 20");
                isChecked = false;
            }
            if (password.trim().length() <= 6 || password.trim().length() >= 20) {
                msg.setErrorPassword("Password length must > 6 and < 20");
                isChecked = false;
            }
            if (name.trim().length() <= 6 || name.trim().length() >= 20) {
                msg.setErrorName("Name length must > 6 and < 20");
                isChecked = false;
            }
            if (!password.trim().equals(passwordConfirm.trim())) {
                msg.setErrorConfirm("Password Confirm must equal to password");
                isChecked = false;
            }
            if (isChecked) {
                UserDAO dao = new UserDAO();

                dao.createUser(new UserDTO(username, password, name, false));
                url = LOGIN_PAGE;
            }
            
        } catch (SQLException e) {
            if (e.getMessage().contains("duplicate")) {
                msg.setErrorDuplicate("Username has existed");
            }
        } finally {
            request.setAttribute("errorMsg", msg);
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
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
