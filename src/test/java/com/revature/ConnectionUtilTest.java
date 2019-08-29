package com.revature;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.revature.Bank_app.util.ConnectionUtil;

public class ConnectionUtilTest {

	@Test
	public void test() {
		Connection connection = ConnectionUtil.getConnection();
        assertNotNull(connection);
    }
	}

