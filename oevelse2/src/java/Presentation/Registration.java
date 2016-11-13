package Presentation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Nov 8, 2016
 */
@WebServlet(name="Registration", urlPatterns={"/Registration"})
public class Registration extends HttpServlet {
    private static final String UPLOAD = "upload";
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String firstname = request.getParameter("fornavn");
        String lastname = request.getParameter("efternavn");
        String city = request.getParameter("by");
        String mail = request.getParameter("email");
        String phone = request.getParameter("mobil");
        String year = request.getParameter("fødselsår");
        String sex = request.getParameter("køn");
        String picture = request.getParameter("billede");
        String description = request.getParameter("beskrivelse");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Formularens data</title>");
            out.println("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />");
            out.println("</head>");
            out.println("<body>");            
            out.println("<div id=\"navneboksen\">");
            out.println(""+firstname+"");
            out.println("</div>");
            out.println("<h1>Tabel med data fra formularen:</h1>");
            out.println("<div id=\"tableDiv\">");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Fornavn:</td><td>"+firstname+"</td>");
            out.println("</tr>");            
            out.println("<tr>");
            out.println("<td>Efternavn:</td><td>"+lastname+"</td>");
            out.println("</tr>");            
            out.println("<tr>");
            out.println("<td>By:</td><td>"+city+"</td>");
            out.println("</tr>");            
            out.println("<tr>");
            out.println("<td>E-mail:</td><td>"+mail+"</td>");
            out.println("</tr>");            
            out.println("<tr>");
            out.println("<td>Mobilnummer:</td><td>"+phone+"</td>");
            out.println("</tr>");            
            out.println("<tr>");
            out.println("<td>Fødselsår:</td><td>"+year+"</td>");
            out.println("</tr>");            
            out.println("<tr>");
            out.println("<td>Køn:</td><td>"+sex+"</td>");
            out.println("</tr>");            
            out.println("<tr>");
            out.println("<td>Beskrivelse:</td><td>"+description+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Billede:</td><td><img src=\""+picture+"\"/></td>");
            out.println("</tr>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
