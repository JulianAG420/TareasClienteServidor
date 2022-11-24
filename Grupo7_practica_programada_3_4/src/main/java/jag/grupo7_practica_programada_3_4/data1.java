/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jag.grupo7_practica_programada_3_4;

/**
 *
 * @author yulien
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;




    public class data1 implements Serializable {
        public void Escribir(Venta sell) {
        try {
            ArrayList<Venta> ventas = Leer();
            ventas.add(sell);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Ventas.txt"));
            for (Venta per : ventas) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Venta> Leer() {
        ArrayList<Venta> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("Ventas.txt"));

            Venta sell = null;
            sell = (Venta) s.readObject();
            while (sell != null) {
                datos.add(sell);
                sell = (Venta) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(data1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(datos);
        }
        return datos;
    }
}


