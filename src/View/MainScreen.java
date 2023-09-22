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
        jMainSplitPane = new javax.swing.JSplitPane();
        panelOptions = new View.Components.DropShadow.PanelShadow();
        jBtnOne = new javax.swing.JButton();
        jBtnTwo = new javax.swing.JButton();
        panelCards = new View.Components.DropShadow.PanelShadow();
        shadowPanelOne = new View.Components.DropShadow.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        shadowPanelTwo = new View.Components.DropShadow.PanelShadow();
        jLabel2 = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelOptions.setShadowOpacity(0.6F);
        panelOptions.setShadowSize(4);

        jBtnOne.setText("Panel One");
        jBtnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOneActionPerformed(evt);
            }
        });

        jBtnTwo.setText("Panel Two");
        jBtnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTwoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOptionsLayout = new javax.swing.GroupLayout(panelOptions);
        panelOptions.setLayout(panelOptionsLayout);
        panelOptionsLayout.setHorizontalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnOne)
                    .addComponent(jBtnTwo))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelOptionsLayout.setVerticalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionsLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jBtnOne)
                .addGap(30, 30, 30)
                .addComponent(jBtnTwo)
                .addContainerGap(466, Short.MAX_VALUE))
        );

        jMainSplitPane.setLeftComponent(panelOptions);

        panelCards.setLayout(new java.awt.CardLayout());

        shadowPanelOne.setShadowOpacity(0.6F);
        shadowPanelOne.setShadowSize(4);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout shadowPanelOneLayout = new javax.swing.GroupLayout(shadowPanelOne);
        shadowPanelOne.setLayout(shadowPanelOneLayout);
        shadowPanelOneLayout.setHorizontalGroup(
            shadowPanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shadowPanelOneLayout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(390, 390, 390))
        );
        shadowPanelOneLayout.setVerticalGroup(
            shadowPanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadowPanelOneLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        panelCards.add(shadowPanelOne, "card1");

        shadowPanelTwo.setShadowOpacity(0.6F);
        shadowPanelTwo.setShadowSize(4);

        jLabel2.setText("aaaaaaaaaa");

        javax.swing.GroupLayout shadowPanelTwoLayout = new javax.swing.GroupLayout(shadowPanelTwo);
        shadowPanelTwo.setLayout(shadowPanelTwoLayout);
        shadowPanelTwoLayout.setHorizontalGroup(
            shadowPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadowPanelTwoLayout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel2)
                .addContainerGap(394, Short.MAX_VALUE))
        );
        shadowPanelTwoLayout.setVerticalGroup(
            shadowPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadowPanelTwoLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel2)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        panelCards.add(shadowPanelTwo, "card2");

        jMainSplitPane.setRightComponent(panelCards);

        javax.swing.GroupLayout jPanelMainScreenLayout = new javax.swing.GroupLayout(jPanelMainScreen);
        jPanelMainScreen.setLayout(jPanelMainScreenLayout);
        jPanelMainScreenLayout.setHorizontalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainSplitPane)
                .addContainerGap())
        );
        jPanelMainScreenLayout.setVerticalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainSplitPane)
                .addContainerGap())
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

    private void jBtnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOneActionPerformed
        cardLayout.show(panelCards, "card1");
    }//GEN-LAST:event_jBtnOneActionPerformed

    private void jBtnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTwoActionPerformed
        cardLayout.show(panelCards, "card2");
    }//GEN-LAST:event_jBtnTwoActionPerformed

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
    private javax.swing.JButton jBtnOne;
    private javax.swing.JButton jBtnTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jMainSplitPane;
    private javax.swing.JTabbedPane jMainTabbedPane;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelMainScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private View.Components.DropShadow.PanelShadow panelCards;
    private View.Components.DropShadow.PanelShadow panelOptions;
    private View.Components.DropShadow.PanelShadow shadowPanelOne;
    private View.Components.DropShadow.PanelShadow shadowPanelTwo;
    // End of variables declaration//GEN-END:variables
}
