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

@WebServlet("/updateFinalservelet")
public class updateFinalservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("uid");
		String name =request.getParameter("name");
		String rdate = request.getParameter("rdate");
		String rate = request.getParameter("rate");
		String cgory = request.getParameter("cgory");
		String lng = request.getParameter("lng");
		String dname = request.getParameter("dname");
		String descript = request.getParameter("descript");
		String upname = request.getParameter("upname");
		String upldt = request.getParameter("upldt");
		
		
		boolean isTrue;
		   
		isTrue = updateFinalDbutil.updateupdetails(id, name, rdate, rate, cgory, lng, dname, descript, upname, upldt);
		
		if (isTrue == true) {

			List<updatejv> upDetails = UploadDb.getupdatejv();
			request.setAttribute("upDetails", upDetails);
			
			
			RequestDispatcher dis =request.getRequestDispatcher("updateMT.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis =request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
