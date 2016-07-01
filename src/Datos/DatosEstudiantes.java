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
import java.util.ArrayList;
import java.util.List;

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
            CallableStatement statement = conexion.prepareCall("{call sp_Ingresar_Estudiante(?,?,?,?,?,?,?,?)}");
           
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
    
    public static List<EncapsulamientoEstudiantes> mostrarEstudiantes(Connection conexion) throws Exception
    {
        List<EncapsulamientoEstudiantes> listaEstudiantes = new ArrayList<>();
        
        try
        {
            CallableStatement statement = (CallableStatement) conexion.prepareCall("{call sp_Mostrar_Estudiantes()}");
            
            // Este metodo pone un puntor en la primera fila y con el metodo next, se mueve a la siguiente fila
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                EncapsulamientoEstudiantes estudiante = new EncapsulamientoEstudiantes
                        (
                        // Aqui realizamos la conversion
                        resultSet.getInt("id"),
                        resultSet.getString("Nombre"),
                        resultSet.getString("ApellidoPaterno"),
                        resultSet.getString("ApellidoMaterno"),
                        resultSet.getString("Direccion"),
                        resultSet.getInt("Telefono"),
                        resultSet.getInt("Edad"),
                        resultSet.getString("Correo"),
                        resultSet.getInt("Carrera")
                        );
                
                listaEstudiantes.add(estudiante);
            }
            
        }
        catch (Exception e)
        {
            throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
        
        return listaEstudiantes;
    }
    
    public static void eliminarEstudiante(Connection conexion, int ID) throws Exception
    {
        try {
            
            CallableStatement statement = conexion.prepareCall("{call sp_eliminar_Estudiantes(?)}");
            statement.setInt(1, ID);
            
            statement.executeQuery();
            
        } catch (Exception e) {
            throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
    }
    
}
