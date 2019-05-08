package cl.controller;

import cl.model.Cliente;
import cl.model.ServicioLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sistemas
 */
@WebServlet(name = "Controller", urlPatterns = {"/control.do"})
public class Controller extends HttpServlet {

    @EJB
    private ServicioLocal servicio;

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String btn = request.getParameter("boton");
        
        switch (btn) {
            case "guardar":
                this.guardar(request, response);
                break;
            case "eliminar":
                this.eliminar(request, response);
                break;
            case "actualizar":
                this.actualizar(request, response);
                break;
//            default:
//                throw new AssertionError();
        }
        
        
    }
    
    protected void guardar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        
        Cliente cli = new Cliente(rut,nombre,apellido);
        servicio.agregarCliente(cli);
        
        response.sendRedirect("index.jsp");
        
    }
    
    protected void actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        
        Cliente cli = new Cliente(rut,nombre,apellido);
        servicio.actualizar(rut, nombre, apellido);
        
        response.sendRedirect("index.jsp");
        
    }
    
    protected void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String rut = request.getParameter("rut");
                
        servicio.eliminar(rut);
        
        response.sendRedirect("index.jsp");
        
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
