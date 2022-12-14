/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.bookingDAO;
import Model.booking;
import Model.detailBooking;
import Model.room;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author T450s
 */
public class doBooking extends javax.swing.JFrame {

    /**
     * Creates new form doBooking
     */
    public doBooking() {
        initComponents();
        
        jTextField12.setEditable(false);
        jTextField9.setEditable(false);
        jTextField15.setEditable(false);
        jTextField16.setEditable(false);
        autoDate();
        autoTime();
        jTextField15.setText("0");
        jTextField9.setText("0");
    }
    
    private void autoDate() {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jTextField12.setText(s.format(d));
    }

    private void autoTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                jTextField16.setText(s.format(d));
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Card Type:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 165, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Card Number:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 209, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Check Out Date:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 365, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Expiration date:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 253, -1, -1));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 121, 230, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Master Card", "Visa" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 165, 230, -1));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 209, 230, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Booking Time:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 36, -1, -1));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 33, 117, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135791105000L));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 314, 208, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1218, 19, 40, 40));

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 365, 208, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/booking.png"))); // NOI18N
        jLabel1.setText("BOOKING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 113, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("BOOKING");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 658, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 110, 230, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nationality:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 157, -1, -1));

        jDateChooser3.setDateFormatString("yyyy-MM-dd");
        jDateChooser3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDateChooser3.setMaxSelectableDate(new java.util.Date(253370743277000L));
        jDateChooser3.setMinSelectableDate(new java.util.Date(-62135791123000L));
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 253, 230, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 658, 88, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Booking Date:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 36, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 154, 230, -1));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 33, 142, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mobile Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 201, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "People Per Rom", "Price Per Day"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 405, 652, 294));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 198, 230, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 242, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 332, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 242, 230, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("How do you want to pay?");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 83, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Cardholder's name:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 124, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Check In Date:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 316, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Price Per Day"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 157, 360, 186));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 89, 39, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("rooms for US$");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 92, -1, -1));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1109, 89, 99, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Guess Name", "Guess Email"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 405, 540, 218));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Select Rooms:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 126, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Guesses Infomation:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 370, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new doBooking().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String roomNo = model.getValueAt(index, 0).toString();
        String pricePerDay = model.getValueAt(index, 3).toString(); 
        
        int sum = Integer.parseInt(jTextField15.getText());
        int id = Integer.parseInt(jTextField9.getText());
        DefaultTableModel model1 = (DefaultTableModel)jTable2.getModel();
        model1.addRow(new Object[]{roomNo,pricePerDay});
        sum = sum + Integer.parseInt(pricePerDay);
        jTextField15.setText(Integer.toString(sum));
        jTextField9.setText(Integer.toString(id + 1));
        
        DefaultTableModel model2 = (DefaultTableModel)jTable3.getModel();
        model2.addRow(new Object[]{roomNo,"",""});
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        java.util.Date utilStartDate = jDateChooser1.getDate();
        java.sql.Date checkinDate = new java.sql.Date(utilStartDate.getTime());
        java.util.Date utilStartDate1 = jDateChooser2.getDate();
        java.sql.Date checkoutDate = new java.sql.Date(utilStartDate1.getTime());
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        ArrayList<room> listRoom = new ArrayList<>();
        bookingDAO bd = new bookingDAO();
        listRoom = bd.checkRoomNotBooked(checkinDate, checkoutDate);
        
        ArrayList<room> realListRoom = new ArrayList<>();
        for(int i = 0; i < listRoom.size() - 1; i++)
        {
            int n = 0;
            for(int j = i; j < listRoom.size(); j++)
            {
		if(listRoom.get(i).getRoomNo().equals(listRoom.get(j).getRoomNo()))
		{
                    n++;
		}
            }
            int count = bd.getCount(listRoom.get(i).getRoomNo());
            if(n == count)
            {
		realListRoom.add(listRoom.get(i));
            } 
        }
        for(int i = 0; i < realListRoom.size(); i++)
        {
            model.addRow(new Object[]{realListRoom.get(i).getRoomNo(), realListRoom.get(i).getRoomType(), realListRoom.get(i).getPeoplePerRoom(), realListRoom.get(i).getPricePerDay()});
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TableModel model = jTable3.getModel();
        booking b = new booking();
        detailBooking db = new detailBooking();
        String bookingDate = jTextField12.getText();
        String bookingTime = jTextField16.getText();
        String name = jTextField1.getText();
        String nationality = jTextField2.getText();
        String mobileNumber = jTextField4.getText();
        String email = jTextField5.getText();
        java.util.Date utilStartDate = jDateChooser1.getDate();
        java.sql.Date checkinDate = new java.sql.Date(utilStartDate.getTime());
        java.util.Date utilStartDate1 = jDateChooser2.getDate();
        java.sql.Date checkoutDate = new java.sql.Date(utilStartDate1.getTime());
        
        String cardholderName = jTextField13.getText();
        String cardType = (String)jComboBox3.getSelectedItem();
        String cardNumber = jTextField14.getText();

        java.util.Date utilStartDate2 = jDateChooser3.getDate();
        java.sql.Date expirationDate = new java.sql.Date(utilStartDate2.getTime());
        
        if(name.equals("") || cardholderName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Every Field is Required");
        }
        else
        {
            for(int i = 0; i < model.getRowCount(); i++)
            {
                b.setName(name);
                b.setEmail(email);
                b.setNationality(nationality);
                b.setMobilePhone(mobileNumber);
                b.setBookingDate(LocalDate.parse(bookingDate));
                b.setBookingTime(bookingTime);
                b.setGuestName(model.getValueAt(i, 1).toString());
                b.setGuestEmail(model.getValueAt(i, 2).toString());
                b.setCardholderName(cardholderName);
                b.setCardType(cardType);
                b.setCardNumber(cardNumber);
                b.setExpirationDate(expirationDate.toLocalDate());
                db.setRoomNo(model.getValueAt(i, 0).toString());
                db.setCheckinDate(checkinDate.toLocalDate());
                db.setCheckoutDate(checkoutDate.toLocalDate());

                bookingDAO bd = new bookingDAO();
                if(bd.addBooking(b, db))
                {
                    if(i == model.getRowCount() - 1)
                    {
                        JOptionPane.showMessageDialog(this, "Booking Successfully!");
                        setVisible(false);
                        new doBooking().setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index = jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        DefaultTableModel model1 = (DefaultTableModel)jTable3.getModel();
        int sum = Integer.parseInt(jTextField15.getText());
        int id = Integer.parseInt(jTextField9.getText());
        sum = sum - Integer.parseInt(model.getValueAt(index, 1).toString());
        jTextField15.setText(Integer.toString(sum));
        jTextField9.setText(Integer.toString(id - 1));
        model.removeRow(index);
        model1.removeRow(index);
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(doBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
