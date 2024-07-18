package userRegister.Deo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import userRegister.Model.Searching;

public class Search_DButil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet Rs;
	
	public static List<Searching> SearchMT(String search){
		   
		ArrayList<Searching> Search_Result = new ArrayList<>();
							
		try {	
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String SQL_Query ="SELECT * FROM moviesbrowsingsystem.uploadingtb WHERE name = '"+search+"'";
			Rs = stmt.executeQuery(SQL_Query);
				
				if(Rs.next()) {
				String name = Rs.getString(2);
				String rdate = Rs.getString(3);
				String rate = Rs.getString(4);
				String cgory = Rs.getString(5);
				String lng = Rs.getString(6);
				String dname = Rs.getString(7);
				String descript = Rs.getString(8);
						
				Searching Sch = new Searching(name,rdate,rate,cgory,lng,dname,descript);
				Search_Result.add(Sch);
				}		
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}

		   return Search_Result;
	   }	
}
