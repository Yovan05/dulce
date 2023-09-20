/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dulceria.negocio;

/**
 *
 * @author alexi
 */
public class DetalleVenta {
    private int idDetalleVenta =0;
    private Producto producto = new Producto();
    private int cantidad=0;
    

    public DetalleVenta() {
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        double importe = cantidad*producto.getPrecioUnitario();
        return importe;
    }

    

    
    
    
    
    
    
    
    
}
