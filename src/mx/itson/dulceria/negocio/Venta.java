/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dulceria.negocio;

/**
 *
 * @author alexi
 */
public class Venta {
    private int idVenta=0;
    private Empresa empresa= new Empresa();
    private Cliente cliente= new Cliente();
    private Caja caja= new Caja();
    private Empleado empleado= new Empleado();
    private Producto producto = new Producto();
    private DetalleVenta detalleVenta= new DetalleVenta();
    private String fechaHora= new String();
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

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
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

    public double getTotal() {
        total = subTotal*(1+impuesto);
        return total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double iva(){
        iva = subTotal*impuesto;
        return iva;
    }
    
    public void ticket(){
        System.out.println("\t\t"+empresa.getNombre());
        System.out.println("");
        System.out.println(empresa.getDomicilio());
        System.out.println("Telefono: "+empresa.getTelefono());
        System.out.println(empresa.getCorreoElectronico());
        System.out.println(empresa.getPaginaWeb());
        System.out.println(empresa.getRfc());
        System.out.println("");
        System.out.println("Fecha: "+fechaHora);
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("Cliente: "+cliente.getNombre());
        System.out.println("Domicilio: "+cliente.getDomicilio());
        System.out.println("Telenofo: "+cliente.getTelefono());
        System.out.println("Correo: "+cliente.getCorreoElectronico());
        System.out.println("RFC: "+cliente.getRfc());
        System.out.println("");
        System.out.println("Articulo\tPrecio\tCantidad\tTotal");
        System.out.println("-----------------------------------------------------");
        System.out.println(producto.getNombre()+"\t"+producto.getPrecioUnitario()+"$\t"+detalleVenta.getCantidad()+"\t\t"+detalleVenta.getImporte()+"$");
        System.out.println("-----------------------------------------------------");
        System.out.println("Subtotal: \t\t\t\t"+subTotal);
        System.out.println("IVA: \t\t\t\t\t"+(impuesto*100)+"%");
        System.out.println("\t\t\t\t\t"+iva+"$");
        System.out.println("-----------------------------------------------------");
        System.out.println("Total:\t\t\t\t "+total+"$");
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
