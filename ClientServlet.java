package Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.ClientJavaBean;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Nom = request.getParameter("nom");
		String Prenom = request.getParameter("prenom");
		String Adresse = request.getParameter("adresse");
		int Num = Integer.parseInt(request.getParameter("num"));
		String Email = request.getParameter("email");
		
		ClientJavaBean client = new ClientJavaBean();
		client.setNom(Nom);
		client.setPrenom(Prenom);
		client.setAdresse(Adresse);
		client.setNum(Num);
		client.setEmail(Email);
		
		HttpSession session = request.getSession();
		session.setAttribute("client", client);
		
		//dispatcher
		RequestDispatcher dispInf=request.getRequestDispatcher("client.jsp");
		dispInf.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
