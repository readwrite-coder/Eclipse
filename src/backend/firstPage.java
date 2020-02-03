package backend;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*** Servlet implementation class firstPage*/
@WebServlet("/My_Mood")
public class firstPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /*** @see HttpServlet#HttpServlet()*/
    public firstPage() {
        super(); // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Sample Form</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form name=\"myform\" method=\"GET\" action=\"FormServlet\">");
		out.println("First Name <input type=\"text\" name=\"fname\" /><br />");
		out.println("Last Name <input type=\text\" name=\"lname\" /><br />");
		out.println("<input type=\"submit\" name=\"submit\" value=\"Submit\" />");
		out.println("</form>");
		out.println("</body");
		out.println("</html>");		
				
	}
}
