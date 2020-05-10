package proyecto_final_lander;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class userform extends javax.swing.JFrame {
    
    private static Connection con = null;
    private static final String SIMBOLO = "$";
    ResultSet rs;
    ResultSet trs;
    
    public userform() {
        initComponents();
        retrieveMainBoard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_id_label = new javax.swing.JLabel();
        next_user_button = new javax.swing.JButton();
        previous_user_button = new javax.swing.JButton();
        delete_trade1_button = new javax.swing.JButton();
        user_name_label = new javax.swing.JLabel();
        user_balance_label = new javax.swing.JLabel();
        user_tier_label = new javax.swing.JLabel();
        user_name_textfield = new javax.swing.JTextField();
        user_balance_textfield = new javax.swing.JTextField();
        user_tier_textfield = new javax.swing.JTextField();
        user_id_textfield = new javax.swing.JTextField();
        trade_id_1_textfield = new javax.swing.JTextField();
        trade_id_label = new javax.swing.JLabel();
        amount_label = new javax.swing.JLabel();
        open_price_label = new javax.swing.JLabel();
        close_price_label = new javax.swing.JLabel();
        first_item_label = new javax.swing.JLabel();
        second_item_label = new javax.swing.JLabel();
        third_item_label = new javax.swing.JLabel();
        amount_1_textfield = new javax.swing.JTextField();
        open_price_1_textfield = new javax.swing.JTextField();
        amount_2_textfield = new javax.swing.JTextField();
        open_price_2_textfield = new javax.swing.JTextField();
        close_price_2_textfield = new javax.swing.JTextField();
        amount_3_textfield = new javax.swing.JTextField();
        open_price_3_textfield = new javax.swing.JTextField();
        close_price_3_textfield = new javax.swing.JTextField();
        trade_id_2_textfield = new javax.swing.JTextField();
        trade_id_3_textfield = new javax.swing.JTextField();
        open_price_add_textfield = new javax.swing.JTextField();
        close_price_add_textfield = new javax.swing.JTextField();
        amount_add_textfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        update_trade2_button = new javax.swing.JButton();
        update_trade1_button = new javax.swing.JButton();
        delete_trade2_button = new javax.swing.JButton();
        update_trade3_button = new javax.swing.JButton();
        delete_trade3_button = new javax.swing.JButton();
        add_amount_label = new javax.swing.JLabel();
        add_open_price_label = new javax.swing.JLabel();
        add_close_price_label = new javax.swing.JLabel();
        close_price_1_textfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user_id_label.setText("User ID:");

        next_user_button.setText("Next user");
        next_user_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next_user_buttonMouseClicked(evt);
            }
        });
        next_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_user_buttonActionPerformed(evt);
            }
        });

        previous_user_button.setText("Previous user");
        previous_user_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previous_user_buttonMouseClicked(evt);
            }
        });

        delete_trade1_button.setText("Delete trade");
        delete_trade1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_trade1_buttonMouseClicked(evt);
            }
        });

        user_name_label.setText("User Name:");

        user_balance_label.setText("User balance:");

        user_tier_label.setText("User Tier:");

        user_name_textfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_name_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        user_balance_textfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_balance_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_balance_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_balance_textfieldActionPerformed(evt);
            }
        });

        user_tier_textfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_tier_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        user_id_textfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_id_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_id_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_id_textfieldActionPerformed(evt);
            }
        });

        trade_id_1_textfield.setEditable(false);
        trade_id_1_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trade_id_label.setText("Trade ID");

        amount_label.setText("Amount");

        open_price_label.setText("Open Price");

        close_price_label.setText("Close Price");

        first_item_label.setText("1.");

        second_item_label.setText("2.");

        third_item_label.setText("3.");

        amount_1_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount_1_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_1_textfieldActionPerformed(evt);
            }
        });

        open_price_1_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        amount_2_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount_2_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_2_textfieldActionPerformed(evt);
            }
        });

        open_price_2_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        close_price_2_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        amount_3_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount_3_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_3_textfieldActionPerformed(evt);
            }
        });

        open_price_3_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        close_price_3_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trade_id_2_textfield.setEditable(false);
        trade_id_2_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trade_id_3_textfield.setEditable(false);
        trade_id_3_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        open_price_add_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        close_price_add_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        amount_add_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("Add trade");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        update_trade2_button.setText("Update trade");
        update_trade2_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_trade2_buttonMouseClicked(evt);
            }
        });

        update_trade1_button.setText("Update trade");
        update_trade1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_trade1_buttonMouseClicked(evt);
            }
        });

        delete_trade2_button.setText("Delete trade");
        delete_trade2_button.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                delete_trade2_buttonMouseDragged(evt);
            }
        });
        delete_trade2_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_trade2_buttonMouseClicked(evt);
            }
        });

        update_trade3_button.setText("Update trade");
        update_trade3_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_trade3_buttonMouseClicked(evt);
            }
        });

        delete_trade3_button.setText("Delete trade");
        delete_trade3_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_trade3_buttonMouseClicked(evt);
            }
        });

        add_amount_label.setText("Amount");

        add_open_price_label.setText("Open Price");

        add_close_price_label.setText("Close Price");

        close_price_1_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(amount_label))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(previous_user_button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(second_item_label)
                                            .addComponent(first_item_label)
                                            .addComponent(third_item_label))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(trade_id_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trade_id_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trade_id_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trade_id_label))
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amount_add_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amount_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amount_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(user_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_id_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(amount_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(add_amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(open_price_1_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(open_price_2_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(open_price_3_textfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(open_price_label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(open_price_add_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(add_open_price_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(close_price_2_textfield)
                                    .addComponent(close_price_1_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(close_price_3_textfield))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update_trade2_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_trade1_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_trade3_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete_trade1_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete_trade2_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete_trade3_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(close_price_add_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(add_close_price_label)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(user_name_label)
                                .addGap(58, 58, 58)
                                .addComponent(user_tier_label))
                            .addComponent(close_price_label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(user_name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(user_tier_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(user_balance_label, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addGap(162, 162, 162))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(user_balance_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(next_user_button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {trade_id_1_textfield, trade_id_2_textfield, trade_id_3_textfield});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name_label)
                            .addComponent(user_tier_label)
                            .addComponent(user_balance_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(next_user_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(user_balance_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user_tier_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user_name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(previous_user_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user_id_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user_id_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_price_label)
                    .addComponent(open_price_label)
                    .addComponent(amount_label)
                    .addComponent(trade_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_price_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(open_price_1_textfield)
                    .addComponent(amount_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trade_id_1_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first_item_label)
                    .addComponent(delete_trade1_button)
                    .addComponent(update_trade1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_trade2_button)
                    .addComponent(update_trade2_button)
                    .addComponent(close_price_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(open_price_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trade_id_2_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second_item_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_trade3_button)
                    .addComponent(update_trade3_button)
                    .addComponent(close_price_3_textfield)
                    .addComponent(open_price_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trade_id_3_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(third_item_label))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_close_price_label)
                    .addComponent(add_open_price_label)
                    .addComponent(add_amount_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount_add_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(open_price_add_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_price_add_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_id_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_id_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_id_textfieldActionPerformed

    private void amount_1_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_1_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_1_textfieldActionPerformed

    private void amount_2_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_2_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_2_textfieldActionPerformed

    private void amount_3_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_3_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_3_textfieldActionPerformed

    private void next_user_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_user_buttonMouseClicked
        next_user();
    }//GEN-LAST:event_next_user_buttonMouseClicked

    private void previous_user_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous_user_buttonMouseClicked
        previous_user();
    }//GEN-LAST:event_previous_user_buttonMouseClicked

    private void next_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_user_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next_user_buttonActionPerformed

    private void user_balance_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_balance_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_balance_textfieldActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        insertData();
    }//GEN-LAST:event_jButton1MouseClicked

    private void delete_trade1_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_trade1_buttonMouseClicked
        deleteTrade(1);
    }//GEN-LAST:event_delete_trade1_buttonMouseClicked

    private void delete_trade2_buttonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_trade2_buttonMouseDragged
        
    }//GEN-LAST:event_delete_trade2_buttonMouseDragged

    private void delete_trade3_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_trade3_buttonMouseClicked
        deleteTrade(3);
    }//GEN-LAST:event_delete_trade3_buttonMouseClicked

    private void delete_trade2_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_trade2_buttonMouseClicked
        deleteTrade(2);
    }//GEN-LAST:event_delete_trade2_buttonMouseClicked

    private void update_trade1_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_trade1_buttonMouseClicked
        updateTrade(1);
    }//GEN-LAST:event_update_trade1_buttonMouseClicked

    private void update_trade2_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_trade2_buttonMouseClicked
        updateTrade(2);
    }//GEN-LAST:event_update_trade2_buttonMouseClicked

    private void update_trade3_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_trade3_buttonMouseClicked
        updateTrade(3);
    }//GEN-LAST:event_update_trade3_buttonMouseClicked
    
    // Intenta conectarse a la base de datos.
    private Connection tryConnection() throws SQLException{
        String address = "localhost";
            int port = 3306;
            String dataBase = "crypto_market";
            String user = "root";
            String pass = "VacaPollo!23$";
            
            con = DriverManager.getConnection(
                    "jdbc:mysql://"
                    + address
                    + ":" + port
                    + "/" + dataBase
                    + "?&user=" + user
                    + "&password="+ pass
                    + "&useLegacyDatetimeCode=false&serverTimezone=UTC");
            return con;
    }
   
    // Obtiene los datos de la base de datos y rellena el formulario.
    private void retrieveMainBoard() {
        
        String sql_query = "SELECT * FROM crypto_market.users_table;";
        try {
            Statement statement = tryConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = statement.executeQuery(sql_query);
            JOptionPane.showMessageDialog(null, "La base de datos se ha cargado satisfactoriamente", "DATABASE OPEN", JOptionPane.WARNING_MESSAGE);
            next_user();
        } catch (SQLException ex) {
            Logger.getLogger(userform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Obtiene los datos de los trades de usuario que se ve en el formulario.
    private void retrieveTradeInfo(){
        
        int user_id = Integer.parseInt(user_id_textfield.getText());
        String sql_query = "select user_name, trade_id, amount, op_price, clos_price\n" +
                            "from crypto_market.users_table\n" +
                            "inner join crypto_market.trades_table\n" +
                            "on crypto_market.users_table.user_id = crypto_market.trades_table.trade_user_id\n" +
                            "where user_id = '" + user_id + "' " +
                            "order by trade_id desc;";
        try {
           Statement statementTrade = tryConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
           trs = statementTrade.executeQuery(sql_query);   
        } catch (SQLException ex) {
            Logger.getLogger(userform.class.getName()).log(Level.SEVERE, null, ex);
        }
        fillTradesInfo();
    }
    
    // Rellena los datos del usuario en el formulario.
    private void fillUserData() {
        
        try{
            user_id_textfield.setText(String.valueOf(rs.getInt("user_id")));
            user_name_textfield.setText(rs.getString("user_name"));
            user_balance_textfield.setText(String.valueOf(rs.getDouble("balance")) + SIMBOLO);
            user_tier_textfield.setText(String.valueOf(rs.getInt("tier")));

        } catch (SQLException ex) {
            Logger.getLogger(userform.class.getName()).log(Level.SEVERE, null, ex);
        }
        retrieveTradeInfo();
    }
        
    // Rellena la información de los trades del usuario concreto en el formulario.
    private void fillTradesInfo(){
        try{
            if (trs.next() == true){
                trade_id_1_textfield.setText(String.valueOf(trs.getInt("trade_id")));
                amount_1_textfield.setText(String.valueOf(trs.getDouble("amount")) + SIMBOLO);
                open_price_1_textfield.setText(String.valueOf(trs.getDouble("op_price")) + SIMBOLO);
                close_price_1_textfield.setText(String.valueOf(trs.getDouble("clos_price")) + SIMBOLO);
            } else {
                trade_id_1_textfield.setText("--");
                amount_1_textfield.setText("--");
                open_price_1_textfield.setText("--");
                close_price_1_textfield.setText("--");
            }
            
            if (trs.next() == true){
                trade_id_2_textfield.setText(String.valueOf(trs.getInt("trade_id")));
                amount_2_textfield.setText(String.valueOf(trs.getDouble("amount")) + SIMBOLO);
                open_price_2_textfield.setText(String.valueOf(trs.getDouble("op_price")) + SIMBOLO);
                close_price_2_textfield.setText(String.valueOf(trs.getDouble("clos_price")) + SIMBOLO);
            } else {
                trade_id_2_textfield.setText("--");
                amount_2_textfield.setText("--");
                open_price_2_textfield.setText("--");
                close_price_2_textfield.setText("--");
            }
            
            if (trs.next() == true){
                trade_id_3_textfield.setText(String.valueOf(trs.getInt("trade_id")));
                amount_3_textfield.setText(String.valueOf(trs.getDouble("amount")) + SIMBOLO);
                open_price_3_textfield.setText(String.valueOf(trs.getDouble("op_price")) + SIMBOLO);
                close_price_3_textfield.setText(String.valueOf(trs.getDouble("clos_price")) + SIMBOLO);
            } else {
                trade_id_3_textfield.setText("--");
                amount_3_textfield.setText("--");
                open_price_3_textfield.setText("--");
                close_price_3_textfield.setText("--");
            }
            
        } catch (SQLException sqle) {
            Logger.getLogger(userform.class.getName()).log(Level.SEVERE, null, sqle);
        }
    }
    
    // Chequea que los datos que se introducen en el formulario tenían o no el símbolo '$' o si se deja vacío.
    private String checkFormat(String input){
        String output = input;
        if (output.equals(""))
            return "0";
        if (input.charAt(input.length() - 1) == '$'){
            output = output.substring(0, output.length() - 1);
        }
        return output;
    }
    
    // Chequea si al actualizar se están aportando datos nuevos o no.
    private boolean isTheSameAsDataBase(int tradeID, double amount, double open_price, double close_price){
        try{
            if (trs.first() == true){
                do{
                    if (trs.getInt("trade_id") == tradeID){
                        if (trs.getDouble("amount") == amount && 
                                trs.getDouble("op_price") == open_price &&
                                trs.getDouble("clos_price") == close_price){
                            return true;
                        } else {
                            return false;
                        }
                    } 
                } while (trs.next());  
            }
            return false;
        } catch(SQLException sqlex){
            return false;
        }
    }
    
    // Vacía las cajas de texto para insertar datos.
    private void clearAddFields(){
        amount_add_textfield.setText("");
        open_price_add_textfield.setText("");
        close_price_add_textfield.setText("");
    }
    
    // Navega hacia los datos del siguiente usuario.
    private void next_user() {
        try{
            rs.next();
            if (rs.isAfterLast()) {
                previous_user();
            } else {
                fillUserData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(userform.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    // Navega hacia los datos del usuario anterior.
    private void previous_user() {
        try{
            if (!rs.previous()){
                next_user();
            } else { 
                fillUserData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(userform.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    // Inserta un nuevo trade en el formulario y en la base de datos. Este nuevo trade aparecerá en la primera fila.
    private void insertData(){      
        try {
            int trade_user_id = Integer.parseInt(user_id_textfield.getText());
            double amount = Double.parseDouble(amount_add_textfield.getText());
            double open_price = Double.parseDouble(open_price_add_textfield.getText());
            double clos_price = Double.parseDouble(close_price_add_textfield.getText());
            
            String sql_query = "Insert Into crypto_market.trades_table (trade_user_id, amount, op_price, clos_price) Values ('" 
                    + trade_user_id
                    + "','" + amount
                    + "','" + open_price
                    + "','" + clos_price
                    + "')";
            Statement statement = tryConnection().createStatement();
            statement.execute(sql_query);
            
        } catch(SQLException sqlex) {
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Los datos introducidos no son correctos.\n"
                    + "Asegúrate de rellenar los 3 campos en el formato adecuado", "DATOS INCORRECTOS", JOptionPane.WARNING_MESSAGE);
            return;
        }
                       
        retrieveTradeInfo();
        clearAddFields();
        JOptionPane.showMessageDialog(null, "El trade ha sido correctamente añadido", "TRADE AÑADIDO", JOptionPane.WARNING_MESSAGE);
    }
    
    // Actualiza el trade de la fila seleccionada.
    private void updateTrade(int numTrade){
        int tradeIdToUpdate = 0;
        double amount = 0;
        double op_price = 0;
        double clos_price= 0;
        
        try{
            switch (numTrade){
            case 1:
                tradeIdToUpdate = Integer.parseInt(checkFormat(trade_id_1_textfield.getText()));
                amount = Double.parseDouble(checkFormat(amount_1_textfield.getText()));
                op_price = Double.parseDouble(checkFormat(open_price_1_textfield.getText()));
                clos_price = Double.parseDouble(checkFormat(close_price_1_textfield.getText())); 
                break;
            case 2:
                tradeIdToUpdate = Integer.parseInt(checkFormat(trade_id_2_textfield.getText()));
                amount = Double.parseDouble(checkFormat(amount_2_textfield.getText()));
                op_price = Double.parseDouble(checkFormat(open_price_2_textfield.getText()));
                clos_price = Double.parseDouble(checkFormat(close_price_2_textfield.getText())); 
                break;
            case 3:
                tradeIdToUpdate = Integer.parseInt(checkFormat(trade_id_3_textfield.getText()));
                amount = Double.parseDouble(checkFormat(amount_3_textfield.getText()));
                op_price = Double.parseDouble(checkFormat(open_price_3_textfield.getText()));
                clos_price = Double.parseDouble(checkFormat(close_price_3_textfield.getText())); 
                break;
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Los datos introducidos no son correctos.\n"
                    + "Asegúrate de rellenar los 3 campos en el formato adecuado", "DATOS INCORRECTOS", JOptionPane.WARNING_MESSAGE);
            retrieveTradeInfo();
            return;
        }
        
        if (isTheSameAsDataBase(tradeIdToUpdate, amount, op_price, clos_price)){
            JOptionPane.showMessageDialog(null, "Los datos aportados son iguales a los anteriores.", "TRADE NO MODIFICADO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String sql_query = "UPDATE crypto_market.trades_table SET amount = ?, op_price = ?, clos_price = ? WHERE trade_id = ?;";
        try {
            PreparedStatement ps;
            ps = tryConnection().prepareStatement(sql_query);
            ps.setDouble(1, amount);
            ps.setDouble(2, op_price);
            ps.setDouble(3, clos_price);
            ps.setInt(4, tradeIdToUpdate);
            int reply = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres modificar este trade?", "WARNING", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.NO_OPTION) {
                retrieveTradeInfo();
                return;
            }
            ps.execute();
        } catch (SQLException sqlEx){

        }
        retrieveTradeInfo();
        JOptionPane.showMessageDialog(null, "El trade ha sido modificado correctamente.", "TRADE MODIFICADO", JOptionPane.WARNING_MESSAGE);
    }   
    
    // Elimina el trade de la fila seleccionada.
    private void deleteTrade(int numTrade){
        int tradeIdToDelete = 0;
        switch (numTrade){
            case 1:
                tradeIdToDelete = Integer.parseInt(trade_id_1_textfield.getText());
                break;
            case 2:
                tradeIdToDelete = Integer.parseInt(trade_id_2_textfield.getText());
                break;
            case 3:
                tradeIdToDelete = Integer.parseInt(trade_id_3_textfield.getText());
                break;
        }
        String sql_query = "DELETE FROM crypto_market.trades_table WHERE trade_id ='" + tradeIdToDelete + "'";
             
        try{
            PreparedStatement ps = tryConnection().prepareStatement(sql_query);
            int reply = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres eliminar este trade?", "WARNING", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.NO_OPTION) {
                retrieveTradeInfo();
                return;
            }
            ps.execute();
            retrieveTradeInfo();
            JOptionPane.showMessageDialog(null, "El trade ha sido borrado", "TRADE BORRADO", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException sqlEx){
            JOptionPane.showMessageDialog(null, "No se pudo borrar el trade", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_amount_label;
    private javax.swing.JLabel add_close_price_label;
    private javax.swing.JLabel add_open_price_label;
    private javax.swing.JTextField amount_1_textfield;
    private javax.swing.JTextField amount_2_textfield;
    private javax.swing.JTextField amount_3_textfield;
    private javax.swing.JTextField amount_add_textfield;
    private javax.swing.JLabel amount_label;
    private javax.swing.JTextField close_price_1_textfield;
    private javax.swing.JTextField close_price_2_textfield;
    private javax.swing.JTextField close_price_3_textfield;
    private javax.swing.JTextField close_price_add_textfield;
    private javax.swing.JLabel close_price_label;
    private javax.swing.JButton delete_trade1_button;
    private javax.swing.JButton delete_trade2_button;
    private javax.swing.JButton delete_trade3_button;
    private javax.swing.JLabel first_item_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton next_user_button;
    private javax.swing.JTextField open_price_1_textfield;
    private javax.swing.JTextField open_price_2_textfield;
    private javax.swing.JTextField open_price_3_textfield;
    private javax.swing.JTextField open_price_add_textfield;
    private javax.swing.JLabel open_price_label;
    private javax.swing.JButton previous_user_button;
    private javax.swing.JLabel second_item_label;
    private javax.swing.JLabel third_item_label;
    private javax.swing.JTextField trade_id_1_textfield;
    private javax.swing.JTextField trade_id_2_textfield;
    private javax.swing.JTextField trade_id_3_textfield;
    private javax.swing.JLabel trade_id_label;
    private javax.swing.JButton update_trade1_button;
    private javax.swing.JButton update_trade2_button;
    private javax.swing.JButton update_trade3_button;
    private javax.swing.JLabel user_balance_label;
    private javax.swing.JTextField user_balance_textfield;
    private javax.swing.JLabel user_id_label;
    private javax.swing.JTextField user_id_textfield;
    private javax.swing.JLabel user_name_label;
    private javax.swing.JTextField user_name_textfield;
    private javax.swing.JLabel user_tier_label;
    private javax.swing.JTextField user_tier_textfield;
    // End of variables declaration//GEN-END:variables
}
