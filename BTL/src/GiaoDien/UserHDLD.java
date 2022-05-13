/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;
import Dao.HDLDDao;
import Model.HDLD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserHDLD extends javax.swing.JPanel {
    private ArrayList<HDLD> HDLDlist;
    private DefaultTableModel model; 
    public UserHDLD() {
        initComponents();
        HDLDlist = new HDLDDao().getListQuanLyHDLD();
        model = (DefaultTableModel) tableQuanLyHDLD.getModel();
        showQuanLyHDLD();         
    }
    public void showQuanLyHDLD() {
        model = (DefaultTableModel)tableQuanLyHDLD.getModel();
        Object[] row = new Object[3];
        for(int i = 0; i < HDLDlist.size(); i++) {
            row[0] = HDLDlist.get(i).getMaHD();
            row[1] = HDLDlist.get(i).getLoaiHD();
            row[2] = HDLDlist.get(i).getTimeHD();

            model.addRow(row);
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyHDLD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        timkiemCB = new javax.swing.JComboBox<>();
        timkiemHDclick = new javax.swing.JButton();
        danhSachHDLD = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tableQuanLyHDLD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableQuanLyHDLD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hợp Đồng", "Loại Hợp Đồng", "Thời Hạn Hợp Đồng"
            }
        ));
        tableQuanLyHDLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQuanLyHDLDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQuanLyHDLD);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        timkiemCB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timkiemCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo mã HĐ", "Tìm kiếm theo Loại HĐ", "Tìm kiếm theo Thời hạn HĐ" }));
        timkiemCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemCBActionPerformed(evt);
            }
        });

        timkiemHDclick.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timkiemHDclick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_search.png"))); // NOI18N
        timkiemHDclick.setText("Tìm Kiếm");
        timkiemHDclick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiemHDclickMouseClicked(evt);
            }
        });
        timkiemHDclick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemHDclickActionPerformed(evt);
            }
        });

        danhSachHDLD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        danhSachHDLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-view-calendar-list-icon.png"))); // NOI18N
        danhSachHDLD.setText("Hiển thị danh sách");
        danhSachHDLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                danhSachHDLDMouseClicked(evt);
            }
        });
        danhSachHDLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danhSachHDLDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(danhSachHDLD, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timkiemHDclick, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timkiemCB, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(danhSachHDLD)
                .addGap(18, 18, 18)
                .addComponent(timkiemCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timkiemHDclick)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 416, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableQuanLyHDLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQuanLyHDLDMouseClicked
        
    }//GEN-LAST:event_tableQuanLyHDLDMouseClicked

    private void timkiemCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemCBActionPerformed

    }//GEN-LAST:event_timkiemCBActionPerformed

    private void timkiemHDclickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemHDclickMouseClicked
        HDLDDao hdd = new HDLDDao();
        String choice = timkiemCB.getItemAt(timkiemCB.getSelectedIndex());
        if (choice.equals("Tìm kiếm theo mã HĐ")) {
            String input = JOptionPane.showInputDialog(null, "Nhập mã hợp đồng ");
            if (input != null && input.length() > 0) {
                if (hdd.timKiemIdHDLD(input) != null) {
                    model.setRowCount(0);
                    model.addRow(hdd.timKiemIdHDLD(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm kiếm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Mã HĐ không tồn tại ! ");
                }
            }
        } else if (choice.equals("Tìm kiếm theo Loại HĐ")) {
            String input = JOptionPane.showInputDialog(this, "Nhập Loại HĐ cần tìm");

            if (input != null && input.length() > 0) {
                if (hdd.timKiemLoaiHDLD(input) != null) {
                    model.setRowCount(0);
                    model.addRow(hdd.timKiemLoaiHDLD(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm kiếm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Loại HĐ không tồn tại ! ");
                }
            }
        } else if (choice.equals("Tìm kiếm theo Thời hạn HĐ")) {
            String input = JOptionPane.showInputDialog(null, "Nhập Thời hạn HĐ ");
            if (input != null && input.length() > 0) {
                if (hdd.timKiemTimeHDLD(input) != null) {
                    model.setRowCount(0);
                    model.addRow(hdd.timKiemTimeHDLD(input).toObjects());
                    JOptionPane.showMessageDialog(null, "Tìm kiếm thành công ! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Thời hạn HĐ không tồn tại ! ");
                }
            }
        }
    }//GEN-LAST:event_timkiemHDclickMouseClicked

    private void timkiemHDclickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemHDclickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiemHDclickActionPerformed

    private void danhSachHDLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_danhSachHDLDMouseClicked
        model.setRowCount(0);
        HDLDlist.forEach(s -> model.addRow(s.toObjects()));
    }//GEN-LAST:event_danhSachHDLDMouseClicked

    private void danhSachHDLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danhSachHDLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_danhSachHDLDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton danhSachHDLD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableQuanLyHDLD;
    private javax.swing.JComboBox<String> timkiemCB;
    private javax.swing.JButton timkiemHDclick;
    // End of variables declaration//GEN-END:variables
}
