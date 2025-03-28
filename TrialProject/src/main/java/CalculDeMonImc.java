

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        
	            double poids = Double.parseDouble(request.getParameter("poids"));
	            double taille = Double.parseDouble(request.getParameter("taille"));
	            
	            //Utilisation de la classe Imc
	            Imc imc = new Imc(taille, poids);
	            double result = imc.calcul();
	            
	            out.println("<html><body>");
	            out.println("<h2>Votre IMC est : " + imc + "</h2>");
	            out.println("</body></html>");
	   

	 }
	/* protected void doPost(HttpServletRequest request, HttpServletResponse response)
		        throws ServletException, IOException {
		    doGet(request, response);
		}*/


}
