package Pecera;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

public class InformacionEspecies implements Serializable {
   public void Escribir(Especies E) {
        try {
            ArrayList<Especies> espe = Leer();
            espe.add(E);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Especies.txt"));
            for (Especies per : espe) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Especies> Leer() {
        ArrayList<Especies> InformacionEspecies = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("Especies.txt"));

            Especies E = null;
            E = (Especies) s.readObject();
            while (E != null) {
                InformacionEspecies.add(E);
                E = (Especies) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionEspecies.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(InformacionEspecies);
        }
        return InformacionEspecies;
    }
   
}

