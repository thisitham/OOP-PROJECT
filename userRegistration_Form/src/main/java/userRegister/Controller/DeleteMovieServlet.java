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

@WebServlet("/DeleteMovieServlet")
public class DeleteMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String movie_id=request.getParameter("movieid");
		boolean isTrue;
		
		isTrue = MovieDButil.DeleteMovie(movie_id);
		
		if (isTrue == true) {
			List<Movie> MovDetails = MovieDButil.validate (movie_id);
			request.setAttribute("MovDetails", MovDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Admin_Panel.jsp");
			dispatcher.forward(request, response);
		}
		else {
			//List<Movie> MovDetails = MovieDButil.getMovieDetails(movie_id);
			//request.setAttribute("MovDetails", MovDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
	}

}
