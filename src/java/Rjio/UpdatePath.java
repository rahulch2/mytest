/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rjio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class UpdatePath {
    
    

    public static void main(String[] arg) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "RJIO_UPV4", "jiodev");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from DMS_DOCUNENTS");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
