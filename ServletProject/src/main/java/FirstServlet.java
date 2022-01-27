

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public FirstServlet() 
    {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user=request.getParameter("user");
		String password=request.getParameter("pwd");
		System.out.println(user+""+password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		   
			   	 
		 String user=request.getParameter("user");
			 String password = request.getParameter("pwd");
			 PrintWriter pw=response.getWriter();
			 pw.print(user+"  "+password);
    }

		
}




