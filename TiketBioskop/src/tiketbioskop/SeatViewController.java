/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author JAKFAR
 */
public class SeatViewController extends javax.swing.JFrame {

    private ResultSet res;
    private final Statement stat;
    private final Connection con;

    /**
     * Creates new form SeatViewController
     */
    public SeatViewController() throws SQLException {
        initComponents();
        this.setTitle("Sahara Bioskop");
        this.setLocationRelativeTo(null);
        KoneksiViewController connection = new KoneksiViewController();
        connection.getKoneksi();
        stat = connection.getKoneksi().createStatement();
        con = (Connection) connection.getKoneksi();
        res = stat.executeQuery("select * from tb_det_transaksi where id_transaksi = '" + 1 + "'");
        try {
            // TODO add your handling code here:

            // Hanlde checkbox status
            while (res.next()) {
                // Retrive by coloumn name
                int idTransaksi = res.getInt("id_transaksi");
                String noKursi = res.getString("no_kursi");

                switch (noKursi) {
                    // Seat A
                    case "A1":
                        A1.setSelected(true);
                        A1.setEnabled(false);
                        break;
                    case "A2":
                        A2.setSelected(true);
                        A2.setEnabled(false);
                        break;
                    case "A3":
                        A3.setSelected(true);
                        A3.setEnabled(false);
                        break;
                    case "A4":
                        A4.setSelected(true);
                        A4.setEnabled(false);
                        break;
                    case "A7":
                        A7.setSelected(true);
                        A7.setEnabled(false);
                        break;
                    case "A8":
                        A8.setSelected(true);
                        A8.setEnabled(false);
                        break;
                    case "A9":
                        A9.setSelected(true);
                        A9.setEnabled(false);
                        break;
                    case "A10":
                        A10.setSelected(true);
                        A10.setEnabled(false);
                        break;
                    // End seat A

                    // Seat B
                    case "B1":
                        B1.setSelected(true);
                        B1.setEnabled(false);
                        break;
                    case "B2":
                        B2.setSelected(true);
                        B2.setEnabled(false);
                        break;
                    case "B3":
                        B3.setSelected(true);
                        B3.setEnabled(false);
                        break;
                    case "B4":
                        B4.setSelected(true);
                        B4.setEnabled(false);
                        break;
                    case "B7":
                        B7.setSelected(true);
                        B7.setEnabled(false);
                        break;
                    case "B8":
                        B8.setSelected(true);
                        B8.setEnabled(false);
                        break;
                    case "B9":
                        B9.setSelected(true);
                        B9.setEnabled(false);
                        break;
                    case "B10":
                        B10.setSelected(true);
                        B10.setEnabled(false);
                        break;
                    // End seat B

                    // Start Seat C
                    case "C1":
                        C1.setSelected(true);
                        C1.setEnabled(false);
                        break;
                    case "C2":
                        C2.setSelected(true);
                        C2.setEnabled(false);
                        break;
                    case "C3":
                        C3.setSelected(true);
                        C3.setEnabled(false);
                        break;
                    case "C4":
                        C4.setSelected(true);
                        C4.setEnabled(false);
                        break;
                    case "C5":
                        C5.setSelected(true);
                        C5.setEnabled(false);
                        break;
                    case "C6":
                        C6.setSelected(true);
                        C6.setEnabled(false);
                        break;
                    case "C7":
                        C7.setSelected(true);
                        C7.setEnabled(false);
                        break;
                    case "C8":
                        C8.setSelected(true);
                        C8.setEnabled(false);
                        break;
                    case "C9":
                        C9.setSelected(true);
                        C9.setEnabled(false);
                        break;
                    case "C10":
                        C10.setSelected(true);
                        C10.setEnabled(false);
                        break;
                    // End Seat C

                    // Start Seat D
                    case "D1":
                        D1.setSelected(true);
                        D1.setEnabled(false);
                        break;
                    case "D2":
                        D2.setSelected(true);
                        D2.setEnabled(false);
                        break;
                    case "D3":
                        D3.setSelected(true);
                        D3.setEnabled(false);
                        break;
                    case "D4":
                        D4.setSelected(true);
                        D4.setEnabled(false);
                        break;
                    case "D5":
                        D5.setSelected(true);
                        D5.setEnabled(false);
                        break;
                    case "D6":
                        D6.setSelected(true);
                        D6.setEnabled(false);
                        break;
                    case "D7":
                        D7.setSelected(true);
                        D7.setEnabled(false);
                        break;
                    case "D8":
                        D8.setSelected(true);
                        D8.setEnabled(false);
                        break;
                    case "D9":
                        D9.setSelected(true);
                        D9.setEnabled(false);
                        break;
                    case "D10":
                        D10.setSelected(true);
                        D10.setEnabled(false);
                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeatViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        id_film.setVisible(false);
        id_studio.setVisible(false);
        judul_film.setVisible(false);
        nama_studio.setVisible(false);
        jam_tayang.setVisible(false);
        tanggal_tayang.setVisible(false);
        total_bayar.setVisible(false);
        jumlah_tiket.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        A1 = new javax.swing.JCheckBox();
        B1 = new javax.swing.JCheckBox();
        C1 = new javax.swing.JCheckBox();
        D1 = new javax.swing.JCheckBox();
        A2 = new javax.swing.JCheckBox();
        B2 = new javax.swing.JCheckBox();
        C2 = new javax.swing.JCheckBox();
        D2 = new javax.swing.JCheckBox();
        A3 = new javax.swing.JCheckBox();
        C3 = new javax.swing.JCheckBox();
        B3 = new javax.swing.JCheckBox();
        D3 = new javax.swing.JCheckBox();
        A4 = new javax.swing.JCheckBox();
        B4 = new javax.swing.JCheckBox();
        C4 = new javax.swing.JCheckBox();
        D4 = new javax.swing.JCheckBox();
        C5 = new javax.swing.JCheckBox();
        D5 = new javax.swing.JCheckBox();
        D6 = new javax.swing.JCheckBox();
        C6 = new javax.swing.JCheckBox();
        A7 = new javax.swing.JCheckBox();
        B7 = new javax.swing.JCheckBox();
        C7 = new javax.swing.JCheckBox();
        D7 = new javax.swing.JCheckBox();
        D8 = new javax.swing.JCheckBox();
        C8 = new javax.swing.JCheckBox();
        B8 = new javax.swing.JCheckBox();
        A8 = new javax.swing.JCheckBox();
        C9 = new javax.swing.JCheckBox();
        B9 = new javax.swing.JCheckBox();
        D9 = new javax.swing.JCheckBox();
        A9 = new javax.swing.JCheckBox();
        A10 = new javax.swing.JCheckBox();
        B10 = new javax.swing.JCheckBox();
        D10 = new javax.swing.JCheckBox();
        C10 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        id_film = new javax.swing.JLabel();
        judul_film = new javax.swing.JLabel();
        id_studio = new javax.swing.JLabel();
        jam_tayang = new javax.swing.JLabel();
        nama_studio = new javax.swing.JLabel();
        tanggal_tayang = new javax.swing.JLabel();
        total_bayar = new javax.swing.JLabel();
        jumlah_tiket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Memilih Tempat Duduk");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Studio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAYAR");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        A1.setText("1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setText("1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        D1.setText("1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        A2.setText("2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        C2.setText("2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        D2.setText("2");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        A3.setText("3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        C3.setText("3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        D3.setText("3");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        A4.setText("4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        C4.setText("4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        D4.setText("4");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        C5.setText("5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        D5.setText("5");
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        D6.setText("6");
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        C6.setText("6");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        A7.setText("7");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        C7.setText("7");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        D7.setText("7");
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        D8.setText("8");
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        C8.setText("8");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        A8.setText("8");
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        C9.setText("9");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        D9.setText("9");
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });

        A9.setText("9");
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        A10.setText("10");
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });

        B10.setText("10");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        D10.setText("10");
        D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D10ActionPerformed(evt);
            }
        });

        C10.setText("10");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        jLabel3.setText("A");

        jLabel4.setText("B");

        jLabel5.setText("C");

        jLabel6.setText("D");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A1)
                            .addComponent(B1)
                            .addComponent(C1)
                            .addComponent(D1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A2)
                            .addComponent(B2)
                            .addComponent(C2)
                            .addComponent(D2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A3)
                            .addComponent(B3)
                            .addComponent(C3)
                            .addComponent(D3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A4)
                            .addComponent(B4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C4)
                                    .addComponent(D4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C5)
                                    .addComponent(D5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C6)
                                    .addComponent(D6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A7)
                            .addComponent(B7)
                            .addComponent(C7)
                            .addComponent(D7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A8)
                            .addComponent(B8)
                            .addComponent(C8)
                            .addComponent(D8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A9)
                            .addComponent(B9)
                            .addComponent(C9)
                            .addComponent(D9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A10)
                            .addComponent(B10)
                            .addComponent(C10)
                            .addComponent(D10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(A1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(B1)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(C1)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(D1)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(A2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(B2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(C2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(D2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(C4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(D4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(C5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(D5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(C6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(D6)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(A7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(B7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(C7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(D7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D10)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id_film.setText("2");

        judul_film.setText("Iron Man");

        id_studio.setText("1");

        jam_tayang.setText("18:30");

        nama_studio.setText("Studio 4");

        tanggal_tayang.setText("01-07-2016 ");

        total_bayar.setText("100000");

        jumlah_tiket.setText("5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id_film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(judul_film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_studio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_studio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jam_tayang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggal_tayang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_bayar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jumlah_tiket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(id_film)
                    .addComponent(judul_film)
                    .addComponent(id_studio)
                    .addComponent(jam_tayang)
                    .addComponent(nama_studio)
                    .addComponent(tanggal_tayang)
                    .addComponent(total_bayar)
                    .addComponent(jumlah_tiket))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            con.setAutoCommit(false);
            String insertIntoTable = "INSERT INTO `tb_det_transaksi` (`id_transaksi`, `no_kursi`) VALUES (?, ?)";
            PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(insertIntoTable);
            DefaultListModel listModel = new DefaultListModel();
            
            // Start Seat A
            if (A1.isSelected() && A1.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A1");
                pstmt.addBatch();
                listModel.addElement("A1");
            }

            if (A2.isSelected() && A2.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A2");
                pstmt.addBatch();
                listModel.addElement("A2");
            }

            if (A3.isSelected() && A3.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A3");
                pstmt.addBatch();
                listModel.addElement("A3");
            }

            if (A4.isSelected() && A4.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A4");
                pstmt.addBatch();
                listModel.addElement("A4");
            }

            if (A7.isSelected() && A7.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A7");
                pstmt.addBatch();
                listModel.addElement("A7");
            }

            if (A8.isSelected() && A8.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A8");
                pstmt.addBatch();
                listModel.addElement("A8");
            }

            if (A9.isSelected() && A9.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A9");
                pstmt.addBatch();
                listModel.addElement("A9");
            }

            if (A10.isSelected() && A10.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "A10");
                pstmt.addBatch();
                listModel.addElement("A10");
            }

            // Start Seat B
            if (B1.isSelected() && B1.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B1");
                pstmt.addBatch();
                listModel.addElement("B1");
            }

            if (B2.isSelected() && B2.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B2");
                pstmt.addBatch();
                listModel.addElement("B2");
            }

            if (B3.isSelected() && B3.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B3");
                pstmt.addBatch();
                listModel.addElement("B3");
            }

            if (B4.isSelected() && B4.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B4");
                pstmt.addBatch();
                listModel.addElement("B4");
            }

            if (B7.isSelected() && B7.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B7");
                pstmt.addBatch();
                listModel.addElement("B7");
            }

            if (B8.isSelected() && B8.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B8");
                pstmt.addBatch();
                listModel.addElement("B8");
            }

            if (B9.isSelected() && B9.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B9");
                pstmt.addBatch();
                listModel.addElement("B9");
            }

            if (B10.isSelected() && B10.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "B10");
                pstmt.addBatch();
                listModel.addElement("B10");
            }

            // Start Seat C
            if (C1.isSelected() && C1.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C1");
                pstmt.addBatch();
                listModel.addElement("C1");
            }

            if (C2.isSelected() && C2.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C2");
                pstmt.addBatch();
                listModel.addElement("C2");
            }

            if (C3.isSelected() && C3.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C3");
                pstmt.addBatch();
                listModel.addElement("C3");
            }

            if (C4.isSelected() && C4.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C4");
                pstmt.addBatch();
                listModel.addElement("C4");
            }

            if (C5.isSelected() && C5.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C5");
                pstmt.addBatch();
                listModel.addElement("C5");
            }

            if (C6.isSelected() && C6.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C6");
                pstmt.addBatch();
                listModel.addElement("C6");
            }

            if (C7.isSelected() && C7.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C7");
                pstmt.addBatch();
                listModel.addElement("C7");
            }

            if (C8.isSelected() && C8.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C8");
                pstmt.addBatch();
                listModel.addElement("C8");
            }

            if (C9.isSelected() && C9.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C9");
                pstmt.addBatch();
                listModel.addElement("C9");
            }

            if (C10.isSelected() && C10.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "C10");
                pstmt.addBatch();
                listModel.addElement("C10");
            }

            // Start Seat D
            if (D1.isSelected() && D1.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D1");
                pstmt.addBatch();
                listModel.addElement("D1");
            }

            if (D2.isSelected() && D2.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D2");
                pstmt.addBatch();
                listModel.addElement("D2");
            }

            if (D3.isSelected() && D3.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D3");
                pstmt.addBatch();
                listModel.addElement("D3");
            }

            if (D4.isSelected() && D4.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D4");
                pstmt.addBatch();
                listModel.addElement("D4");
            }

            if (D5.isSelected() && D5.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D5");
                pstmt.addBatch();
                listModel.addElement("D5");
            }

            if (D6.isSelected() && D6.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D6");
                pstmt.addBatch();
                listModel.addElement("D6");
            }

            if (D7.isSelected() && D7.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D7");
                pstmt.addBatch();
                listModel.addElement("D7");
            }

            if (D8.isSelected() && D8.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D8");
                pstmt.addBatch();
                listModel.addElement("D8");
            }

            if (D9.isSelected() && D9.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D9");
                pstmt.addBatch();
                listModel.addElement("D9");
            }

            if (D10.isSelected() && D10.isEnabled()) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "D10");
                pstmt.addBatch();
                listModel.addElement("D10");
            }

            int[] updateCounts = pstmt.executeBatch();
            con.commit();
            con.setAutoCommit(true);

            JOptionPane.showMessageDialog(null, "Pilihan tempat duduk berhasil disimpan!");

            // Passing value to DetailTransaksiViewController
            DetailTransaksiViewController DetailTransaksiVC = new DetailTransaksiViewController();
            DetailTransaksiVC.judulFilm.setText(this.judul_film.getText());
            DetailTransaksiVC.namaStudio.setText(this.nama_studio.getText());
            DetailTransaksiVC.tanggalTayang.setText(this.tanggal_tayang.getText());
            DetailTransaksiVC.jamTayang.setText(this.jam_tayang.getText());
            DetailTransaksiVC.jumlahTiket.setText(this.jumlah_tiket.getText());
            DetailTransaksiVC.totalBayar.setText(this.total_bayar.getText());
            DetailTransaksiVC.detailKursi.setModel(listModel);
            DetailTransaksiVC.setVisible(true);
            this.dispose();

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Pilihan tempat duduk berhasil gagal disimpan!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C10ActionPerformed

    private void D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D10ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B10ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A10ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A9ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D9ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C9ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A8ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D8ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D7ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A7ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D6ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D5ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A4ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed

    }//GEN-LAST:event_A1ActionPerformed

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
            java.util.logging.Logger.getLogger(SeatViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SeatViewController().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SeatViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox A1;
    private javax.swing.JCheckBox A10;
    private javax.swing.JCheckBox A2;
    private javax.swing.JCheckBox A3;
    private javax.swing.JCheckBox A4;
    private javax.swing.JCheckBox A7;
    private javax.swing.JCheckBox A8;
    private javax.swing.JCheckBox A9;
    private javax.swing.JCheckBox B1;
    private javax.swing.JCheckBox B10;
    private javax.swing.JCheckBox B2;
    private javax.swing.JCheckBox B3;
    private javax.swing.JCheckBox B4;
    private javax.swing.JCheckBox B7;
    private javax.swing.JCheckBox B8;
    private javax.swing.JCheckBox B9;
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C10;
    private javax.swing.JCheckBox C2;
    private javax.swing.JCheckBox C3;
    private javax.swing.JCheckBox C4;
    private javax.swing.JCheckBox C5;
    private javax.swing.JCheckBox C6;
    private javax.swing.JCheckBox C7;
    private javax.swing.JCheckBox C8;
    private javax.swing.JCheckBox C9;
    private javax.swing.JCheckBox D1;
    private javax.swing.JCheckBox D10;
    private javax.swing.JCheckBox D2;
    private javax.swing.JCheckBox D3;
    private javax.swing.JCheckBox D4;
    private javax.swing.JCheckBox D5;
    private javax.swing.JCheckBox D6;
    private javax.swing.JCheckBox D7;
    private javax.swing.JCheckBox D8;
    private javax.swing.JCheckBox D9;
    private javax.swing.JLabel id_film;
    private javax.swing.JLabel id_studio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel jam_tayang;
    public javax.swing.JLabel judul_film;
    public javax.swing.JLabel jumlah_tiket;
    public javax.swing.JLabel nama_studio;
    public javax.swing.JLabel tanggal_tayang;
    public javax.swing.JLabel total_bayar;
    // End of variables declaration//GEN-END:variables
}
