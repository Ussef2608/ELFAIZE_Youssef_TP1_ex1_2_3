import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LivreController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String titre = request.getParameter("titre");
        String categorie = request.getParameter("categorie");
        int isbn = Integer.parseInt(request.getParameter("isbn"));
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.write("<html><head><title>Confirmation</title></head><body>");
        out.write("<h1>Validation d'un livre</h1>");
        out.write("<h2>Le livre</h2>");
        out.write("Titre = " + titre + "<br/>");
        out.write("Catégorie = " + categorie + "<br/>");
        out.write("Numéro ISBN = " + isbn + "<br/>");
        out.write("<h2>L'auteur</h2>");
        out.write("Nom = " + nom + "<br/>");
        out.write("Prénom = " + prenom + "<br/>");
        out.write("</body></html>");
    }
}