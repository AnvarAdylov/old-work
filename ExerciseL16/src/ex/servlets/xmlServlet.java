package ex.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class xmlServlet
 */
@WebServlet("/xmlServlet")
public class xmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request . getSession ();
		String name = request . getParameter (" Name ");
		String value = request . getParameter (" Value ");
		if ( name != null && value != null ) {
		session . setAttribute ( name , value );
		}
		// get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your name is: " + name + "<br/>";      
        htmlRespone += "Your value is: " + value + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
