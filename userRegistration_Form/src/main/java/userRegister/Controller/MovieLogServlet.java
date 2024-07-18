package userRegister.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userRegister.Deo.MovieDButil;
import userRegister.Model.Movie;

@WebServlet("/MovieLogServlet")
public class MovieLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String movie_name = request.getParameter("movie_name");
		
		
		try {
		List<Movie> movDetails = MovieDButil.validate(movie_name);
		request.setAttribute("movDetails", movDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("MovieDetails.jsp");
		dis.forward(request, response);
	}

}
