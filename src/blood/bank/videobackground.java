/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.bank;

import java.io.File;

/**
 *
 * @author ARNAV
 */
public class videobackground extends javax.swing.JFrame {

    /**
     * Creates new form videobackground
     */
    public videobackground() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("presented by....");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 240, 200, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("videotutorial");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 190, 220, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARNAV\\Downloads\\Jujutsu.gif")); // NOI18N
        jLabel4.setText("icon");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, -40, 350, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
        new videobackground().setVisible(true);
        
        MP3Player player=new MP3Player(new File("C:\\Users\\ARNAV\\Downloads\\Jujutsu.gif"));
        player.play();
        Thread.sleep(100000);
                
            
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
