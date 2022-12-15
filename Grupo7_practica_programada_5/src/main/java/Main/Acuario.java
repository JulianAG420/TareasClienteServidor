package Main;



import java.io.IOException;

public class Acuario extends javax.swing.JFrame {
   

    public Acuario() throws IOException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        titulomain = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        VerAgotadas = new javax.swing.JButton();
        verEspecies = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(0, 0, 255));

        titulomain.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulomain.setText("El acuario");

        Registrar.setBackground(new java.awt.Color(125, 0, 80));
        Registrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Registrar.setForeground(new java.awt.Color(0, 0, 0));
        Registrar.setText("Registrar Especie");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        VerAgotadas.setBackground(new java.awt.Color(85, 200, 80));
        VerAgotadas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VerAgotadas.setForeground(new java.awt.Color(0, 0, 0));
        VerAgotadas.setText("Ver Especies Agotadas");
        VerAgotadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAgotadasActionPerformed(evt);
            }
        });

        verEspecies.setBackground(new java.awt.Color(110, 20, 185));
        verEspecies.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        verEspecies.setForeground(new java.awt.Color(0, 0, 0));
        verEspecies.setText("Ver Especies");
        verEspecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEspeciesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(titulomain)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainpanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainpanelLayout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(VerAgotadas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(verEspecies, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 246, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addGap(9, 9, 9)
                .addComponent(titulomain)
                .addGap(18, 18, 18)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(verEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(VerAgotadas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        RegistroEspecie registro = new RegistroEspecie();
        registro.setVisible(true);
        registro.setLocationRelativeTo(this);
     
    }//GEN-LAST:event_RegistrarActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void VerAgotadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAgotadasActionPerformed
         VeragotadasE ver = new VeragotadasE();
  ver.setVisible(true);
  ver.setLocationRelativeTo(this);
      
    }//GEN-LAST:event_VerAgotadasActionPerformed

    private void verEspeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEspeciesActionPerformed
  Verespecies ver = new Verespecies();
  ver.setVisible(true);
  ver.setLocationRelativeTo(this);
    }//GEN-LAST:event_verEspeciesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JButton VerAgotadas;
    private javax.swing.JButton exit;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel titulomain;
    private javax.swing.JButton verEspecies;
    // End of variables declaration//GEN-END:variables
}