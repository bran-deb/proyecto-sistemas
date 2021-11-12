package com.mycompany;

import com.mycompany.util.ConexionDataBase;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try ( Connection conn = ConexionDataBase.getInstance()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
