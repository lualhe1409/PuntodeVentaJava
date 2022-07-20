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
public class venta {
    
    private int id_venta;
    private int id_producto;
    private int id_cliente;
    private double cantidad;
    private double descuento;
    private int fecha;

    public venta(int id_producto, int id_cliente, double cantidad, double descuento, int fecha) {
        this.id_producto = id_producto;
        this.id_cliente = id_cliente;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.fecha = fecha;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    
    
    
            
  }
    
