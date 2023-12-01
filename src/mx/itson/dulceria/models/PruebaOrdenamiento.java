/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.dulceria.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.dulceria.entities.Producto;
import mx.itson.dulceria.entities.Venta;


/**
 *
 * @author alexi
 */
public class PruebaOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Producto p1 = new Producto("ChocoDelight", 2.49, 150, 200, "Chocolate, azúcar, nueces", "2023-12-31", "SweetCo", 51);
        Producto p2 = new Producto("Jelly Joy", 1.99, 120, 150, "Gelatina, azúcar, sabores naturales", "2023-11-30", "CandyWorld", 36);
        Producto p3 = new Producto("CaramelCrunch", 3.29, 180, 250, "Caramelo, cacahuetes, chocolate", "2024-01-15", "SweetDwlights", 10);
        Producto p4 = new Producto("MintMelt", 1.79, 100.0, 120.0, "Menta, azúcar, chocolate", "2023-12-20", "FreshTreats", 72);
        Producto p5 = new Producto("FruityBurst", 2.99, 130.0, 180.0, "Frutas secas, azúcar, gelatina", "2024-02-28", "FruitCraze", 46);
        Producto p6 = new Producto("VanillaDream", 2.19, 160.0, 220.0, "Vainilla, azúcar, galletas", " 2023-12-10", "DreamSweets", 2);
        Producto p7 = new Producto("PeanutParadise", 3.49, 200.0, 280.0, "Cacahuetes, caramelo, chocolate", "2024-03-15", "NuttyJoy", 5);
        Producto p8 = new Producto("BerryBlast", 2.89, 140.0, 190.0, "Bayas, azúcar, gelatina", "2023-11-25", "BerryDelight", 165);
        Producto p9 = new Producto("AlmondDelight", 3.99, 180.0, 260.0, "Almendras, caramelo, chocolate", "2024-02-10", "AlmondJoy", 94);
        Producto p10 = new Producto("LemonLicious", 2.59, 120.0, 170.0, "Limón, azúcar, galletas", "2023-12-05", "ZestyTreats", 46);
        
        List<Producto> productos = new ArrayList();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);
        
/*        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta(productos, sdf.parse("2023-01-15")));
        ventas.add(new Venta(productos, sdf.parse("2023-01-15")));
        ventas.add(new Venta(productos, sdf.parse("2023-01-02")));*/
        
        
        for(Producto p: Busqueda.buscarProducto(productos, "Jelly Joy")){
            System.out.println(p.getNombre()+"      "+p.getPrecioUnitario());
        }
        
/*        for(Venta p : Busqueda.buscarVenta(ventas, sdf.parse("2023-01-15"))){
            System.out.println(p.getDate());
        }*/
        
/*        for(Venta v: ordenamientoVenta.fechaDescendente(ventas)){
            System.out.println(v.getDate());
        }*/

        
    }
    
}
