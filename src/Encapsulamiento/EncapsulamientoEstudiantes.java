/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author luis
 */
public class EncapsulamientoEstudiantes {
    int id;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String direccion;
    int telefono;
    int edad;
    String correo;
    int idCarrera;
    
    public EncapsulamientoEstudiantes() {}
    public EncapsulamientoEstudiantes(int id, String apellidoPaterno, String apellidoMaterno,
           String direccion, int telefono, int edad, String correo, int idCarrera)
    {
        this.id = id;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
        this.idCarrera = idCarrera;
    }
    
    // SET
    public void id(int id)
    {
        this.id = id;
    }
    // GET
    public int id()
    {
        return this.id;
    }
    
    public void nombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String nombre()
    {
        return this.nombre;
    }
    
    public void apellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String apellidoPaterno()
    {
        return this.apellidoPaterno;
    }
    
     public void apellidoMaterno(String apellidoMaterno)
    {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String apellidoMaterno()
    {
        return this.apellidoMaterno;
    }
    
    public void direccion(String direccion)
    {
        this.direccion = direccion;
    }
    public String direccion()
    {
        return this.direccion;
    }
    
    public void telefono(int telefono)
    {
        this.telefono = telefono;
    }
    public int telefono()
    {
        return this.telefono;
    }
    
    public void edad(int edad)
    {
        this.edad = edad;
    }
    public int edad()
    {
        return this.edad;
    }
    
    public void correo(String correo)
    {
        this.correo = correo;
    }
    public String correo()
    {
        return this.correo;
    }
    
    public void idCarrera(int idCarrera)
    {
        this.idCarrera = idCarrera;
    }
    public int idCarrera()
    {
        return this.idCarrera;
    }
}
