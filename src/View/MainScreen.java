package View;

import java.awt.CardLayout;

public class MainScreen extends javax.swing.JFrame {

    CardLayout cardLayout;
    
    public MainScreen() {
        initComponents();
        cardLayout = (CardLayout) (panelCards.getLayout());
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainTabbedPane = new javax.swing.JTabbedPane();
        jPanelMainScreen = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        panelOptions = new javax.swing.JPanel();
        btnPaneOne = new javax.swing.JButton();
        btnPaneTwo = new javax.swing.JButton();
        panelCards = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnPaneOne.setText("Pane 1");
        btnPaneOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaneOneActionPerformed(evt);
            }
        });

        btnPaneTwo.setText("Pane 2");
        btnPaneTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaneTwoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOptionsLayout = new javax.swing.GroupLayout(panelOptions);
        panelOptions.setLayout(panelOptionsLayout);
        panelOptionsLayout.setHorizontalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPaneTwo)
                    .addComponent(btnPaneOne))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        panelOptionsLayout.setVerticalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionsLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnPaneOne)
                .addGap(66, 66, 66)
                .addComponent(btnPaneTwo)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(panelOptions);

        panelCards.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelCards.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        panelCards.add(jPanel1, "jCard1");

        jLabel4.setText("esse é o panel 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel4)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel4)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        panelCards.add(jPanel2, "jCard2");

        jSplitPane1.setRightComponent(panelCards);

        javax.swing.GroupLayout jPanelMainScreenLayout = new javax.swing.GroupLayout(jPanelMainScreen);
        jPanelMainScreen.setLayout(jPanelMainScreenLayout);
        jPanelMainScreenLayout.setHorizontalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jSplitPane1)
                .addGap(8, 8, 8))
        );
        jPanelMainScreenLayout.setVerticalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jSplitPane1)
                .addGap(8, 8, 8))
        );

        jMainTabbedPane.addTab("Tela Inicial", jPanelMainScreen);

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1104, Short.MAX_VALUE)
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jMainTabbedPane.addTab("Clientes", jPanelCustomers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jMainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaneOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaneOneActionPerformed
        cardLayout.show(panelCards, "jCard1");
    }//GEN-LAST:event_btnPaneOneActionPerformed

    private void btnPaneTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaneTwoActionPerformed
        cardLayout.show(panelCards, "jCard2");
    }//GEN-LAST:event_btnPaneTwoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaneOne;
    private javax.swing.JButton btnPaneTwo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTabbedPane jMainTabbedPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelMainScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panelCards;
    private javax.swing.JPanel panelOptions;
    // End of variables declaration//GEN-END:variables
}
