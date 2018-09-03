/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucentral.edu.vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN02F
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        createLayout();
    }
    
    public void createLayout(){       
        Toolkit screen = Toolkit.getDefaultToolkit(); //Clase ToolKit para detectar las medidas del monitor donde se ejecuta el programa y ajustar la medida de la ventana.
        Dimension screenSize = screen.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        Double layoutWidth = new Double(screenWidth * 0.8);
        Double layoutHeight = new Double(screenHeight * 0.8);
        Double layoutWidthPosition = new Double((screenWidth - layoutWidth) / 2);
        Double layoutHeigthPosition = new Double((screenHeight - layoutHeight) / 2);

        setVisible(true);
        setBounds(layoutWidthPosition.intValue(), layoutHeigthPosition.intValue(), layoutWidth.intValue(), layoutHeight.intValue());        
        Image icono = screen.getImage("src\\com\\ucentral\\edu\\vista\\drawable\\icon.png");
        setIconImage(icono);
        setTitle("Compilador Lexico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel0 = new javax.swing.JPanel();
        mainMenu = new javax.swing.JMenuBar();
        mOption1 = new javax.swing.JMenu();
        mOption1_Exit = new javax.swing.JMenuItem();
        mOption2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel0.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mOption1.setText("File");

        mOption1_Exit.setText("Exit");
        mOption1_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOption1_ExitActionPerformed(evt);
            }
        });
        mOption1.add(mOption1_Exit);

        mainMenu.add(mOption1);

        mOption2.setText("Edit");
        mainMenu.add(mOption2);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mOption1_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOption1_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mOption1_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vista layout = new Vista();                                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel0;
    private javax.swing.JMenu mOption1;
    private javax.swing.JMenuItem mOption1_Exit;
    private javax.swing.JMenu mOption2;
    private javax.swing.JMenuBar mainMenu;
    // End of variables declaration//GEN-END:variables
}
