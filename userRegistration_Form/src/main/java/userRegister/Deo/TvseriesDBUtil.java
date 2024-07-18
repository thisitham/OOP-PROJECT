package userRegister.Deo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import userRegister.Model.TVseries;

public class TvseriesDBUtil {
	private static ResultSet rs = null;
	private static boolean isSuccess = false;
	
	public static boolean tvseriesinsert(String name,String imdb,String category,String sesons,String director) {
		
		boolean isAdd = false;
		
		//db
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String pass = "ASUS1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into moviesbrowsingsystem.tvseries values('"+name+"','"+imdb+"','"+category+"','"+sesons+"','"+director+"')";
			int ns = stmt.executeUpdate(sql);
			
			if(ns > 0) {
				isAdd = true;
			}else {
				isAdd = false;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return isAdd;
	}

	
	
	public static boolean updatetvseries(String name, String imdb, String category, String sesons, String director) {
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String pass = "ASUS1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM moviesbrowsingsystem.tvseries WHERE name = '"+name+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static List<TVseries> inserttvseries(String name) {
		ArrayList<TVseries> tv_Series = new ArrayList<>();
		
		//private static boolean isSuccess;
		//private static connection con =null;
		
		
		//createDBconnection
		
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String pass = "ASUS1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM moviesbrowsingsystem.tvseries WHERE name = '"+name+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name1 = rs.getString(1);
				String imdb = rs.getString(2);
				String category = rs.getString(3);
				String sesons = rs.getString(4);
				String director = rs.getString(5);
				
				TVseries S1 = new TVseries(name1, imdb, category, sesons, director);
				tv_Series.add(S1);
				
			}		
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return tv_Series;
		
	}
	
	public static boolean update(String name,String imdb,String category,String sesons,String director) {
	
	boolean isSuccess = false;
	
	//private static boolean isSuccess;
	//private static connection con =null;
	//createDBconnection
	
	String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
	String user = "root";
	String pass = "ASUS1234";
	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql1 = "update tvseries set imdb='"+imdb+"',category='"+category+"',sesons='"+sesons+"',director='"+director+"'" 
					+ "where name='"+name+"'";		
			
			int rs = stmt.executeUpdate(sql1);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	
		return isSuccess;
	}
	
	public static List<TVseries> retriew_Data(String name) {
		ArrayList<TVseries> Updated_Data = new ArrayList<>();
		
		//private static boolean isSuccess;
		//private static connection con =null;
		
		
		//createDBconnection
		
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String pass = "ASUS1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM moviesbrowsingsystem.tvseries WHERE name = '"+name+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name1 = rs.getString(1);
				String imdb = rs.getString(2);
				String category = rs.getString(3);
				String sesons = rs.getString(4);
				String director = rs.getString(5);
				
				TVseries List = new TVseries(name1, imdb, category, sesons, director);
				Updated_Data.add(List);
				
			}		
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return Updated_Data;
		
	}
	
	public static boolean deletetvseries(String name) {
		
		//int convTv = Integer.parseInt(name);
		
		String url = "jdbc:mysql://localhost:3306/moviesbrowsingsystem";
		String user = "root";
		String pass = "ASUS1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql="delete from moviesbrowsingsystem.tvseries where name='"+name+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}



}
