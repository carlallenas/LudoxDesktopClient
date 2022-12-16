/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import data.ClientConnection;
import data.ClientHelper;
import data.GameScore;
import data.Rental;
import data.Videogame;
import helpers.DateHelper;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author CARLA LLENAS
 */
public class PantallaVideojuego extends javax.swing.JFrame {

    Videogame videogame;
    Rental rental;
    private static String score;
    private String title;
    private String userName;
    private String rentalInitial;
    private String rentalFinal;

    /**
     * Creates new form PantallaVideojuego
     */
    public PantallaVideojuego(Videogame videogame) {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.videogame = videogame;

        GameTittle.setText(videogame.getName());
        if (videogame.getCategories().size() > 0) {
            CategoryLabel.setText(videogame.getCategories().get(0).getCategory());
        } else {
            CategoryLabel.setText("Not found");
        }
        if (videogame.getPlatforms().size() > 0) {
            PlatformLabel.setText(videogame.getPlatforms().get(0).getName());
        } else {
            PlatformLabel.setText("Not found");
        }
        DescriptionLabel.setText(videogame.getDescription());
        PublisherLabel.setText(videogame.getPublisher());
        Icon icon = new ImageIcon(new ImageIcon(videogame.getGameImage()).getImage().getScaledInstance(Image.getWidth(), Image.getHeight(), java.awt.Image.SCALE_DEFAULT));
        Image.setIcon(icon);
        txtFechaInicio.setText("0000/00/00");
        txtFechaFin.setText("0000/00/00");
        DateLabel.setText(DateHelper.convertDateToString(videogame.getReleaseDate()));
        labelScore.setText(videogame.getFinalScore() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCard = new javax.swing.JPanel();
        PanelGame = new javax.swing.JPanel();
        bntRental = new javax.swing.JButton();
        GameTittle = new javax.swing.JLabel();
        CategoryLabel = new javax.swing.JLabel();
        PlatformLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        ScoreLabel = new javax.swing.JLabel();
        PublisherTittle = new javax.swing.JLabel();
        PublisherLabel = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        btnScore = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        labelCat = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelPlat1 = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        fondoo = new javax.swing.JLabel();
        PanelScore = new javax.swing.JPanel();
        btnAtrasScore = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSaveScore = new javax.swing.JButton();
        txtNewScore = new javax.swing.JTextField();
        PanelRental = new javax.swing.JPanel();
        btnAlquilar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCard.setBackground(new java.awt.Color(102, 102, 0));
        PanelCard.setLayout(new java.awt.CardLayout());

        PanelGame.setBackground(new java.awt.Color(0, 0, 0));
        PanelGame.setLayout(null);

        bntRental.setBackground(new java.awt.Color(153, 255, 153));
        bntRental.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        bntRental.setForeground(new java.awt.Color(0, 0, 0));
        bntRental.setText("Alquilar");
        bntRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRentalActionPerformed(evt);
            }
        });
        PanelGame.add(bntRental);
        bntRental.setBounds(630, 470, 250, 42);

        GameTittle.setFont(new java.awt.Font("Source Sans Pro Light", 0, 36)); // NOI18N
        GameTittle.setForeground(new java.awt.Color(255, 255, 255));
        GameTittle.setBorder(new javax.swing.border.MatteBorder(null));
        GameTittle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelGame.add(GameTittle);
        GameTittle.setBounds(170, 30, 360, 47);

        CategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CategoryLabel.setBorder(new javax.swing.border.MatteBorder(null));
        PanelGame.add(CategoryLabel);
        CategoryLabel.setBounds(47, 145, 150, 33);

        PlatformLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlatformLabel.setBorder(new javax.swing.border.MatteBorder(null));
        PanelGame.add(PlatformLabel);
        PlatformLabel.setBounds(232, 145, 150, 33);

        DescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DescriptionLabel.setBorder(new javax.swing.border.MatteBorder(null));
        PanelGame.add(DescriptionLabel);
        DescriptionLabel.setBounds(47, 215, 530, 232);

        DateLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel.setBorder(new javax.swing.border.MatteBorder(null));
        PanelGame.add(DateLabel);
        DateLabel.setBounds(417, 145, 150, 33);

        ScoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        ScoreLabel.setText("SCORE");
        PanelGame.add(ScoreLabel);
        ScoreLabel.setBounds(47, 496, 76, 42);

        PublisherTittle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PublisherTittle.setForeground(new java.awt.Color(255, 255, 255));
        PublisherTittle.setText("Publisher:");
        PanelGame.add(PublisherTittle);
        PublisherTittle.setBounds(47, 453, 76, 25);

        PublisherLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PublisherLabel.setForeground(new java.awt.Color(255, 255, 255));
        PublisherLabel.setBorder(new javax.swing.border.MatteBorder(null));
        PanelGame.add(PublisherLabel);
        PublisherLabel.setBounds(141, 453, 150, 25);

        Image.setBorder(new javax.swing.border.MatteBorder(null));
        PanelGame.add(Image);
        Image.setBounds(606, 42, 291, 396);

        btnScore.setFont(new java.awt.Font("Source Sans Pro Light", 0, 14)); // NOI18N
        btnScore.setText("Añadir Puntuacion");
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });
        PanelGame.add(btnScore);
        btnScore.setBounds(370, 490, 153, 42);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        PanelGame.add(btnAtras);
        btnAtras.setBounds(39, 564, 84, 24);

        labelCat.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelCat.setForeground(new java.awt.Color(255, 255, 255));
        labelCat.setText("Categoria");
        PanelGame.add(labelCat);
        labelCat.setBounds(47, 107, 90, 25);

        labelDate.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setText("Fecha de lanzamiento");
        PanelGame.add(labelDate);
        labelDate.setBounds(417, 107, 173, 25);

        labelPlat1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        labelPlat1.setForeground(new java.awt.Color(255, 255, 255));
        labelPlat1.setText("Plataforma");
        PanelGame.add(labelPlat1);
        labelPlat1.setBounds(232, 107, 87, 25);

        labelScore.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        labelScore.setForeground(new java.awt.Color(255, 255, 255));
        labelScore.setBorder(new javax.swing.border.MatteBorder(null));
        PanelGame.add(labelScore);
        labelScore.setBounds(140, 500, 150, 30);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        PanelGame.add(jSeparator2);
        jSeparator2.setBounds(40, 90, 550, 10);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        PanelGame.add(jSeparator3);
        jSeparator3.setBounds(40, 130, 130, 10);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        PanelGame.add(jSeparator4);
        jSeparator4.setBounds(230, 130, 130, 10);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        PanelGame.add(jSeparator5);
        jSeparator5.setBounds(410, 130, 190, 10);

        fondoo.setIcon(new javax.swing.ImageIcon("C:\\Users\\CARLA LLENAS\\OneDrive\\Documentos\\NetBeansProjects\\LudoxCliente\\src\\main\\images\\fondogameee.png")); // NOI18N
        PanelGame.add(fondoo);
        fondoo.setBounds(0, 0, 913, 600);

        PanelCard.add(PanelGame, "card2");

        PanelScore.setBackground(new java.awt.Color(204, 204, 255));
        PanelScore.setPreferredSize(new java.awt.Dimension(913, 602));

        btnAtrasScore.setText("Atras");
        btnAtrasScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasScoreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Puntua el juego");

        label1.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("1 - Muy malo");

        label2.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("2 - Malo");

        label3.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("3 - Bueno");

        label4.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("4 - Muy Bueno");

        label5.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("5 - Excelente");

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Indica tu puntuación");

        btnSaveScore.setText("Guardar Puntuación");
        btnSaveScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveScoreActionPerformed(evt);
            }
        });

        txtNewScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelScoreLayout = new javax.swing.GroupLayout(PanelScore);
        PanelScore.setLayout(PanelScoreLayout);
        PanelScoreLayout.setHorizontalGroup(
            PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelScoreLayout.createSequentialGroup()
                .addGroup(PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelScoreLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnAtrasScore, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelScoreLayout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1))
                    .addGroup(PanelScoreLayout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addGroup(PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelScoreLayout.createSequentialGroup()
                                .addGroup(PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelScoreLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                        .addComponent(label2)
                                        .addGap(122, 122, 122)
                                        .addComponent(label3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelScoreLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)))
                                .addGroup(PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelScoreLayout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(label4)
                                        .addGap(122, 122, 122)
                                        .addComponent(label5))
                                    .addGroup(PanelScoreLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtNewScore, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(PanelScoreLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(btnSaveScore, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelScoreLayout.setVerticalGroup(
            PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelScoreLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(label2)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(label5))
                .addGap(113, 113, 113)
                .addGroup(PanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNewScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnSaveScore, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnAtrasScore)
                .addGap(34, 34, 34))
        );

        PanelCard.add(PanelScore, "card2");

        PanelRental.setBackground(new java.awt.Color(102, 153, 255));
        PanelRental.setPreferredSize(new java.awt.Dimension(913, 602));

        btnAlquilar.setText("Alquilar");
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Source Serif Pro Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha fin del alquiler");

        jLabel4.setFont(new java.awt.Font("Source Serif Pro Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha inicio del alquiler");

        txtFechaInicio.setForeground(new java.awt.Color(0, 0, 0));

        txtFechaFin.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelRentalLayout = new javax.swing.GroupLayout(PanelRental);
        PanelRental.setLayout(PanelRentalLayout);
        PanelRentalLayout.setHorizontalGroup(
            PanelRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRentalLayout.createSequentialGroup()
                .addGroup(PanelRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelRentalLayout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(btnAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelRentalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGap(110, 110, 110)
                        .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRentalLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel4)
                    .addContainerGap(692, Short.MAX_VALUE)))
        );
        PanelRentalLayout.setVerticalGroup(
            PanelRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRentalLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(PanelRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148)
                .addComponent(btnAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(PanelRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRentalLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jLabel4)
                    .addContainerGap(512, Short.MAX_VALUE)))
        );

        PanelCard.add(PanelRental, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        // TODO add your handling code here:
        PanelCard.removeAll();
        PanelCard.add(PanelScore);
        PanelCard.repaint();
        PanelCard.revalidate();
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnAtrasScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasScoreActionPerformed
        // TODO add your handling code here:
        PanelCard.removeAll();
        PanelCard.add(PanelGame);
        PanelCard.repaint();
        PanelCard.revalidate();
    }//GEN-LAST:event_btnAtrasScoreActionPerformed

    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed

        try {
            ClientConnection.getDos().writeByte(8);
            ClientConnection.getDos().writeUTF(ClientHelper.userName);
            ClientConnection.getDos().writeUTF(ClientHelper.videogameName);
            ClientConnection.getDos().writeUTF(txtFechaInicio.getText());
            ClientConnection.getDos().writeUTF(txtFechaFin.getText());
            int retorno = ClientConnection.getDis().readInt();
            if (retorno == 1 || retorno == 0) {
                if (JOptionPane.showConfirmDialog(null, retorno == 0 ? "Alquiler registrado correctamente" : "Alquiler actualizado correctamente", ClientHelper.videogameName, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE) == 0) {
                this.dispose();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(PantallaVideojuego.class.getName()).log(Level.SEVERE, "Error alquiler", ex);
        }
    }//GEN-LAST:event_btnAlquilarActionPerformed

    private void bntRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRentalActionPerformed
        // TODO add your handling code here:
        PanelCard.removeAll();
        PanelCard.add(PanelRental);
        PanelCard.repaint();
        PanelCard.revalidate();
    }//GEN-LAST:event_bntRentalActionPerformed


    private void btnSaveScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveScoreActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ClientConnection.getDos().writeByte(9);
            ClientConnection.getDos().writeUTF(ClientHelper.userName);
            ClientConnection.getDos().writeUTF(ClientHelper.videogameName);
            ClientConnection.getDos().writeDouble(Double.parseDouble(txtNewScore.getText()));
            int retorno = ClientConnection.getDis().readInt();
            if (retorno == 1 || retorno == 0) {
                videogame = (Videogame) ClientConnection.getOis().readObject();
                update();
                if (JOptionPane.showConfirmDialog(null, retorno == 0 ? "Puntuacion registrada correctamente" : "Puntuacion actualizada correctamente", ClientHelper.videogameName, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE) == 0) {
                this.dispose();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(PantallaVideojuego.class.getName()).log(Level.SEVERE, "Error score", ex);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnSaveScoreActionPerformed

    private void txtNewScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewScoreActionPerformed

    private void update() {
        GameTittle.setText(videogame.getName());
        if (videogame.getCategories().size() > 0) {
            CategoryLabel.setText(videogame.getCategories().get(0).getCategory());
        } else {
            CategoryLabel.setText("Not found");
        }
        if (videogame.getPlatforms().size() > 0) {
            PlatformLabel.setText(videogame.getPlatforms().get(0).getName());
        } else {
            PlatformLabel.setText("Not found");
        }
        DescriptionLabel.setText(videogame.getDescription());
        PublisherLabel.setText(videogame.getPublisher());
        Icon icon = new ImageIcon(new ImageIcon(videogame.getGameImage()).getImage().getScaledInstance(Image.getWidth(), Image.getHeight(), java.awt.Image.SCALE_DEFAULT));
        Image.setIcon(icon);
        txtFechaInicio.setText("0000/00/00");
        txtFechaFin.setText("0000/00/00");
        DateLabel.setText(DateHelper.convertDateToString(videogame.getReleaseDate()));
        labelScore.setText(videogame.getFinalScore() + "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel GameTittle;
    private javax.swing.JLabel Image;
    private javax.swing.JPanel PanelCard;
    private javax.swing.JPanel PanelGame;
    private javax.swing.JPanel PanelRental;
    private javax.swing.JPanel PanelScore;
    private javax.swing.JLabel PlatformLabel;
    private javax.swing.JLabel PublisherLabel;
    private javax.swing.JLabel PublisherTittle;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JButton bntRental;
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAtrasScore;
    private javax.swing.JButton btnSaveScore;
    private javax.swing.JButton btnScore;
    private javax.swing.JLabel fondoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel labelCat;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelPlat1;
    private javax.swing.JLabel labelScore;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNewScore;
    // End of variables declaration//GEN-END:variables
}
