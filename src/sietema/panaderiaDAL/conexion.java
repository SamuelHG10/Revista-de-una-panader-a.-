/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sietema.panaderiaDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Samuel
 */
public class conexion {
               String strConexionBD="jdbc:sqlite:C:/Users/shame/Documents/bd/panaderia.s3db";
               Connection conn= null;
                       
             public conexion(){
                  try {
                       Class.forName("org.sqlite.JDBC");
                        conn = DriverManager.getConnection(strConexionBD);
                       
                        System.out.print("Conexión establecida");
                  } catch (Exception e) {
                       
                       System.out.print("Error de conexión"+e);
                       
                  }
             }
             
             public int ejecutarSetenciaSQL(String strSentenciaSQL){
                  try {
                       PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
                       pstm.execute();
                       return 1;
                  } catch (SQLException e) {
                       System.out.println(e);
                       return 0;
                  }
             }
             public ResultSet consultarRegistros(String strSentenciaSQL){
                  try {
                       
                       PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
                       ResultSet respuesta= pstm.executeQuery();
                       return respuesta;
                       
                  } catch (Exception e) {
                       System.err.println(e);
                       return null;
                  }
                  
             }
}
