/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atmojo
 */
public class ReportViewController extends javax.swing.JFrame {

    private Connection conn;
    private ResultSet res;
    private Statement stat;

    /**
     * Creates new form ReportViewController
     */
    public ReportViewController() {
        initComponents();
        this.setTitle("xixixi Bioskop");
        this.setLocationRelativeTo(null);
        koneksi();
        thisDayReport();
        this.setTitle("xixixi Bioskop");
    }

    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_bioskop", "root", "");
            stat = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void thisDayReport() {
        DefaultTableModel viewField = new DefaultTableModel();
        viewField.addColumn("Judul Film");
        viewField.addColumn("Tanggal Main");
        viewField.addColumn("Jumlah Transaksi");
        viewField.addColumn("Total Income");
        try {
            res = stat.executeQuery("select tf.judul_film as JudulFilm, tj.date as TanggalMain, count(tdt.id_transaksi) as JumlahTransaksi, sum(harga) as TotalIncome\n"
                    + "from tb_det_transaksi tdt, tb_transaksi tt, tb_jadwal tj, tb_film tf\n"
                    + "where tdt.id_transaksi=tt.id_transaksi and\n"
                    + "tt.id_jadwal=tj.id_jadwal and\n"
                    + "tf.id_film=tj.id_film and\n"
                    + "tj.date=curdate()\n"
                    + "group by tf.judul_film, tj.date \n"
                    + "order by 3 desc;");
            while (res.next()) {
                viewField.addRow(new Object[]{res.getString("JudulFilm"), res.getString("TanggalMain"), res.getString("JumlahTransaksi"), res.getString("TotalIncome")});

            }
            jTable1.setModel(viewField);
        } catch (Exception e) {

        }
    }

    private void dailyReport() {
        DefaultTableModel viewField = new DefaultTableModel();
        viewField.addColumn("Judul Film");
        viewField.addColumn("Tanggal Main");
        viewField.addColumn("Jumlah Transaksi");
        viewField.addColumn("Total Income");
        try {
            res = stat.executeQuery("select tf.judul_film as JudulFilm, tj.date as TanggalMain, count(tdt.id_transaksi) as JumlahTransaksi, sum(harga) as TotalIncome\n"
                    + "from tb_det_transaksi tdt, tb_transaksi tt, tb_jadwal tj, tb_film tf\n"
                    + "where tdt.id_transaksi=tt.id_transaksi and\n"
                    + "tt.id_jadwal=tj.id_jadwal and\n"
                    + "tf.id_film=tj.id_film and\n"
                    + "month(tj.date)=month(curdate())\n"
                    + "group by tf.judul_film, tj.date \n"
                    + "order by 3 desc;");
            while (res.next()) {
                viewField.addRow(new Object[]{res.getString("JudulFilm"), res.getString("TanggalMain"), res.getString("JumlahTransaksi"), res.getString("TotalIncome")});

            }
            jTable1.setModel(viewField);
        } catch (Exception e) {

        }
    }

    private void monthlyReport() {
        DefaultTableModel viewField = new DefaultTableModel();
        viewField.addColumn("Judul Film");
        viewField.addColumn("Bulan Main");
        viewField.addColumn("Jumlah Transaksi");
        viewField.addColumn("Total Income");
        try {
            res = stat.executeQuery("select tf.judul_film as JudulFilm, \n"
                    + "case month(tj.date)\n"
                    + "when 1 then 'Januari'\n"
                    + "when 2 then 'Februari' \n"
                    + "when 3 then 'Maret'\n"
                    + "when 4 then 'April'\n"
                    + "when 5 then 'Mei' \n"
                    + "when 6 then 'Juni'\n"
                    + "when 7 then 'July'\n"
                    + "when 8 then 'Agustus'\n"
                    + "when 9 then 'Septermber'\n"
                    + "when 10 then 'Oktober' \n"
                    + "when 11 then 'November'\n"
                    + "when 12 then 'Desember'\n"
                    + "else 'Month Not Valid'\n"
                    + "end as BulanMain\n"
                    + ", count(tdt.id_transaksi) as JumlahTransaksi, sum(harga) as TotalIncome\n"
                    + "from tb_det_transaksi tdt, tb_transaksi tt, tb_jadwal tj, tb_film tf\n"
                    + "where tdt.id_transaksi=tt.id_transaksi and\n"
                    + "tt.id_jadwal=tj.id_jadwal and\n"
                    + "tf.id_film=tj.id_film \n"
                    + "group by tf.judul_film, month(tj.date) \n"
                    + "order by 3 desc;");
            while (res.next()) {
                viewField.addRow(new Object[]{res.getString("JudulFilm"), res.getString("BulanMain"), res.getString("JumlahTransaksi"), res.getString("TotalIncome")});

            }
            jTable1.setModel(viewField);
        } catch (Exception e) {

        }
    }

    private void yearlyReport() {
        DefaultTableModel viewField = new DefaultTableModel();
        viewField.addColumn("Judul Film");
        viewField.addColumn("Tahun Main");
        viewField.addColumn("Jumlah Transaksi");
        viewField.addColumn("Total Income");
        try {
            res = stat.executeQuery("select tf.judul_film as JudulFilm, year(tj.date) as TahunMain, count(tdt.id_transaksi) as JumlahTransaksi, sum(harga) as TotalIncome\n"
                    + "from tb_det_transaksi tdt, tb_transaksi tt, tb_jadwal tj, tb_film tf\n"
                    + "where tdt.id_transaksi=tt.id_transaksi and\n"
                    + "tt.id_jadwal=tj.id_jadwal and\n"
                    + "tf.id_film=tj.id_film \n"
                    + "group by tf.judul_film, year(tj.date)\n"
                    + "order by 3 desc;");
            while (res.next()) {
                viewField.addRow(new Object[]{res.getString("JudulFilm"), res.getString("TahunMain"), res.getString("JumlahTransaksi"), res.getString("TotalIncome")});

            }
            jTable1.setModel(viewField);
        } catch (Exception e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Daily Report (This Month)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Monthly Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Yearly Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Today Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Report Transaksi");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addComponent(jButton3)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        koneksi();
        dailyReport();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        koneksi();
        monthlyReport();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        koneksi();
        yearlyReport();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        koneksi();
        thisDayReport();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportViewController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
