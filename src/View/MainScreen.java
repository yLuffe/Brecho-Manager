package View;

import Controller.ControllerClothing;
import Model.Clothing;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainScreen extends javax.swing.JFrame {

    CardLayout cardLayout;
    ControllerClothing controller;

    public MainScreen() {
        initComponents();
        cardLayout = (CardLayout) (panelCards.getLayout());
        this.controller = new ControllerClothing(this);
        this.controller.loadComboColors(jComboColor,jFilterColor);
    }

    // Métodos
    public void updateTable(ArrayList<Clothing> clothes) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableClothes.getModel();
            model.setRowCount(0);

            for (Clothing clothing : clothes) {
                int row = model.getRowCount();
                model.addRow(new Object[0]); // Adiciona uma nova linha vazia

                // Define os valores nas colunas especificadas
                model.setValueAt(clothing.getId(), row, 0);
                model.setValueAt(clothing.getName(), row, 1);
                model.setValueAt(clothing.getDescription(), row, 3);
                model.setValueAt(clothing.getCategory(), row, 4);
                model.setValueAt(clothing.getSize(), row, 5);
                model.setValueAt(clothing.getColor(), row, 6);
                model.setValueAt(clothing.getPrice(), row, 2);
                model.setValueAt(clothing.isConsigned(), row, 7);
                model.setValueAt(clothing.isNewClothes(), row, 8);
                model.setValueAt(clothing.getCustomerName(), row, 9);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela\n" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jMainTabbedPane = new javax.swing.JTabbedPane();
        jPanelMainScreen = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        optionsPane = new javax.swing.JPanel();
        buttonViewClothes = new javax.swing.JButton();
        buttonAddClothes = new javax.swing.JButton();
        buttonEditClothes = new javax.swing.JButton();
        buttonRemoveClothes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelCards = new javax.swing.JPanel();
        viewClothing = new javax.swing.JPanel();
        jPanelFilters = new javax.swing.JPanel();
        jLabelPeça = new javax.swing.JLabel();
        jTextFilter = new javax.swing.JTextField();
        jLabelFiltros = new javax.swing.JLabel();
        jCategoryBox = new javax.swing.JComboBox<>();
        jSizeBox = new javax.swing.JComboBox<>();
        jFilterColor = new javax.swing.JComboBox<>();
        jMultipleFiltersBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPanel = new javax.swing.JScrollPane();
        jTableClothes = new javax.swing.JTable();
        viewEditClothing = new javax.swing.JPanel();
        viewNewClothing = new javax.swing.JPanel();
        labelPeça = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboCategory = new javax.swing.JComboBox<>();
        jComboSize = new javax.swing.JComboBox<>();
        jComboColor = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        btnAddCategory = new javax.swing.JButton();
        btnAddColor = new javax.swing.JButton();
        jPanelCustomers = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setEnabled(false);

        optionsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        optionsPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        optionsPane.setPreferredSize(new java.awt.Dimension(240, 603));

        buttonViewClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        buttonViewClothes.setText("👁");
        buttonViewClothes.setToolTipText("Visualizar");
        buttonViewClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonViewClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewClothesActionPerformed(evt);
            }
        });

        buttonAddClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        buttonAddClothes.setText("➕");
        buttonAddClothes.setToolTipText("Adicionar");
        buttonAddClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddClothesActionPerformed(evt);
            }
        });

        buttonEditClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        buttonEditClothes.setText("🖊");
        buttonEditClothes.setToolTipText("Editar");
        buttonEditClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditClothesActionPerformed(evt);
            }
        });

        buttonRemoveClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        buttonRemoveClothes.setText("❌");
        buttonRemoveClothes.setToolTipText("Deletar");
        buttonRemoveClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveClothesActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Components/Icons/desapegoslogo.jpg"))); // NOI18N

        javax.swing.GroupLayout optionsPaneLayout = new javax.swing.GroupLayout(optionsPane);
        optionsPane.setLayout(optionsPaneLayout);
        optionsPaneLayout.setHorizontalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buttonViewClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemoveClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        optionsPaneLayout.setVerticalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(buttonViewClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonAddClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonEditClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonRemoveClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jSplitPane1.setLeftComponent(optionsPane);

        panelCards.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelCards.setLayout(new java.awt.CardLayout());

        jLabelPeça.setText("Peça");

        jLabelFiltros.setText("Categoria:");

        jCategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));

        jSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho" }));

        jFilterColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas" }));

        jMultipleFiltersBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtros" }));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("🔎");

        jLabel1.setText("Tamanho:");

        jLabel3.setText("Cor:");

        jLabel7.setText("Filtros:");

        javax.swing.GroupLayout jPanelFiltersLayout = new javax.swing.GroupLayout(jPanelFilters);
        jPanelFilters.setLayout(jPanelFiltersLayout);
        jPanelFiltersLayout.setHorizontalGroup(
            jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeça))
                .addGap(5, 5, 5)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFiltros))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jMultipleFiltersBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanelFiltersLayout.setVerticalGroup(
            jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeça)
                    .addComponent(jLabelFiltros)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMultipleFiltersBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTableClothes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Peça", "Preço", "Descrição", "Categoria", "Tamanho", "Cor", "Consignação", "Novo", "Cliente", "Disponível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClothes.setAutoResizeMode(0);
        jTableClothes.setShowGrid(true);
        jScrollPanel.setViewportView(jTableClothes);
        if (jTableClothes.getColumnModel().getColumnCount() > 0) {
            jTableClothes.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableClothes.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTableClothes.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTableClothes.getColumnModel().getColumn(3).setPreferredWidth(480);
            jTableClothes.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTableClothes.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTableClothes.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTableClothes.getColumnModel().getColumn(7).setPreferredWidth(120);
            jTableClothes.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTableClothes.getColumnModel().getColumn(9).setPreferredWidth(400);
            jTableClothes.getColumnModel().getColumn(10).setPreferredWidth(100);
        }

        javax.swing.GroupLayout viewClothingLayout = new javax.swing.GroupLayout(viewClothing);
        viewClothing.setLayout(viewClothingLayout);
        viewClothingLayout.setHorizontalGroup(
            viewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFilters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewClothingLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPanel)
                .addGap(5, 5, 5))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        viewClothingLayout.setVerticalGroup(
            viewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewClothingLayout.createSequentialGroup()
                .addComponent(jPanelFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCards.add(viewClothing, "cardView");

        javax.swing.GroupLayout viewEditClothingLayout = new javax.swing.GroupLayout(viewEditClothing);
        viewEditClothing.setLayout(viewEditClothingLayout);
        viewEditClothingLayout.setHorizontalGroup(
            viewEditClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1294, Short.MAX_VALUE)
        );
        viewEditClothingLayout.setVerticalGroup(
            viewEditClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        panelCards.add(viewEditClothing, "viewEdit");

        labelPeça.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelPeça.setText("Peça");

        labelDescription.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelDescription.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        jLabel4.setText("Categoria");

        jLabel5.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        jLabel5.setText("Tamanho");

        jLabel6.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        jLabel6.setText("Cor");

        labelPrice.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelPrice.setText("Preço");

        jLabel8.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        jLabel8.setText("Consignação");

        jLabel9.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        jLabel9.setText("Roupa Nova");

        jLabel10.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        jLabel10.setText("Nome da Cliente");

        jTextField1.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextField2.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jComboCategory.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboSize.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboColor.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField3.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jCheckBox1.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jCheckBox1.setText("Sim");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox2.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jCheckBox2.setText("Sim");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField4.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        btnAddCategory.setText("➕");
        btnAddCategory.setToolTipText("Adicionar Nova Categoria");

        btnAddColor.setText("➕");
        btnAddColor.setToolTipText("Adicionar Nova Cor");

        javax.swing.GroupLayout viewNewClothingLayout = new javax.swing.GroupLayout(viewNewClothing);
        viewNewClothing.setLayout(viewNewClothingLayout);
        viewNewClothingLayout.setHorizontalGroup(
            viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addComponent(labelPeça)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addComponent(labelDescription)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewNewClothingLayout.createSequentialGroup()
                                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jLabel8)
                                    .addComponent(labelPrice)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(viewNewClothingLayout.createSequentialGroup()
                                                .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(viewNewClothingLayout.createSequentialGroup()
                                                .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(btnAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jCheckBox2))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(15, 15, 15))))
        );
        viewNewClothingLayout.setVerticalGroup(
            viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelPeça)
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelDescription)
                .addGap(10, 10, 10)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(labelPrice))
                .addGap(10, 10, 10)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCards.add(viewNewClothing, "cardAdd");

        jSplitPane1.setRightComponent(panelCards);

        javax.swing.GroupLayout jPanelMainScreenLayout = new javax.swing.GroupLayout(jPanelMainScreen);
        jPanelMainScreen.setLayout(jPanelMainScreenLayout);
        jPanelMainScreenLayout.setHorizontalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1373, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanelMainScreenLayout.setVerticalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        jMainTabbedPane.addTab("Tela Inicial", jPanelMainScreen);

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1383, Short.MAX_VALUE)
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
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
                .addComponent(jMainTabbedPane))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRemoveClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveClothesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRemoveClothesActionPerformed

    private void buttonViewClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewClothesActionPerformed
        cardLayout.show(panelCards, "cardView");
    }//GEN-LAST:event_buttonViewClothesActionPerformed

    private void buttonAddClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddClothesActionPerformed
        cardLayout.show(panelCards, "cardAdd");
    }//GEN-LAST:event_buttonAddClothesActionPerformed

    private void buttonEditClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditClothesActionPerformed
        cardLayout.show(panelCards, "cardEdit");
    }//GEN-LAST:event_buttonEditClothesActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddColor;
    private javax.swing.JButton buttonAddClothes;
    private javax.swing.JButton buttonEditClothes;
    private javax.swing.JButton buttonRemoveClothes;
    private javax.swing.JButton buttonViewClothes;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCategoryBox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboCategory;
    private javax.swing.JComboBox<String> jComboColor;
    private javax.swing.JComboBox<String> jComboSize;
    private javax.swing.JComboBox<String> jFilterColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFiltros;
    private javax.swing.JLabel jLabelPeça;
    private javax.swing.JTabbedPane jMainTabbedPane;
    private javax.swing.JComboBox<String> jMultipleFiltersBox;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelFilters;
    private javax.swing.JPanel jPanelMainScreen;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jSizeBox;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTableClothes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFilter;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelPeça;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JPanel optionsPane;
    private javax.swing.JPanel panelCards;
    private javax.swing.JPanel viewClothing;
    private javax.swing.JPanel viewEditClothing;
    private javax.swing.JPanel viewNewClothing;
    // End of variables declaration//GEN-END:variables
}
