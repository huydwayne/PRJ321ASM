/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import sample.products.ProductDAO;
import sample.products.ProductDTO;
import sample.products.ProductErrorMessage;
import sample.utils.FileImages;

/**
 *
 * @author HiGien
 */
@WebServlet(name = "CreateProductServlet", urlPatterns = {"/CreateProductServlet"})
@MultipartConfig
public class CreateProductServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final String HOME_PAGE = "showResult";
    private static final String CREATE_PAGE = "createForm.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        boolean rs = false;
        ProductErrorMessage msg = new ProductErrorMessage();
        try {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String price = request.getParameter("price");
            String description = request.getParameter("description");

            String imgUrl = null;
            Part filePart = request.getPart("image");
            if (filePart != null && filePart.getSize() > 0) {
                String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
                fileName = System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));
                InputStream fileContent = filePart.getInputStream();
                FileImages.writeImgToServerFile(fileName, fileContent);
                imgUrl = fileName;
            }
            boolean isChecked = true;
            if (id.trim().length() < 1 || id.trim().length() >= 20) {
                msg.setErrorId("ID length must > 0 and < 20");
                isChecked = false;
            }
            if (name.trim().length() < 1 || name.trim().length() >= 20) {
                msg.setErrorName("Name length must > 0 and < 20");
                isChecked = false;
            }
            if (description.trim().length() < 1 || name.trim().length() >= 20) {
                msg.setErrorDescription("description length must > 0 and < 20");
                isChecked = false;
            }
            if (price.trim().length() < 1 || Integer.parseInt(price) <= 0) {
                msg.setErrorPrice("Price must not empty and >0");
                isChecked = false;
            }
            if (imgUrl == null) {
                msg.setErrorImage("Image must not empty");
                isChecked = false;
            }
            if (isChecked) {
                ProductDAO dao = new ProductDAO();
                rs = dao.createProduct(new ProductDTO(id, name, description, Double.parseDouble(price), imgUrl));
            } else {
                request.setAttribute("msg", msg);
            }

        } catch (SQLException ex) {
            if (ex.getMessage().contains("duplicate")) {
                msg.setErrorDuplicate("Product id has existed");
                request.setAttribute("msg", msg);
            }
        } finally {
            if (rs) {
                response.sendRedirect(HOME_PAGE);
            } else {
                request.getRequestDispatcher(CREATE_PAGE).forward(request, response);
            }
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
