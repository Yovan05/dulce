/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dulceria.models;

import java.time.format.DateTimeFormatter;
import java.util.List;
import mx.itson.dulceria.entities.Venta;

/**
 *
 * @author alexi
 */
public class ordenamientoVenta {
    
    public static List<Venta> fechaAscendente(List<Venta> ventas){
    
        Venta aux = new Venta();
        
        for (int i = 1; i < ventas.size(); i++) {
            aux = ventas.get(i);
            int j;
            
            for (j = i - 1; j >=0 && ventas.get(j).getFecha().compareTo(aux.getFecha()) > 0; j--){
                ventas.set(j+1, ventas.get(j));
                ventas.set(j, aux);
            }
            
        }
        return ventas;
    }
    
    public static List<Venta> fechaDescendente(List<Venta> ventas){
    
        Venta aux = new Venta();
        
        for (int i = 1; i < ventas.size(); i++) {
            aux = ventas.get(i);
            int j;
            
            for (j = i - 1; j >=0 && ventas.get(j).getFecha().compareTo(aux.getFecha()) < 0; j--){
                ventas.set(j+1, ventas.get(j));
                ventas.set(j, aux);
            }
            
        }
        return ventas;
    }
    
    
}
