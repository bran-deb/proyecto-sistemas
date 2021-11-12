
package com.mycompany.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDataBase {
    
    //variables usuarios por defecto
    public static int idestudiantedefecto = 2;
    public static int iddocentedefecto = 5;
    //fin variable usuarios por defecto

    private static String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10450470?serverTimezone=UTC";
    
    private static String username = "sql10450470";

    private static String password = "y7CwwXv5Nk";
    private static Connection connection;                                         //singleton

    public static  Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url,username,password);
        }
        return connection;
    }
    
    
    //codigo 12/11/2021 por Carlos Brian Revollo Villarroel
    
    public static void createUsuariosInicio(){ //codigo para crear los usuarios base
        try {
            Statement stat = connection.createStatement();
            stat.executeUpdate("insert into USUARIO values(default, 'Carlos', 'Revollo', 'carlos2509', '123', 'Estudiante')");
            stat.close();
            
            Statement stat2 = connection.createStatement();
            stat2.executeUpdate("insert into USUARIO values(default, 'Erick', 'Mancilla', 'erick123', '123', 'Estudiante')");
            stat2.close();
            
            Statement stat3 = connection.createStatement();
            stat3.executeUpdate("insert into USUARIO values(default, 'Julio', 'Iglesias', 'julio123', '123', 'Estudiante')");
            stat3.close();
            
            Statement stat4 = connection.createStatement();
            stat4.executeUpdate("insert into USUARIO values(default, 'Marcelo', 'Flores', 'marcelo123', '123', 'Docente')");
            stat4.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void borrarUsuarios(){  //codigo para borrar todos los usuarios
        try {
             Statement stat = connection.createStatement();
            
            stat.executeUpdate("delete from USUARIO");
            
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
    public static void getUsuarios(){ // codigo para imprimir en consola todos los usuarios
        try {
             Statement stat = connection.createStatement();
            
            ResultSet res = stat.executeQuery("select * from USUARIO");
            while (res.next()) {                
                System.out.print(res.getInt(1) + "  ");
                System.out.print(res.getString(2)+ "  ");
                System.out.print(res.getString(3)+ "  ");
                System.out.print(res.getString(4)+ "  ");
                System.out.print(res.getString(5)+ "  ");
                System.out.print(res.getString(6)+ "  ");
                System.out.println("   ");
            }
            res.close();
            stat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static boolean verificarExistenciaReunion(int idreunion){// verificar la existencia de una reunion
        boolean res = false;
        try {
            Statement stat = connection.createStatement();
            ResultSet resultset = stat.executeQuery("select * from REUNION where id_reunion = "+idreunion + " and Estado = 'En Pie'");
            if(resultset.next()){
             res = true;   
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
        
    }
    
     public static int  crearReunion(){
       int res = -1;
        try {
            Statement stat = connection.createStatement();
            stat.executeUpdate("insert into REUNION values(default,"+iddocentedefecto+",'En curso')");
            
            stat.close();
            Statement stat2 = connection.createStatement();
            ResultSet resultset = stat2.executeQuery("select id_reunion from REUNION where estado = 'En curso' and idUsuariocreador = "+iddocentedefecto);
            if (resultset.next()) {
                res = resultset.getInt(1);
            }
            resultset.close();
            stat2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
   }
    //fin nuevo codigo 12/11/2021 por Carlos Brian Revollo Villarroel
  
}
