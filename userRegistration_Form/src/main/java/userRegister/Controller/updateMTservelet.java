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
import userRegister.Model.updatejv;

@WebServlet("/updateMTservelet")
public class updateMTservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<updatejv> upDetails = UploadDb.getupdatejv();
		request.setAttribute("upDetails", upDetails);
	
		RequestDispatcher dis3 = request.getRequestDispatcher("updateMT.jsp");
		dis3.forward(request, response);
	}

}
