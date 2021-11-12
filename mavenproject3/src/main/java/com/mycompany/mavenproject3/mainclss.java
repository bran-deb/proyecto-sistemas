/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import com.mycompany.util.ConexionDataBase;
import java.sql.SQLException;

/**
 *
 * @author brian
 */
public class mainclss {
    public static void main(String[] args) throws SQLException {
        ConexionDataBase.getInstance();
        //ConexionDataBase.borrarUsuarios();
        //ConexionDataBase.createUsuariosInicio();
        //ConexionDataBase.getUsuarios();
        new VentanaElUsuario().setVisible(true);
    }
}
