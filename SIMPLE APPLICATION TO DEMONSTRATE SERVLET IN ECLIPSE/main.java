import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



public class registerServlet extends HttpServlet {

protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{ 

	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	int n1=Integer.parseInt(req.getParameter("t1"));
	int n2=Integer.parseInt(req.getParameter("p1"));
	int n3=n1+n2;
	pw.print("<p style=color:red> The result is" + n3 +"</p>");
	}

protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{ 
doGet(req,res);
}
}
