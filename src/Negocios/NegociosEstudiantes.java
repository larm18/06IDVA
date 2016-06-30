/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Encapsulamiento.EncapsulamientoEstudiantes;
import Conexion.Conexion;
import Datos.DatosEstudiantes;

/**
 *
 * @author luis
 */
public class NegociosEstudiantes extends Conexion {
    
    public static String ingresarEstudiante(EncapsulamientoEstudiantes estudiantes) throws Exception
    {
        String Resultado = null;
        
        Connection conexion = Conexion();
        
        try
        {
            // Seguridad en las consultas de tablas que estan relacionadas con otras
            conexion.setAutoCommit(false);
            
            Resultado = DatosEstudiantes.ingresarEstudiante(conexion, estudiantes);
            
            // Si la ejecucion fue exitosa, cerramos la conexion
            conexion.commit();
        }
        catch (Exception e)
        {
            // Si existe algun error, regresamos los cambios, si esque lo hizo en la BD (Cancela la consulta)
            conexion.rollback();
            // Retorna excepcion a la capa de presentacion
            throw new Exception("Error en la Capa de Negocios " + e.getMessage());
        }
        
        return Resultado;
            
    }
}
