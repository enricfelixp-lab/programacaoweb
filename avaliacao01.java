package prova;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/avaliacao01")
public class avaliacao01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		  PrintWriter mostrar = response.getWriter();
	        mostrar.write("<html>");
	        mostrar.write("<body>");
	        mostrar.write("<h2>Seja bem vindo</h2>");
	        mostrar.write(request.getParameter("nome") + " " + request.getParameter("sobrenome"));
	        mostrar.write("<br/>");
	        
	        mostrar.write("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
	}
}
