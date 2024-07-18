package userRegister.Deo;

import java.sql.Connection;
import java.sql.Statement;

public class updateFinalDbutil {
		private static boolean isSuccess;
		private static Connection con = null;
		private static Statement stmt = null;
		private static int rs;
		
		
		public static boolean updateupdetails(String id,String name,String rdate,String rate,String cgory,String lng,String dname,String descript,String upname,String upldt){
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "update uploadingtb set name='"+name+"', releaseDate='"+rdate+"' , rate='"+rate+"' , category='"+cgory+"' , language='"+lng+"' , director='"+dname+"' , description='"+descript+"' , uploaderName='"+upname+"' , uploadedDate='"+upldt+"' where id='"+id+"' ";
				rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
			return isSuccess;
		}
		
		public static boolean deleteupdetails(String id) {
			int convId = Integer.parseInt(id);//convert int to id
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "delete from uploadingtb where id='"+convId+"'";
				rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
			return isSuccess;
		}
		
}


