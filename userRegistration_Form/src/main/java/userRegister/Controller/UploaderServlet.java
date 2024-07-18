package userRegister.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userRegister.Deo.UploaderDeo;
import userRegister.Model.Uploader;

@WebServlet("/UploaderServlet")
public class UploaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UploaderDeo upldDao = new UploaderDeo();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatch = request.getRequestDispatcher("Uploader_register.jsp"); ///WEB-INF/Views/
		dispatch.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("U_firstNamr");
        String lastName = request.getParameter("U_lastName");
        String username = request.getParameter("U_username");
        String password = request.getParameter("U_password");
        String address = request.getParameter("U_Eaddress");
        String contact = request.getParameter("U_contact");

        Uploader Upld = new Uploader(); 
        Upld.setU_firstNamr(firstName);
        Upld.setU_lastName(lastName);
        Upld.setU_username(username);
        Upld.setU_password(password);
        Upld.setU_Eaddress(address);
        Upld.setU_contact(contact);        

        try {
        	boolean F_result = upldDao.registerUploader(Upld);
        	if(F_result==true) {
        		RequestDispatcher dispatch = request.getRequestDispatcher("Uploaderdetails.jsp"); ///WEB-INF/Views/
        		dispatch.forward(request, response);
        	}else {
        		RequestDispatcher dispatch = request.getRequestDispatcher("Unsucesses_msg.jsp"); ///WEB-INF/Views/
        		dispatch.forward(request, response);
        	}
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
	}

}
