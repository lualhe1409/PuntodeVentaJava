/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author Luis
 */
public class datos {
    
    //DATOS TABLA CLIENTE

    private int id_cliente;
    private String nombre;
    private String rfc;

    
    public datos( String nombre, String rfc) {
        this.nombre = nombre;
        this.rfc = rfc;
    }


    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    String getId_venta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
}
