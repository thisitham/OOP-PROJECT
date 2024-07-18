package userRegister.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userRegister.Deo.DeleteMyData_DButil;
import userRegister.Deo.RetrieveMyData_DButil;
import userRegister.Model.Uploader;

@WebServlet("/DeleteMyData_Servlet")
public class DeleteMyData_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static boolean F_Result;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("U_id");
		
		F_Result = DeleteMyData_DButil.Delete_Profile(id);
		
		if(F_Result == true) {
			RequestDispatcher dispatch1 = request.getRequestDispatcher("index.jsp");
			dispatch1.forward(request,response);
		}else {
			List<Uploader> MyNew_Details = RetrieveMyData_DButil.getUploader_Details(id);
			request.setAttribute("user_Details", MyNew_Details);
			
			RequestDispatcher dispatch2 = request.getRequestDispatcher("Display_Uploader.jsp");
			dispatch2.forward(request,response);
		}
		
	}

}
