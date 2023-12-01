/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dulceria.entities;

/**
 *
 * @author alexi
 */
public class Producto {
    
    private String nombre=new String();
    private double precioUnitario=0;
    private double peso=0;
    private double calorias=0;
    private String ingredientes=new String();
    private String caducidad=new String();
    private String fabricante=new String();
    private int stock=0;

    public Producto() {
    }

    public Producto(String nombre, double precioUnitario, double peso, double calorias, String ingredientes, String caducidad, String fabricante,int stock){
        this.nombre=nombre;
        this.precioUnitario=precioUnitario;
        this.peso=peso;
        this.calorias=calorias;
        this.ingredientes=ingredientes;
        this.caducidad=caducidad;
        this.fabricante=fabricante;
        this.stock=stock;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
    
    
}
