package userRegister.Deo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import userRegister.Model.updatejv;

public class UploadDb {
		private static boolean isSuccess = false;
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet Rs = null;
		private static int rs;
	
		public static boolean insertuploader(String name,String rdate,String rate,String cgory,String lng,String dname,String descript,String upname,String upldt) {
		
		try {
            con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into moviesbrowsingsystem.uploadingtb values(0,'"+name+"','"+rdate+"','"+rate+"','"+cgory+"','"+lng+"','"+dname+"','"+descript+"','"+upname+"','"+upldt+"')";
			rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
		
		public static List<updatejv> getupdatejv(){
			   
			ArrayList<updatejv> updatejv = new ArrayList<>();
								
			try {	
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql ="select * from moviesbrowsingsystem.uploadingtb";
				Rs =stmt.executeQuery(sql);
					
					while(Rs.next()) {
					int id = Rs.getInt(1);
					String name = Rs.getString(2);
					String rdate = Rs.getString(3);
					String rate = Rs.getString(4);
					String cgory = Rs.getString(5);
					String lng = Rs.getString(6);
					String dname = Rs.getString(7);
					String descript = Rs.getString(8);
					String upname = Rs.getString(9);
					String upldt = Rs.getString(10);
							
					updatejv u = new updatejv(id,name,rdate,rate,cgory,lng,dname,descript,upname,upldt);
					updatejv.add(u);
					}		
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}

			   return updatejv;
		   }	
			 //end    
}
