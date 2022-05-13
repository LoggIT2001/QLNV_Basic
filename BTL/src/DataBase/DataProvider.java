/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LONGDT
 */
public class DataProvider {
    //private final static String JDBC_DRIVER = "com.msql.jdbc.Drive";
    private final static String DATABASE_LINK = "jdbc:mysql://localhost:3306/csdl_qlnv";
    
    public static Connection ketNoi(){
        Connection conn = null;
        try{
            //Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DATABASE_LINK, "root","");
        } catch (SQLException ex) {
            System.err.println("Không kết nối được đến MySQL. Chi tiết: " + ex.getMessage());
        }
        return conn;
    }
    public static void closeConnection(Connection oConn) throws SQLException {
        if (oConn != null) {
            oConn.close();
        }
    }
    public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        if (preparedStatement != null) {
            preparedStatement.close();
        }
    }

    public static void closeCallableStatement(CallableStatement callableStatement) throws SQLException {
        if (callableStatement != null) {
            callableStatement.close();
        }
    }
}
