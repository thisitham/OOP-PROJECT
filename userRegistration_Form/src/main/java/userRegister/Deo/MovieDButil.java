package userRegister.Deo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import userRegister.Model.Movie;

public class MovieDButil {
	private static Statement stmt =null;
	
	private static boolean isSuccess;
	
	public static List<Movie> validate (String MovieName){
		
		ArrayList<Movie> Mov = new ArrayList<Movie>();
		
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root"; 
		String password = "ASUS1234"; 
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			
			String sql = "select * from moviesbrowsingsystem.movie_details where movie_name='"+MovieName+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			
			if (rs.next()) {
				int movie_id = rs.getInt(1);
				String movie_name = rs.getString(2);
				String movie_type = rs.getString(3);
				String movie_year = rs.getString(4);
				String movie_rate = rs.getString(5);
				
				Movie M = new Movie(movie_id,movie_name,movie_type,movie_year,movie_rate);
				Mov.add(M);
				
			}
			
			
		}
			
		catch(Exception e) {
			e.printStackTrace();
		}	
		
		
		
		return Mov;
		
		}



	//private static ResultSet executeQuery(String sql) {
		//TODO Auto-generated method stub
		//return null;
	//}



	public static boolean Insertmovies(String movie_name, String movie_type, String movie_year, String movie_rate) {
	
	boolean isSuccess = false;
	
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String password = "ASUS1234";
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		String sql = "insert into moviesbrowsingsystem.movie_details values (0,'"+movie_name+"','"+movie_type+"','"+movie_year+"','"+movie_rate+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	return isSuccess;
	}
	
	public static boolean UpdateMovies (String movie_id,String movie_name,String movie_type,String movie_year,String movie_rate) {
		
		
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String password = "ASUS1234";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql = "update moviesbrowsingsystem.movie_details set movie_name= '"+movie_name+"',movie_type='"+movie_type+"',movie_year='"+movie_year+"',movie_rate='"+movie_rate+"' "
					+ "where idmovie='"+movie_id+"'";
			int rs = stmt.executeUpdate(sql);
			
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
	
	
	public static boolean DeleteMovie (String movie_id) {
		
		

		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String password = "ASUS1234";
		
		
		
		int convmovie_id=Integer.parseInt(movie_id);
		try {
			
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql="delete from moviesbrowsingsystem.movie_details where idmovie='"+convmovie_id+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}




	//public static List<Movie> validate(String movie_name) {
		// TODO Auto-generated method stub
		//return null;
	//}
	
	
	public static List<Movie> getMovieDetails(String movie_id){
		
		
		int convertedmovie_id = Integer.parseInt(movie_id);
		
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String password = "ASUS1234";
		
		
		
		ArrayList<Movie> Mov = new ArrayList<>();
		
		try {
			
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql = "Select * from moviesbrowsingsystem.movie_details where idmovie = '"+convertedmovie_id+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int convmovie_id = rs.getInt(1);
				String movie_name = rs.getString(2);
				String movie_type = rs.getString(3);
				String movie_year = rs.getString(4);
				String movie_rate = rs.getString(5);
				
				Movie M = new Movie(convmovie_id,movie_name,movie_type,movie_year,movie_rate);
				Mov.add(M);
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();		}
		
		
		
		
		
		return Mov;
		
	}
}
