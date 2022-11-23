/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jag.grupo7_practica_programada_3_4;
import java.io.Serializable;
/**
 *
 * @author yulien
 */
public class Productos implements Serializable{
    private String nombre;
    private int precio;
    private String marca;
    public Productos( String nombre, int precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca= marca;
    }
    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    
    @Override
    public String toString() {
        return "Producto{" + "Nombre del producto=" + nombre +", Precio=" + precio + ", Marca=" + marca + '}';
    }
    
}
