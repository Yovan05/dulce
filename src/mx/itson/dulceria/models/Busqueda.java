/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dulceria.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.dulceria.entities.Producto;
import mx.itson.dulceria.entities.Venta;


/**
 *
 * @author alexi
 */
public class Busqueda {
    
public static List<Producto> buscarProducto(List<Producto> productos, String name){
        
        List<Producto> encontrados = new ArrayList();
        int nCaracteresBucar = name.length();
        char[] caracteres = name.toCharArray();
        for(int i=0; i<productos.size(); i++){
            String encontrar="";
            char[] letras = productos.get(i).getNombre().toCharArray();
            int nCaracteresEncontrar = productos.get(i).getNombre().length();
            
            int menCaracateres=0;
            if(nCaracteresBucar<=nCaracteresEncontrar){
                menCaracateres=nCaracteresBucar;
            }else{
                menCaracateres=nCaracteresEncontrar;
            }
            
            
            for(int j = 0; j<menCaracateres; j++){
                char letra = letras[j];
                encontrar+= String.valueOf(letra);
            }
            
            if(encontrar.equalsIgnoreCase(name)){
                encontrados.add(productos.get(i));
            }
            
        }
        
        return encontrados;
    }
    
    public static List<Venta> buscarVenta(List<Venta> ventas, Date date){
        
        List<Venta> encontrados = new ArrayList();
        
        for(int i=0; i<ventas.size(); i++){
            
            if(date.compareTo(ventas.get(i).getFecha())==0){
                encontrados.add(ventas.get(i));
            }
            
        }
        
        return encontrados;
    }
    
    
    
    
}
