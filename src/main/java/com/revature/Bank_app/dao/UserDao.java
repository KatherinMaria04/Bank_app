package com.revature.Bank_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.Bank_app.util.ConnectionUtil;

public class UserDao {
	public  boolean login(String email, String password) throws SQLException {
		Connection con = ConnectionUtil.getConnection();
		boolean isValidLogin = false;
        
        String sql = "select * from users where email=? and password=?";
       
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,email);
        pst.setString(2,password);
        ResultSet rs = pst.executeQuery();
        if(rs.next()) {
        	isValidLogin=true;
        }
        
        return isValidLogin;
}
   

}
