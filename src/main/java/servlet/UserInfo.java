package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="userinfo",
urlPatterns={"/UserInfo"})


public class UserInfo extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    out.println("<HTML>\n<BODY>\n" +
	                "<H1>Recapitulatif des informations</H1>\n" +
	                "<UL>\n" +            
	        " <LI>Nom: "
	                + request.getParameter("name") + "\n" +
	                " <LI>Prenom: "
	                + request.getParameter("firstname") + "\n" +
	                " <LI>Age: "
	                + request.getParameter("mail") + "\n" +
	                "</UL>\n" +                
	        "</BODY></HTML>");
	}
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    RequestDispatcher d = request.getRequestDispatcher("/toto.jsp");
	    
	    request.setAttribute("nom", request.getParameter("name"));
	    request.setAttribute("prenom", request.getParameter("firstname"));
	    request.setAttribute("age", request.getParameter("age"));
	    
	    d.forward(request, response);
	    
	    /*out.println("<HTML>\n<BODY>\n" +
	                "<H1>Recapitulatif des informations</H1>\n" +
	                "<UL>\n" +            
	        " <LI>Nom: "
	                + request.getParameter("name") + "\n" +
	                " <LI>Prenom: "
	                + request.getParameter("firstname") + "\n" +
	                " <LI>Age: "
	                + request.getParameter("age") + "\n" +
	                "</UL>\n" +                
	        "</BODY></HTML>");*/
	}
}
