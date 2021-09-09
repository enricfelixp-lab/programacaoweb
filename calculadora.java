package prova;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculadora
 */
@WebServlet("/calculadora")
public class calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter calc = response.getWriter();
        calc.write("<html>");
        calc.write("<body>");
        calc.write("<h3>Calculadora</h3>");
        String xvalorA=request.getParameter("valorx");
        String xvalorB=request.getParameter("valory");
        String xopcao=request.getParameter("opcao");
        double yvalorA=Double.parseDouble(xvalorA);
        double yvalorB=Double.parseDouble(xvalorB);
        double total=0;
        if (xopcao.equals("+")) {
        	total=yvalorA + yvalorB;
        }else if (xopcao.equals("-")) {
        	total=yvalorA - yvalorB;
        }else if (xopcao.equals("*")) {
        	total=yvalorA * yvalorB;
        }else if (xopcao.equals("/")) {
        	total=yvalorA / yvalorB;	
        }
        calc.write("Total:<brb>"+ total);;
        calc.write("</body></html>");
	}


}
