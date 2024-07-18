package userRegister.Deo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import userRegister.Model.Uploader;

public class UploaderDeo {
	public boolean registerUploader(Uploader uploader) throws ClassNotFoundException {
        String Insert_Uploader_Details = "INSERT INTO moviesbrowsingsystem.uploader" + "(id, first_name, last_name, username, password, Email_address, contact) VALUES " + " (?, ?, ?, ?, ?,?,?);";
        int result;
        boolean Values = false;

        Class.forName("com.mysql.jdbc.Driver");
        
        // Step 2:Create a statement using connection object
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesbrowsingsystem", "root", "ASUS1234");
            PreparedStatement preparedStatement = connection.prepareStatement(Insert_Uploader_Details)) { 
	            preparedStatement.setInt(1, 0);
	            preparedStatement.setString(2, uploader.getU_firstNamr());
	            preparedStatement.setString(3, uploader.getU_lastName());
	            preparedStatement.setString(4, uploader.getU_username());
	            preparedStatement.setString(5, uploader.getU_password());
	            preparedStatement.setString(6, uploader.getU_Eaddress());
	            preparedStatement.setString(7, uploader.getU_contact());
	
	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();
	            if(result>0) {
	            	Values = true;
	            }else {
	            	Values = false;
	            }
        } 
        catch (SQLException e) {
            // process sql exception
            e.printStackTrace();
        }
        return Values;
    }

}
