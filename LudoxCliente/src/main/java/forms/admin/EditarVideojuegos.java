/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.admin;

import data.ClientConnection;
import data.ClientHelper;
import data.Videogame;
import forms.Principal;
import helpers.EditVideogame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author CARLA LLENAS
 */
public class EditarVideojuegos extends javax.swing.JFrame {

    Videogame v;

    /**
     * Creates new form EditarVideojuegos
     */
    public EditarVideojuegos() {
        initComponents();
        String[] Games = new String[ClientHelper.listVideogamesTop5.size()];
        int[] i = {0};
        ClientHelper.listVideogamesTop5.forEach(p -> {
            Games[i[0]] = p.getName();
            i[0]++;
        });
        boxGames.setModel(new DefaultComboBoxModel<>(Games));

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelModificar = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelDescrip = new javax.swing.JLabel();
        labelPublisher = new javax.swing.JLabel();
        labelDeveloper = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelImage = new javax.swing.JLabel();
        txtDeveloperEdited = new javax.swing.JTextField();
        txtDescripEdited = new javax.swing.JTextField();
        txtDateEdited = new javax.swing.JTextField();
        txtPublisherEdited = new javax.swing.JTextField();
        txtImgEdited = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelNameEdited = new javax.swing.JLabel();
        txtNameEdited = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        boxGames = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelModificar.setBackground(new java.awt.Color(204, 255, 204));
        PanelModificar.setForeground(new java.awt.Color(255, 0, 102));
        PanelModificar.setLayout(null);

        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Nombre del Videojuego a modificar");
        PanelModificar.add(labelName);
        labelName.setBounds(208, 81, 194, 16);

        labelDescrip.setForeground(new java.awt.Color(255, 255, 255));
        labelDescrip.setText("Descripcion");
        PanelModificar.add(labelDescrip);
        labelDescrip.setBounds(47, 309, 66, 16);

        labelPublisher.setForeground(new java.awt.Color(255, 255, 255));
        labelPublisher.setText("Publisher");
        PanelModificar.add(labelPublisher);
        labelPublisher.setBounds(47, 443, 53, 16);

        labelDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        labelDeveloper.setText("Desarrollador");
        PanelModificar.add(labelDeveloper);
        labelDeveloper.setBounds(47, 248, 76, 16);

        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setText("Fecha de lanzamiento");
        PanelModificar.add(labelDate);
        labelDate.setBounds(47, 376, 121, 16);

        labelImage.setForeground(new java.awt.Color(255, 255, 255));
        labelImage.setText("Imagen");
        PanelModificar.add(labelImage);
        labelImage.setBounds(508, 327, 42, 16);

        txtDeveloperEdited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeveloperEditedActionPerformed(evt);
            }
        });
        PanelModificar.add(txtDeveloperEdited);
        txtDeveloperEdited.setBounds(211, 240, 250, 32);
        PanelModificar.add(txtDescripEdited);
        txtDescripEdited.setBounds(211, 301, 250, 32);
        PanelModificar.add(txtDateEdited);
        txtDateEdited.setBounds(211, 368, 250, 32);
        PanelModificar.add(txtPublisherEdited);
        txtPublisherEdited.setBounds(211, 435, 250, 32);
        PanelModificar.add(txtImgEdited);
        txtImgEdited.setBounds(508, 386, 362, 32);

        btnSave.setText("GUARDAR");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        PanelModificar.add(btnSave);
        btnSave.setBounds(487, 485, 123, 52);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        PanelModificar.add(btnAtras);
        btnAtras.setBounds(62, 505, 90, 24);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUEVOS DATOS");
        PanelModificar.add(jLabel5);
        jLabel5.setBounds(28, 117, 132, 25);
        PanelModificar.add(jSeparator1);
        jSeparator1.setBounds(20, 50, 870, 10);

        labelNameEdited.setForeground(new java.awt.Color(255, 255, 255));
        labelNameEdited.setText("Nuevo nombre");
        PanelModificar.add(labelNameEdited);
        labelNameEdited.setBounds(47, 184, 81, 16);
        PanelModificar.add(txtNameEdited);
        txtNameEdited.setBounds(211, 176, 250, 32);
        PanelModificar.add(jSeparator2);
        jSeparator2.setBounds(22, 148, 870, 10);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MODIFICAR VIDEOJUEGOS");
        PanelModificar.add(jLabel6);
        jLabel6.setBounds(366, 18, 216, 25);

        btnChoose.setText("Cargar Imagen");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        PanelModificar.add(btnChoose);
        btnChoose.setBounds(615, 319, 225, 24);

        boxGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGamesActionPerformed(evt);
            }
        });
        PanelModificar.add(boxGames);
        boxGames.setBounds(424, 76, 285, 26);

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\CARLA LLENAS\\OneDrive\\Documentos\\NetBeansProjects\\LudoxCliente\\src\\main\\images\\fondoMenuAdmin.jpg")); // NOI18N
        PanelModificar.add(fondo);
        fondo.setBounds(0, 0, 920, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtDeveloperEditedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeveloperEditedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeveloperEditedActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // TODO add your handling code here:
        String ruta = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG", "jpg", "png");
        jFileChooser.setFileFilter(filtrado);

        int response = jFileChooser.showOpenDialog(this);
        if (response == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser.getSelectedFile().getPath();
            txtImgEdited.setText(ruta);
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void boxGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxGamesActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ClientConnection.getDos().writeByte(4); //falta poner byte correcto
            EditVideogame ev = new EditVideogame("");

            boxGames.isShowing();
            //ev.getCurrentName(ClientHelper.videogameName);

            if (!txtNameEdited.getText().trim().equals("")) {
                ev.setNewName(txtNameEdited.getText());
            }
            if (!txtDeveloperEdited.getText().trim().equals("")) {
                ev.setDeveloper(txtDeveloperEdited.getText());
            }
            if (!txtDescripEdited.getText().trim().equals("")) {
                ev.setDescription(txtDescripEdited.getText());
            }
            if (!txtDateEdited.getText().trim().equals("")) {
                ev.setReleaseDate(AltaVideojuegos.ConvertStringToDate(txtDateEdited.getText()));
            }
            if (!txtPublisherEdited.getText().trim().equals("")) {
                ev.setPublisher(txtPublisherEdited.getText());
            }
//            if (!txtImgEdited.getText().trim().equals("")) {
//                ev.setGameImage(AltaVideojuegos.getImageAsBytes(txtImgEdited.getText()));
//            }

            ClientConnection.getOos().writeObject(ev);
            boolean correct = ClientConnection.getDis().readBoolean();
            if (correct) {
                if (!txtNameEdited.getText().trim().equals("")) {
                    v.setName(txtNameEdited.getText());
                }
                if (!txtDeveloperEdited.getText().trim().equals("")) {
                    v.setDeveloper(txtDeveloperEdited.getText());
                }
                if (!txtDescripEdited.getText().trim().equals("")) {
                    v.setDescription(txtDescripEdited.getText());
                }
                if (!txtDateEdited.getText().trim().equals("")) {
                    v.setReleaseDate(AltaVideojuegos.ConvertStringToDate(txtDateEdited.getText()));
                }
                if (!txtPublisherEdited.getText().trim().equals("")) {
                    v.setPublisher(txtPublisherEdited.getText());
                }
                if (!txtImgEdited.getText().trim().equals("")) {
                    v.setGameImage(AltaVideojuegos.getImageAsBytes(txtImgEdited.getText()));
                }

                JOptionPane.showMessageDialog(this, "Se han guardado los cambios correctamente");
            }

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al guardar los cambios");
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelModificar;
    private javax.swing.JComboBox<String> boxGames;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDescrip;
    private javax.swing.JLabel labelDeveloper;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNameEdited;
    private javax.swing.JLabel labelPublisher;
    private javax.swing.JTextField txtDateEdited;
    private javax.swing.JTextField txtDescripEdited;
    private javax.swing.JTextField txtDeveloperEdited;
    private javax.swing.JTextField txtImgEdited;
    private javax.swing.JTextField txtNameEdited;
    private javax.swing.JTextField txtPublisherEdited;
    // End of variables declaration//GEN-END:variables
}
