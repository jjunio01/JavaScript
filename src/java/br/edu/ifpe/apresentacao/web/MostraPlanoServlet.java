/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.apresentacao.web;

import br.edu.ifpe.controladores.Fachada;
import br.edu.ifpe.negocio.Plano;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jose Junio
 */
@WebServlet(name = "MostraPlanoServlet", urlPatterns = {"/MostraPlanoServlet"})
public class MostraPlanoServlet extends HttpServlet {

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

        List<Plano> listaPlanos = Fachada.getInstance().recuperarTodosPlanos();

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mostra Planos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Planos SlowNet " + request.getContextPath() + "</h1>");
            out.println("<a href='index.html'>voltar</a>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Código</th><th>Nome</th><th>Descrição</th><th>Valor Mensal</th><th>Operações</th></tr>");
            for (Plano p : listaPlanos) {
                out.println("<tr><td>" + p.getCodigo() + "</td>"
                        + "<td>" + p.getNome() + "</td>"
                        + "<td>" + p.getDescricao() + "</td>"
                        + "<td>" + p.getValorMensal() + "</td>"
                );

            }
            out.println("</table>");
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
