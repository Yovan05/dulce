/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dulceria.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alexi
 */
public class Venta {
    private int idVenta=0;
    private Empresa empresa= new Empresa();
    private Cliente cliente= new Cliente();
    private List<DetalleVenta> detalleVenta= new ArrayList();
    private Date fecha= new Date();
    private double subTotal=0;
    private double impuesto=0;
    private double iva=0;
    private double total=0;
    
    
    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVenta> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFechaHora(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double iva(){
        
        iva = subTotal*impuesto;
        return iva;
    }
    
    public double getTotal() {
        total = subTotal+(subTotal*impuesto);
        return total;
    }    
    
    public void ticket(){
        System.out.println("\t\t\t"+empresa.getNombre());
        System.out.println("");
        System.out.println(empresa.getDomicilio());
        System.out.println("Telefono: "+empresa.getTelefono());
        System.out.println(empresa.getCorreoElectronico());
        System.out.println(empresa.getPaginaWeb());
        System.out.println(empresa.getRfc());
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("Cliente: "+cliente.getNombre());
        System.out.println("Domicilio: "+cliente.getDomicilio());
        System.out.println("Telenofo: "+cliente.getTelefono());
        System.out.println("Correo: "+cliente.getCorreoElectronico());
        System.out.println("RFC: "+cliente.getRfc());
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("\t\tFactura simplificada");
        System.out.println("Fecha: "+fecha);
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("Articulo\tPrecio\tCantidad\tTotal");
        System.out.println("-----------------------------------------------------");
//        System.out.println(detalleVenta.getNombre()+"\t"+producto.getPrecioUnitario()+"$\t"+detalleVenta.getCantidad()+"\t\t"+detalleVenta.getImporte()+"$");
        System.out.println("-----------------------------------------------------");
        System.out.println("Subtotal: \t\t\t\t"+subTotal);
        System.out.println("IVA: \t\t\t\t\t"+(impuesto*100)+"%");
        System.out.println("\t\t\t\t\t"+iva+"$");
        System.out.println("-----------------------------------------------------");
        System.out.println("Total:\t\t\t\t\t"+total+"$");
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
