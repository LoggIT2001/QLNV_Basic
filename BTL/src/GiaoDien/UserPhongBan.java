/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaoDien;

import Dao.PhongBanDao;
import Model.PhongBan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tuan
 */
public class UserPhongBan extends javax.swing.JPanel {

    /**
     * Creates new form TimKiemPhongBan
     */
    private ArrayList<PhongBan> PBList;
    DefaultTableModel phongbanDefaultTableModel;

    public UserPhongBan() {
        initComponents();
        PhongBanDao pbd = new PhongBanDao();
        PBList = pbd.DSPhongBan();
        phongbanDefaultTableModel = (DefaultTableModel) tblphongban.getModel();
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
        tblphongban = new javax.swing.JTable();
        timkiempbBTN = new javax.swing.JButton();
        timkiemCB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 204));

        tblphongban.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblphongban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng ban", "Tên phòng ban", "Ðịa chỉ phòng ban  ", "Số điện thoại phòng ban "
            }
        ));
        tblphongban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblphongbanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblphongban);

        timkiempbBTN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timkiempbBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_search.png"))); // NOI18N
        timkiempbBTN.setText(" Tìm kiếm ");
        timkiempbBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiempbBTNMouseClicked(evt);
            }
        });
        timkiempbBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiempbBTNActionPerformed(evt);
            }
        });

        timkiemCB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timkiemCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo mã phòng ban", "Tìm kiếm theo địa chỉ", "Tìm kiếm theo tên phòng ban" }));
        timkiemCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiemCBMouseClicked(evt);
            }
        });
        timkiemCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(timkiempbBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(timkiemCB, 0, 362, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timkiempbBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timkiemCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblphongbanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblphongbanMouseClicked

    }//GEN-LAST:event_tblphongbanMouseClicked

    private void timkiempbBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiempbBTNMouseClicked
        PhongBanDao pbd = new PhongBanDao();
        String choice = timkiemCB.getItemAt(timkiemCB.getSelectedIndex());
        if (choice.equals("Tìm kiếm theo mã phòng ban")) {
            String input = JOptionPane.showInputDialog(null, "Nhập mã phòng ban ");
            if (input != null && input.length() > 0) {
                if (pbd.timKiemIdPhongBan(input) != null) {
                    phongbanDefaultTableModel.setRowCount(0);
                    phongbanDefaultTableModel.addRow(pbd.timKiemIdPhongBan(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Mã phòng ban không tồn tại ! ");
                }
            }
        } else if (choice.equals("Tìm kiếm theo địa chỉ")) {
            String input = JOptionPane.showInputDialog(this, "Nhập địa chỉ cần tìm");

            if (input != null && input.length() > 0) {
                if (pbd.searchByAddress(input).size() >= 0) {
                    phongbanDefaultTableModel.setRowCount(0);
                    pbd.searchByAddress(input).forEach(s -> phongbanDefaultTableModel.addRow(s.toObjects()));
                    JOptionPane.showMessageDialog(null, "Tìm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Địa chỉ không tồn tại !");
                }
            }
        } else if (choice.equals("Tìm kiếm theo tên phòng ban")) {
            String input = JOptionPane.showInputDialog(null, "Nhập tên phòng ban ");
            if (input != null && input.length() > 0) {
                if (pbd.timKiemTenPhongBan(input) != null) {
                    phongbanDefaultTableModel.setRowCount(0);
                    phongbanDefaultTableModel.addRow(pbd.timKiemTenPhongBan(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Tên phòng ban không tồn tại  ! ");
                }
            }
        }
    }//GEN-LAST:event_timkiempbBTNMouseClicked

    private void timkiempbBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiempbBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiempbBTNActionPerformed

    private void timkiemCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemCBMouseClicked

    }//GEN-LAST:event_timkiemCBMouseClicked

    private void timkiemCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiemCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblphongban;
    private javax.swing.JComboBox<String> timkiemCB;
    private javax.swing.JButton timkiempbBTN;
    // End of variables declaration//GEN-END:variables
}
