/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jag.grupo7_practica_programada_3_4;

import java.io.Serializable;


public class Venta implements Serializable{
    private String nombre;
    private int precio;
    private String marca;
    private int Cedula;
    public Venta(String nombre, int precio, String marca, int Cedula) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.Cedula = Cedula;
    }

    public Venta() {
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
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
        return "Venta{" + "Numero de cedula="+ Cedula +",nombre="+ nombre +", Precio=" + precio + ", Marca=" + marca + '}';
    }
}
