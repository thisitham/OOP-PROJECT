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

@WebServlet("/updatetvseriesServlet")
public class updatetvseriesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		
		List<TVseries> getDetails =  TvseriesDBUtil.inserttvseries(name);
		request.setAttribute("tvseDetails", getDetails);
		
		RequestDispatcher dis1 = request.getRequestDispatcher("tvseries.jsp");
		dis1.forward(request,response);
	}

}
