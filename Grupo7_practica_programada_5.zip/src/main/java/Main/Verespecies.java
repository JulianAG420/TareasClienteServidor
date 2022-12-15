
package Main;




import Pecera.Especies;
import Pecera.InformacionEspecies;

import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Verespecies extends javax.swing.JFrame {
  DefaultTableModel modelo;
    InformacionEspecies ma = new InformacionEspecies();
    private TableRowSorter trsfiltro;
      String filtro;
    public Verespecies() {
        initComponents();
        vertabla();
    }
//ver tabla
    public void vertabla(){
        ArrayList<Especies> E = ma.Leer();
         
         modelo= new DefaultTableModel();
        modelo.addColumn("Categoria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
         this.data.setModel(modelo);
        for (int i = 0; i < E.size(); i++) {
            modelo.addRow(new Object[]{E.get(i).getCategoria(),E.get(i).getNombre(),E.get(i).getCantidad(),E.get(i).getPrecio()});
        }
        data.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneldata = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbcategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setBackground(new java.awt.Color(0, 195, 25));
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        data.setBackground(new java.awt.Color(255, 200, 102));
        data.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Categoria", "Nombre", "Cantidad", "Precio "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(data);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Especies Registradas");

        cmbcategoria.setBackground(new java.awt.Color(70, 255, 0));
        cmbcategoria.setForeground(new java.awt.Color(0, 0, 0));
        cmbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tropical", "Oriental" }));
        cmbcategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbcategoriaItemStateChanged(evt);
            }
        });

        jLabel2.setText("Filtrar por Categoria");

        javax.swing.GroupLayout paneldataLayout = new javax.swing.GroupLayout(paneldata);
        paneldata.setLayout(paneldataLayout);
        paneldataLayout.setHorizontalGroup(
            paneldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
            .addGroup(paneldataLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldataLayout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(116, 116, 116))))
        );
        paneldataLayout.setVerticalGroup(
            paneldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldataLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneldataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbcategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(back)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cmbcategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbcategoriaItemStateChanged
   String query = cmbcategoria.getSelectedItem().toString();
   TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
   data.setRowSorter(tr);
   
   if(query != " "){
       tr.setRowFilter(RowFilter.regexFilter(query));
       
   }else{
       data.setRowSorter(tr);
   }
    }//GEN-LAST:event_cmbcategoriaItemStateChanged
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> cmbcategoria;
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paneldata;
    // End of variables declaration//GEN-END:variables
}
