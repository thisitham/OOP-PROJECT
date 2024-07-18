package userRegister.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userRegister.Deo.LoginDb;
import userRegister.Deo.UploadDb;
import userRegister.Model.user;

@WebServlet("/UploadDbServlet")
public class UploadDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static boolean isTrue1;
	//private static boolean isTrue2;
	//private String username;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("Username");// in login.jsp 
	    
		String name = request.getParameter("name");
		String rdate = request.getParameter("rdate");
		String rate = request.getParameter("rate");
		String cgory = request.getParameter("cgory");
		String lng = request.getParameter("lng");
		String dname = request.getParameter("dname");
		String descript = request.getParameter("descript");
		String upname = request.getParameter("upname");
		String upldt = request.getParameter("upldt");
		
		isTrue1 = UploadDb.insertuploader(name, rdate, rate, cgory, lng, dname, descript, upname, upldt);
		/*user u1 = new user();
		username = u1.getUserName();*/
		
		if(isTrue1 == true) {
			List<user> usDetails = LoginDb.getUser(username);
			request.setAttribute("usDetails",usDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("After_Login.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
			
		}
	}

}
