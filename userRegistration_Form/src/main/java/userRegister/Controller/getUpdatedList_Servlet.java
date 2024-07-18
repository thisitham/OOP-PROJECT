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

@WebServlet("/getUpdatedList_Servlet")
public class getUpdatedList_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static boolean getResult;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String imdb = request.getParameter("imdb");
		String category = request.getParameter("category");
		String sesons = request.getParameter("sesons");
		String director = request.getParameter("director");
		
		getResult = TvseriesDBUtil.update(name, imdb, category, sesons, director);
		
		if(getResult == true) {
			List<TVseries> New_Details = TvseriesDBUtil.retriew_Data(name);
			request.setAttribute("tvseDetails", New_Details);
			
			RequestDispatcher dispatch1 = request.getRequestDispatcher("tvseries.jsp");
			dispatch1.forward(request,response);
		}else {
			RequestDispatcher dispatch2 = request.getRequestDispatcher("tvseries.jsp");
			dispatch2.forward(request,response);
		}
		
	}

}
