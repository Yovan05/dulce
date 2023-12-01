/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.dulceria.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import mx.itson.dulceria.entities.Caja;
import mx.itson.dulceria.entities.Cliente;
import mx.itson.dulceria.entities.DetalleVenta;
import mx.itson.dulceria.entities.Empleado;
import mx.itson.dulceria.entities.Empresa;
import mx.itson.dulceria.entities.Producto;
import mx.itson.dulceria.entities.Venta;

/**
 *
 * @author alexi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Empresa e1 = new Empresa();
        e1.setIdEmpresa(1);
        e1.setCorreoElectronico("dulcilandia@gmail.com");
        e1.setDomicilio("I. MORONES PRIETO 2400 PTE, LOMA LARGA, 64710");
        e1.setNombre("Dulcilandia");
        e1.setPaginaWeb("https://dulcilandia.com");
        e1.setRegistroPatronal("Esta empresa cumple con los requerimientos necesarios para operar");
        e1.setLicenciaSanitaria("Esta emprese cumple los lineaminetos sanitarios necesarios");
        e1.setRfc("KDM140608EA8");
        e1.setTelefono("6221503446");

/*        Empleado em1 = new Empleado();
        em1.setIdEmpleado(1);
        em1.setCorreoElectronico("Gabrielito@gmail.com");
        em1.setCurp("MECG770826HSRNSB79");
        em1.setDomicilio("LORENZO GARZA 2880, DEL PRADO, 64410");
        em1.setHorario("Lunes-Viernes, de 7:00 a 3:00 p.m.");
        em1.setNombre("Gabriel Mendivil Castillo");
        em1.setNss("304743872");
        em1.setPaginaWeb("https://dulcilandia/lorenzo.com");
        em1.setPuesto("Cajero");
        em1.setRfc("MECG770910VC1");
        em1.setSueldo(1900);
        em1.setTelefono("6223468461");*/

        Cliente c1 = new Cliente();
        c1.setIdClientes(1);
        c1.setCorreoElectronico("joselusy@gmail.com");
        c1.setDomicilio(" AVE CONSTITUCION PTE NO. 419, CENTRO, 64000");
        c1.setNombre("Jose Valle Sosa");
        c1.setRfc("VASJ771013LB3");
        c1.setTelefono("6225463126");

        Producto p1 = new Producto();
        p1.setCaducidad("FEB/24 03:17");
        p1.setCalorias(472.7);
        p1.setFabricante("Mars");
        p1.setIngredientes("Chocolate con leche 35%(Azucares añadidos(Azucares), Manteca de cacao, Pasta de cacao, Leche descremada en polvo, Solidos de la leche, Grasa butirica, Lecitina de soya)"
                + "Caramelo 27%(Azucares añadidos(Glucosa, Azucar), Leche descremada en polvo, Aceite vegetal, Solidos de la leche, Sal yodada, Saborizante artificial),"
                + "Cacahuate 22%, Nougat 16%(Azucares añadidos(Azucar, Glucosa), Sal yodada, Albumina de huevo)");
        p1.setNombre("Snickers");
        p1.setPeso(48);
        p1.setPrecioUnitario(20);

/*        Caja ca1 = new Caja();
        ca1.setEmpleado(em1);
        ca1.setIdCaja(1);*/

        DetalleVenta dV1 = new DetalleVenta();
        dV1.setCantidad(5);
        dV1.getImporte();
        dV1.setProducto(p1);

        Venta v1 = new Venta();
        v1.setIdVenta(1);
        v1.setCliente(c1);
//        v1.setDetalleVenta(dV1);
        v1.setEmpresa(e1);
        v1.setFechaHora(sdf.parse("2023-01-15"));
        v1.setImpuesto(0.16);
        v1.setSubTotal(dV1.getImporte());
        v1.getTotal();
        v1.iva();
        v1.ticket();
        

    }

}
