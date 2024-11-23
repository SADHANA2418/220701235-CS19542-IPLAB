

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String uname=request.getParameter("name");
		out.print("<h2>Name: "+uname+"</h2>");
	  Integer roll=Integer.parseInt(request.getParameter("roll"));
	  out.print("<h2>Roll:"+roll+"</h2>");
	  String gender=request.getParameter("gender");
	  out.print("<h2>Gender: "+gender+"</h2>");
	  String dept1=request.getParameter("dept");
	  out.print("<h2>Department: "+dept1+"</h2>");
	  String section=request.getParameter("sec");
	  out.print("<h2>Section: "+section+"</h2>");
	  String phone=request.getParameter("phone");
	  out.print("<h2>Phone no: "+phone+"</h2>");
	  String email=request.getParameter("email");
	  out.print("<h2>Email id: "+email+"</h2>");
	  String add=request.getParameter("add");
	  out.print("<h2>Address: "+add+"</h2>");
	  String city=request.getParameter("city");
	  out.print("<h2>CITY: "+city+"</h2>");
	  String country=request.getParameter("country");
	  out.print("<h2>Country: "+country+"</h2>");
	  String pcode=request.getParameter("pcode");
	  out.print("<h2>Postal Code: "+pcode+"</h2>");
	  
	}

}
