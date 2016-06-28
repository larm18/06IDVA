/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public abstract class Conexion {
    protected static Connection Conexion()
    {
        Connection conexion=null;
        
        try
        {   
            Class.forName("com.mysql.jdbc.Driver");
            String servidor="jdbc:mysql://localhost/ProyectoClase";
            String usuario="root";
            String contrasenia="luis3501267";
            conexion=(Connection)DriverManager.getConnection(servidor, usuario, contrasenia);
            //JOptionPane.showMessageDialog(null, "Conexion Exiosa");
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return conexion;
    }
    
}
