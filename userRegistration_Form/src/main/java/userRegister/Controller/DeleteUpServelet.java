package userRegister.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userRegister.Deo.UploadDb;
import userRegister.Deo.updateFinalDbutil;
import userRegister.Model.updatejv;

@WebServlet("/DeleteUpServelet")
public class DeleteUpServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("uid");
		boolean isTrue;
		
		isTrue = updateFinalDbutil.deleteupdetails(id);
		
		if(isTrue == true) {
			List<updatejv> upDetails = UploadDb.getupdatejv();
			request.setAttribute("upDetails", upDetails);
			
			RequestDispatcher dispatcher =request.getRequestDispatcher("updateMT.jsp");
			dispatcher.forward(request, response);
		}
		else {
			//List<updatejv> upDetails = UploadDb.getupdatejv();
			//request.setAttribute("upDetails", upDetails);
			
			RequestDispatcher dispatcher =request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
			
		}
	}

}
