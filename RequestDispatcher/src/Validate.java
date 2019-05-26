import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	response.setContentType("text/html");
		PrintWriter pw=response.getWriter();	
		
		try
		{
			String name=request.getParameter("un");
			String pass=request.getParameter("pass");
			
			if(name.equals("ajinkya") && pass.equals("ak"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("Welcome");
				rd.forward(request, response);
			}
			else
			{
				pw.print("<html><body><h2>Incorrect Login Details</h2></body></html>");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
				
		}
		finally
		{
			pw.close();
		}
	}
}
