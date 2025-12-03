package com.vec.training.trng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
//private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);

public  static Connection getJDBCConnection() {
//logger.debug("Inside getJDBCConnection method");
Connection conn2 = null;
try {
//Class.forName("oracle.jdbc.OracleDriver");
	Connection connection = null;
//	connection = DatabaseConnection.getJDBCConnection();
				connection.setAutoCommit(false);
String dbURL2 = "jdbc:oracle:thin:@ 150.136.134.100:1521/pdb";
//String dbURL2 = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.101.7.135)(PORT=33070)))(CONNECT_DATA=(SERVICE_NAME=pdb)))";
String username = "metricstream";
String password = "password";



conn2 = DriverManager.getConnection(dbURL2, username, password);
if (conn2 != null) {
//logger.debug("Connected with connection #2");
}
} catch (SQLException ex) {
ex.printStackTrace();
} /*
* finally { try { if (conn2 != null && !conn2.isClosed()) { conn2.close(); } }
* catch (SQLException ex) { ex.printStackTrace(); } }
*/
return conn2;

}

/*
* public static Connection getMSIConnection(boolean autoCommit) throws
* SQLException { logger.debug("Inside getMSIConnection method Called");
* RequestContext requestContext = new RequestContext();
*
* return ConnectionManager.getDefaultConnection(CLASS_ID, autoCommit,
* requestContext); }
*/

}

