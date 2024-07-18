package userRegister.Deo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import userRegister.Model.Uploader;

public class RetrieveMyData_DButil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Uploader> getUploader_Details(String id){
		int Id = Integer.parseInt(id);
		ArrayList<Uploader> uplder = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String SQL_Quary1 = "SELECT * FROM moviesbrowsingsystem.uploader WHERE id = '"+Id+"'";
			rs = stmt.executeQuery(SQL_Quary1);
			
			while(rs.next()) {
				int u_id = rs.getInt(1);
				String u_firstNamr = rs.getString(2);
				String u_lastName = rs.getString(3);
				String u_username = rs.getString(4);
				String u_password = rs.getString(5);
				String u_Eaddress = rs.getString(6);
				String u_contact = rs.getString(7);
				  
				Uploader Uplder = new Uploader(u_id, u_firstNamr, u_lastName, u_username, u_password, u_Eaddress, u_contact);
				uplder.add(Uplder);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return uplder;
	}
}
