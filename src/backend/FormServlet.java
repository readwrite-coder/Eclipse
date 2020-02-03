package backend;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("This is the form servlet");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		if(username.isEmpty() || password.isEmpty()) {
			
			System.out.println("here");
			//response.sendRedirect("firstPage");
			
			response.encodeRedirectURL("firstPage");
			System.out.println("heree");
		}
		
		System.out.println("username: "+ username +" Password: " + password);
	}
	
}
