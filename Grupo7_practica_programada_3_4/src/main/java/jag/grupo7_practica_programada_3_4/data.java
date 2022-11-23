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




    public class data implements Serializable {
        public void EscribirArchivos(Productos product) {
        try {
            ArrayList<Productos> productos = LeerDatosDeArchivo();
            productos.add(product);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Productos.txt"));
            for (Productos per : productos) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Productos> LeerDatosDeArchivo() {
        ArrayList<Productos> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("Productos.txt"));

            Productos product = null;
            product = (Productos) s.readObject();
            while (product != null) {
                datos.add(product);
                product = (Productos) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(datos);
        }
        return datos;
    }
}


