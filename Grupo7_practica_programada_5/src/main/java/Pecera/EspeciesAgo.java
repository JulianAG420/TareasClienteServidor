package Pecera;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yulien
 */
public class EspeciesAgo implements Serializable{
     private String nombre;
    private int cantidad;
     private String categoria;
    private int precio;

    public EspeciesAgo( String nombre, int cantidad, String categoria, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio= precio;
    }
    public EspeciesAgo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


   
    

    
    @Override
    public String toString() {
        return "Especie{" + "Nombre de la especie  :=" + nombre +"Cantidad de peces  :="+ cantidad +"Categoria  :="+categoria + "Precio  :="+ precio +'}';
    }
    
}

