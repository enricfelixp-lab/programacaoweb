package prova;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter mostrar = response.getWriter();
	        mostrar.write("<html>");
	        mostrar.write("<body>");
	        mostrar.write("<h2>Seja bem vindo</h2>");
	        mostrar.write(request.getParameter("nome") + " " + request.getParameter("telefone")+" "+request.getParameter("dataDeNascimento"));
	        mostrar.write("<br/>");
	        
	        mostrar.write("</body></html>");
	}


}
