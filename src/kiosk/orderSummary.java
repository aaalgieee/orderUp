/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kiosk;

/**
 *
 * @author algabriel
 */
public class orderSummary extends javax.swing.JFrame {

    /**
     * Creates new form orderSummary
     */
    public orderSummary() {
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

        scpOrder = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lblEatingLocation = new javax.swing.JLabel();
        tgbEatIn = new javax.swing.JToggleButton();
        tgbTakeOut = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        tgbEatIn1 = new javax.swing.JToggleButton();
        tgbTakeOut1 = new javax.swing.JToggleButton();
        pnlHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        scpOrder1 = new javax.swing.JScrollPane();
        tblOrder1 = new javax.swing.JTable();
        pnlTotal = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblTotalValue = new javax.swing.JLabel();
        lblEatingLocation1 = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        btnCheckOut1 = new javax.swing.JButton();
        tgbEatIn2 = new javax.swing.JToggleButton();
        tgbTakeOut2 = new javax.swing.JToggleButton();
        tgbPayHere = new javax.swing.JToggleButton();
        tgbPayCounter = new javax.swing.JToggleButton();

        scpOrder.setPreferredSize(new java.awt.Dimension(452, 200));

        tblOrder.setModel(tbmOrder);
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        scpOrder.setViewportView(tblOrder);

        lblEatingLocation.setText("Where do you want to eat?");

        tgbEatIn.setText("Eat in");
        tgbEatIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbEatIn.setIconTextGap(15);
        tgbEatIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbEatIn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbEatInItemStateChanged(evt);
            }
        });

        tgbTakeOut.setText("Take out");
        tgbTakeOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbTakeOut.setIconTextGap(15);
        tgbTakeOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbTakeOut.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbTakeOutItemStateChanged(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        tgbEatIn1.setText("Eat in");
        tgbEatIn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbEatIn1.setIconTextGap(15);
        tgbEatIn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbEatIn1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbEatIn1ItemStateChanged(evt);
            }
        });

        tgbTakeOut1.setText("Take out");
        tgbTakeOut1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbTakeOut1.setIconTextGap(15);
        tgbTakeOut1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbTakeOut1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbTakeOut1ItemStateChanged(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeader.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        pnlHeader.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        lblHeaderTitle.setFont(lblHeaderTitle.getFont().deriveFont(lblHeaderTitle.getFont().getSize()+10f));
        lblHeaderTitle.setText("Order Summary");
        lblHeaderTitle.setToolTipText("");
        pnlHeader.add(lblHeaderTitle);

        scpOrder1.setPreferredSize(new java.awt.Dimension(452, 200));

        tblOrder1.setModel(tbmOrder);
        tblOrder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrder1MouseClicked(evt);
            }
        });
        scpOrder1.setViewportView(tblOrder1);

        pnlTotal.setPreferredSize(new java.awt.Dimension(165, 10));
        pnlTotal.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 20));

        lblTotal.setFont(lblTotal.getFont().deriveFont(lblTotal.getFont().getStyle() | java.awt.Font.BOLD));
        lblTotal.setText("Total:");
        pnlTotal.add(lblTotal);

        lblTotalValue.setFont(lblTotalValue.getFont().deriveFont(lblTotalValue.getFont().getStyle() | java.awt.Font.BOLD));
        lblTotalValue.setText("$ 0.00");
        pnlTotal.add(lblTotalValue);

        lblEatingLocation1.setText("Where do you want to eat?");

        lblPayment.setText("How do you want to pay?");

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btnCheckOut1.setText("Check out");
        btnCheckOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOut1ActionPerformed(evt);
            }
        });

        tgbEatIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/cutlery.png"))); // NOI18N
        tgbEatIn2.setText("Eat in");
        tgbEatIn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbEatIn2.setIconTextGap(15);
        tgbEatIn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbEatIn2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbEatIn2ItemStateChanged(evt);
            }
        });

        tgbTakeOut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/green-tea.png"))); // NOI18N
        tgbTakeOut2.setText("Take out");
        tgbTakeOut2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbTakeOut2.setIconTextGap(15);
        tgbTakeOut2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbTakeOut2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbTakeOut2ItemStateChanged(evt);
            }
        });

        tgbPayHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/credit-card.png"))); // NOI18N
        tgbPayHere.setText("Pay here");
        tgbPayHere.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbPayHere.setIconTextGap(10);
        tgbPayHere.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbPayHere.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbPayHereItemStateChanged(evt);
            }
        });

        tgbPayCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/wallet.png"))); // NOI18N
        tgbPayCounter.setText("Pay at counter");
        tgbPayCounter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbPayCounter.setIconTextGap(15);
        tgbPayCounter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbPayCounter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tgbPayCounterItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scpOrder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckOut1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tgbPayHere, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(tgbPayCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEatingLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tgbEatIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(tgbTakeOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEatingLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbEatIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbTakeOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbPayHere, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbPayCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack1)
                    .addComponent(btnCheckOut1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        int rowIndex = tblOrder.getSelectedRow();
        CustomizeDialog customizeDialog = new CustomizeDialog(StateManager.getOrderedItem(rowIndex), rowIndex);
        customizeDialog.addObserver(this);
        customizeDialog.setVisible(true);
    }//GEN-LAST:event_tblOrderMouseClicked

    private void tblOrder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrder1MouseClicked
        int rowIndex = tblOrder.getSelectedRow();
        CustomizeDialog customizeDialog = new CustomizeDialog(StateManager.getOrderedItem(rowIndex), rowIndex);
        customizeDialog.addObserver(this);
        customizeDialog.setVisible(true);
    }//GEN-LAST:event_tblOrder1MouseClicked

    private void tgbEatInItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbEatInItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setEatingLocation(models.Order.EAT_IN);
        }
    }//GEN-LAST:event_tgbEatInItemStateChanged

    private void tgbTakeOutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbTakeOutItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setEatingLocation(models.Order.TAKE_OUT);
        }
    }//GEN-LAST:event_tgbTakeOutItemStateChanged

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MenuFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        if (getValidOptions()) {
            services.OrderService orderService = new services.OrderService();
            java.util.ArrayList<models.OrderDetail> orderedItems = StateManager.getOrderedItems();

            models.Order order = new models.Order();
            order.setPaymentMethod(StateManager.getPaymentMethod());
            order.setEatingLocation(StateManager.getEatingLocation());

            int orderId = orderService.createOne(order);
            int rowCount = orderService.createOneDetails(orderId, orderedItems);

            if (rowCount > 0) {
                new EndFrame().setVisible(true);
                dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Oops, we couldn't get your order.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        new MenuFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnCheckOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOut1ActionPerformed
        if (getValidOptions()) {
            services.OrderService orderService = new services.OrderService();
            java.util.ArrayList<models.OrderDetail> orderedItems = StateManager.getOrderedItems();

            models.Order order = new models.Order();
            order.setPaymentMethod(StateManager.getPaymentMethod());
            order.setEatingLocation(StateManager.getEatingLocation());

            int orderId = orderService.createOne(order);
            int rowCount = orderService.createOneDetails(orderId, orderedItems);

            if (rowCount > 0) {
                new EndFrame().setVisible(true);
                dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Oops, we couldn't get your order.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCheckOut1ActionPerformed

    private void tgbEatIn1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbEatIn1ItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setEatingLocation(models.Order.EAT_IN);
        }
    }//GEN-LAST:event_tgbEatIn1ItemStateChanged

    private void tgbTakeOut1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbTakeOut1ItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setEatingLocation(models.Order.TAKE_OUT);
        }
    }//GEN-LAST:event_tgbTakeOut1ItemStateChanged

    private void tgbEatIn2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbEatIn2ItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setEatingLocation(models.Order.EAT_IN);
        }
    }//GEN-LAST:event_tgbEatIn2ItemStateChanged

    private void tgbTakeOut2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbTakeOut2ItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setEatingLocation(models.Order.TAKE_OUT);
        }
    }//GEN-LAST:event_tgbTakeOut2ItemStateChanged

    private void tgbPayHereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbPayHereItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setPaymentMethod(models.Order.PAY_HERE);
        }
    }//GEN-LAST:event_tgbPayHereItemStateChanged

    private void tgbPayCounterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbPayCounterItemStateChanged
        if (evt.getStateChange() == 1) {
            StateManager.setPaymentMethod(models.Order.PAY_COUNTER);
        }
    }//GEN-LAST:event_tgbPayCounterItemStateChanged

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
            java.util.logging.Logger.getLogger(orderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderSummary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnCheckOut1;
    private javax.swing.JLabel lblEatingLocation;
    private javax.swing.JLabel lblEatingLocation1;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JScrollPane scpOrder;
    private javax.swing.JScrollPane scpOrder1;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblOrder1;
    private javax.swing.JToggleButton tgbEatIn;
    private javax.swing.JToggleButton tgbEatIn1;
    private javax.swing.JToggleButton tgbEatIn2;
    private javax.swing.JToggleButton tgbPayCounter;
    private javax.swing.JToggleButton tgbPayHere;
    private javax.swing.JToggleButton tgbTakeOut;
    private javax.swing.JToggleButton tgbTakeOut1;
    private javax.swing.JToggleButton tgbTakeOut2;
    // End of variables declaration//GEN-END:variables
}
