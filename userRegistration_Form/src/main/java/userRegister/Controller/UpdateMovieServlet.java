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

@WebServlet("/UpdateMovieServlet")
public class UpdateMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String movie_id = request.getParameter("movieid");
		String movie_name = request.getParameter("name");
		String movie_type = request.getParameter("type");
		String movie_year = request.getParameter("year");
		String movie_rate = request.getParameter("rate");
		
		boolean isTrue;
		
		isTrue = MovieDButil.UpdateMovies(movie_id, movie_name, movie_type, movie_year, movie_rate);
		
		if(isTrue == true) {
			
			List<Movie> movDetails = MovieDButil.getMovieDetails(movie_id);
			request.setAttribute("movDetails",movDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("MovieDetails.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
