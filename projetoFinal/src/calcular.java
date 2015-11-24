import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calcular
 */
@WebServlet("/calcular")
public class calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcular() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String numeroStr = request.getParameter("numero");
		String numeroStr1 = request.getParameter("numero1");

		try{
			double numero = Double.parseDouble(numeroStr);
			
			try{
			double numero1=Double.parseDouble(numeroStr1);
			response.getWriter().write(numero + numero1 + "");
		}catch(NumberFormatException e){
			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/form.jsp");
			request.setAttribute("numeroErro1", "Não é um número válido");
			requestDispatcher.forward(request, response);
		}
		}catch(NumberFormatException f){
			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/form.jsp");
			request.setAttribute("numeroErro", "Não é um número válido");
			requestDispatcher.forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
