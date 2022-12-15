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

public class InformacionEspeciesAgo implements Serializable {
   public void Escribir(EspeciesAgo A) {
        try {
            ArrayList<EspeciesAgo> espe = Leer();
            espe.add(A);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("EspeciesAgotadas.txt"));
            for (EspeciesAgo per : espe) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<EspeciesAgo> Leer() {
        ArrayList<EspeciesAgo> InformacionEspeciesAgo = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("EspeciesAgotadas.txt"));

            EspeciesAgo A = null;
            A = (EspeciesAgo) s.readObject();
            while (A != null) {
                InformacionEspeciesAgo.add(A);
                A = (EspeciesAgo) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionEspeciesAgo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(InformacionEspeciesAgo);
        }
        return InformacionEspeciesAgo;
    }
   
}

