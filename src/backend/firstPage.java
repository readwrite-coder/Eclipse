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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form name=\"myform\" method=\"GET\" action=\"FormServlet\">");
		out.println("Username <input type=\"text\" name=\"uname\" /><br />");
		out.println("Password <input type=\"text\" name=\"pass\" /><br />");
		out.println("<input type=\"submit\" name=\"submit\" value=\"Login\" />");
		out.println("</form>");
		out.println("</body");
		out.println("</html>");		
		out.close();
	}
}
