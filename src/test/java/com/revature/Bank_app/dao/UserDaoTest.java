package com.revature.Bank_app.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class UserDaoTest {

	@Test
    public void testValidLogin() throws SQLException {

        String email = "n@gmail.com";
        String password = "pass123";
        UserDao userdao = new UserDao();
        boolean isValidLogin = userdao.login(email, password);
        assertTrue(isValidLogin);
    }
	    @Test
	    public void testInValidLogin() throws SQLException {

	        String email = "";
	        String password = "";
	        UserDao userdao = new UserDao();
	        boolean isValidLogin = userdao.login(email, password);
	        assertFalse(isValidLogin);
	    }
	}

