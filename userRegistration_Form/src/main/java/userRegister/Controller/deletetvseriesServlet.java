package userRegister.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userRegister.Model.TVseries;
import userRegister.Deo.TvseriesDBUtil;

@WebServlet("/deletetvseriesServlet")
public class deletetvseriesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");	
		boolean isTrue;
		
		isTrue = TvseriesDBUtil.deletetvseries(name);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Admin_Panel.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			//List<TVseries> (String name)
			
			List<TVseries> TvseriesDetails=  TvseriesDBUtil.retriew_Data(name);
			request.setAttribute("TvseriesDetails", TvseriesDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
	}

}
