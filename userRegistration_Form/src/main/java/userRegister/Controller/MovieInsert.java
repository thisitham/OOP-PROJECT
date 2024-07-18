package userRegister.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userRegister.Deo.MovieDButil;

@WebServlet("/MovieInsert")
public class MovieInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		java.lang.String movie_name = request.getParameter("name");
		java.lang.String movie_type = request.getParameter("type");
		java.lang.String movie_year = request.getParameter("year");
		java.lang.String movie_rate = request.getParameter("rate");
		
		boolean isTrue;
		
		isTrue = MovieDButil.Insertmovies(movie_name,movie_type,movie_year,movie_rate);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Selection2.jsp");
			dis.forward(request,response);
			
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request,response);
		}
	}

}
