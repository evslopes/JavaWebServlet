package br.edu.infnet.javawebservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Resposta da requisição.</h1>");
        out.println("<h2>" + nome + " seu email " + email + " foi cadastrado." + "</h2>");
        out.println("</body></html>");
    }


}
