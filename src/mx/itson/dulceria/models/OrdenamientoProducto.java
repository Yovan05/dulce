/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dulceria.models;

import java.util.ArrayList;
import java.util.List;
import mx.itson.dulceria.entities.Producto;

/**
 *
 * @author alexi
 */
public class OrdenamientoProducto {
    
    
    public static List<Producto> precioAscendente(List<Producto> productos){
    
        Producto aux = new Producto();
        for (int i = 1; i < productos.size(); i++) {
         
            aux = productos.get(i);
            int j;
            
            for (j = i - 1; j >=0 && productos.get(j).getPrecioUnitario()> aux.getPrecioUnitario(); j--){
                productos.set(j+1, productos.get(j));
                productos.set(j, aux);
            }
            
        }
        return productos;
    }
    
    public static List<Producto> precioDescendente(List<Producto> productos){
    
        Producto aux = new Producto();
        for (int i = 1; i < productos.size(); i++) {
         
            aux = productos.get(i);
            int j;
            
            for (j = i - 1; j >=0 && productos.get(j).getPrecioUnitario()< aux.getPrecioUnitario(); j--){
                productos.set(j+1, productos.get(j));
                productos.set(j, aux);
            }
            
        }
        return productos;
    }
    
    public static List<Producto> nombreAscendente(List<Producto> productos){
    
        Producto aux = new Producto();
        for (int i = 1; i < productos.size(); i++) {
         
            aux = productos.get(i);
            int j;
            
            for (j = i - 1; j >=0 && productos.get(j).getNombre().compareTo(aux.getNombre()) > 0; j--){
                productos.set(j+1, productos.get(j));
                productos.set(j, aux);
            }
            
        }
        return productos;
    }
    
    public static List<Producto> nombreDescendente(List<Producto> productos){
    
        Producto aux = new Producto();
        for (int i = 1; i < productos.size(); i++) {
         
            aux = productos.get(i);
            int j;
            
            for (j = i - 1; j >=0 && productos.get(j).getNombre().compareTo(aux.getNombre()) < 0; j--){
                productos.set(j+1, productos.get(j));
                productos.set(j, aux);
            }
            
        }
        return productos;
    }
    
    
}
