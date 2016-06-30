/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Encapsulamiento.EncapsulamientoEstudiantes;

/**
 *
 * @author luis
 */
public class DatosEstudiantes {
    
    public static String ingresarEstudiante(Connection conexion, EncapsulamientoEstudiantes estudiantes) throws Exception
    {
        String Resultado = null;
        
        try
        {
            CallableStatement statement = conexion.prepareCall("{call sp_IngresarEstudiante(?,?,?,?,?,?,?,?)}");
           
            statement.setString(1, estudiantes.correo());
            statement.setString(2, estudiantes.nombre());
            statement.setString(3, estudiantes.apellidoPaterno());
            statement.setString(4, estudiantes.apellidoMaterno());
            statement.setString(5, estudiantes.direccion());
            statement.setInt(6, estudiantes.telefono());
            statement.setInt(7, estudiantes.edad());
            statement.setInt(8, estudiantes.idCarrera());
                    
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            
            Resultado = resultSet.getString("mensaje");
        }
        catch(Exception e)
        {
            // Retorna excepcion a la capa de negocios
            throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
        
        return Resultado;
    }
    
}
