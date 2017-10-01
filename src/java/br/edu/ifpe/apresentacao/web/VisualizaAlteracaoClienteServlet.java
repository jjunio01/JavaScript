/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.apresentacao.web;

import br.edu.ifpe.controladores.Fachada;
import br.edu.ifpe.negocio.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1860915
 */
@WebServlet(name = "VisualizaAlteracaoClienteServlet", urlPatterns = {"/VisualizaAlteracaoClienteServlet"})
public class VisualizaAlteracaoClienteServlet extends HttpServlet {

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
        
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        
        Cliente cliente = Fachada.getInstance().recuperarCliente(codigo);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VisualizaAlteracaoClienteServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Alterar Cliente</h1>");
            out.println("<form method='post' action='AlteraClienteServlet'>");
            out.println("Código:"+cliente.getCodigo()+"<input type='hidden' name='codigo' value='"+cliente.getCodigo()+"'><br/>");
            out.println("Nome:<input type='text' name='nome' value='"+cliente.getNome()+"'><br/>");
            out.println("CPF:<input type='text' name='cpf' value='"+cliente.getCpf()+"'><br/>");
            out.println("Endereço:<input type='text' name='endereco' value='"+cliente.getEndereco()+"'><br/>");
            out.println("Telefone:<input type='text' name='telefone' value='"+cliente.getTelefone()+"'><br/>");
            out.println("e-mail:<input type='text' name='email' value='"+cliente.getEmail()+"'><br/>");
            out.println("Data de Nascimento:<input type='text' name='datanascimento' value='"+cliente.getDataNascimento()+"'><br/>");
            out.println("<input type='submit' value='alterar'>");
            out.println("<input type='reset' value='restaurar campos'><br/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
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
