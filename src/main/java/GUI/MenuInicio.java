/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author ale_9
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        JMAjustes = new javax.swing.JMenu();
        JMParametros = new javax.swing.JMenuItem();
        JMIntervalos = new javax.swing.JMenuItem();
        JMPotenciaBombas = new javax.swing.JMenuItem();
        JMDispositivos = new javax.swing.JMenu();
        JMAgregar = new javax.swing.JMenuItem();
        JMEliminar = new javax.swing.JMenuItem();
        JMOnOff = new javax.swing.JMenu();
        JMReportes = new javax.swing.JMenu();
        JMSalir = new javax.swing.JMenu();
        JMCerrarSesion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMSalirTodo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Riego");
        setBounds(new java.awt.Rectangle(450, 50, 500, 600));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 600));

        JMAjustes.setText("Ajustes");

        JMParametros.setText("Parámetros");
        JMParametros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMParametrosMouseClicked(evt);
            }
        });
        JMParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMParametrosActionPerformed(evt);
            }
        });
        JMAjustes.add(JMParametros);

        JMIntervalos.setText("Intervalos");
        JMAjustes.add(JMIntervalos);

        JMPotenciaBombas.setText("Potencia de bombas");
        JMAjustes.add(JMPotenciaBombas);

        jMenuBar1.add(JMAjustes);

        JMDispositivos.setText("Dispositivos");

        JMAgregar.setText("Agregar");
        JMDispositivos.add(JMAgregar);

        JMEliminar.setText("Eliminar");
        JMDispositivos.add(JMEliminar);

        jMenuBar1.add(JMDispositivos);

        JMOnOff.setText("ON/OFF");
        jMenuBar1.add(JMOnOff);

        JMReportes.setText("Reportes");
        jMenuBar1.add(JMReportes);

        JMSalir.setText("Salir");

        JMCerrarSesion.setText("Cerrar sesión");
        JMSalir.add(JMCerrarSesion);
        JMSalir.add(jSeparator1);

        JMSalirTodo.setText("Salir");
        JMSalir.add(JMSalirTodo);

        jMenuBar1.add(JMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMParametrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMParametrosMouseClicked
        
  
    }//GEN-LAST:event_JMParametrosMouseClicked

    private void JMParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMParametrosActionPerformed
        // TODO add your handling code here:
        Parametros Pm = new Parametros();
        Pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMParametrosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMAgregar;
    private javax.swing.JMenu JMAjustes;
    private javax.swing.JMenuItem JMCerrarSesion;
    private javax.swing.JMenu JMDispositivos;
    private javax.swing.JMenuItem JMEliminar;
    private javax.swing.JMenuItem JMIntervalos;
    private javax.swing.JMenu JMOnOff;
    private javax.swing.JMenuItem JMParametros;
    private javax.swing.JMenuItem JMPotenciaBombas;
    private javax.swing.JMenu JMReportes;
    private javax.swing.JMenu JMSalir;
    private javax.swing.JMenuItem JMSalirTodo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
