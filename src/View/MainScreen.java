package View;

import java.awt.CardLayout;
import javax.swing.JScrollPane;

public class MainScreen extends javax.swing.JFrame {

    CardLayout cardLayout;

    public MainScreen() {
        initComponents();
        cardLayout = (CardLayout) (panelCards.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jMainTabbedPane = new javax.swing.JTabbedPane();
        jPanelMainScreen = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        optionsPane = new javax.swing.JPanel();
        jTituloLabel = new javax.swing.JLabel();
        buttonViewClothes = new javax.swing.JButton();
        buttonAddClothes = new javax.swing.JButton();
        buttonEditClothes = new javax.swing.JButton();
        buttonRemoveClothes = new javax.swing.JButton();
        jTituloLabel1 = new javax.swing.JLabel();
        panelCards = new javax.swing.JPanel();
        viewClothing = new javax.swing.JPanel();
        jPanelFilters = new javax.swing.JPanel();
        jLabelPeça = new javax.swing.JLabel();
        jTextFilter = new javax.swing.JTextField();
        jLabelFiltros = new javax.swing.JLabel();
        jCategoryBox = new javax.swing.JComboBox<>();
        jSizeBox = new javax.swing.JComboBox<>();
        jColorBox = new javax.swing.JComboBox<>();
        jMultipleFiltersBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPanel = new javax.swing.JScrollPane();
        jClothesTable = new javax.swing.JTable();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jPanelCustomers = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setEnabled(false);

        optionsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        optionsPane.setPreferredSize(new java.awt.Dimension(240, 603));

        jTituloLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jTituloLabel.setText("Desapegos da");

        buttonViewClothes.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 18)); // NOI18N
        buttonViewClothes.setText("Visualizar");
        buttonViewClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonViewClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewClothesActionPerformed(evt);
            }
        });

        buttonAddClothes.setFont(new java.awt.Font("JetBrains Mono NL SemiBold", 0, 18)); // NOI18N
        buttonAddClothes.setText("Adicionar");
        buttonAddClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddClothesActionPerformed(evt);
            }
        });

        buttonEditClothes.setFont(new java.awt.Font("JetBrains Mono NL SemiBold", 0, 18)); // NOI18N
        buttonEditClothes.setText("Editar");
        buttonEditClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditClothesActionPerformed(evt);
            }
        });

        buttonRemoveClothes.setFont(new java.awt.Font("JetBrains Mono NL SemiBold", 0, 18)); // NOI18N
        buttonRemoveClothes.setText("Remover");
        buttonRemoveClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoveClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveClothesActionPerformed(evt);
            }
        });

        jTituloLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jTituloLabel1.setText("Camis");

        javax.swing.GroupLayout optionsPaneLayout = new javax.swing.GroupLayout(optionsPane);
        optionsPane.setLayout(optionsPaneLayout);
        optionsPaneLayout.setHorizontalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTituloLabel1)
                    .addComponent(jTituloLabel)
                    .addComponent(buttonViewClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddClothes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEditClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemoveClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        optionsPaneLayout.setVerticalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTituloLabel)
                .addGap(0, 0, 0)
                .addComponent(jTituloLabel1)
                .addGap(31, 31, 31)
                .addComponent(buttonViewClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(buttonAddClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(buttonEditClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(buttonRemoveClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(optionsPane);

        panelCards.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelCards.setLayout(new java.awt.CardLayout());

        jLabelPeça.setText("Peça");

        jLabelFiltros.setText("Filtros:");

        jCategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));

        jSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho" }));

        jColorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cor" }));

        jMultipleFiltersBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtros" }));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("🔎");

        javax.swing.GroupLayout jPanelFiltersLayout = new javax.swing.GroupLayout(jPanelFilters);
        jPanelFilters.setLayout(jPanelFiltersLayout);
        jPanelFiltersLayout.setHorizontalGroup(
            jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltersLayout.createSequentialGroup()
                        .addComponent(jLabelPeça)
                        .addGap(535, 535, 535))
                    .addGroup(jPanelFiltersLayout.createSequentialGroup()
                        .addComponent(jTextFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabelFiltros)
                        .addGap(5, 5, 5)
                        .addComponent(jCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jSizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jColorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jMultipleFiltersBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        jPanelFiltersLayout.setVerticalGroup(
            jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelPeça)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFiltros)
                    .addComponent(jCategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jColorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMultipleFiltersBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jClothesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jClothesTable.setAutoResizeMode(0);
        jClothesTable.setColumnSelectionAllowed(true);
        jScrollPanel.setViewportView(jClothesTable);
        if (jClothesTable.getColumnModel().getColumnCount() > 0) {
            jClothesTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            jClothesTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            jClothesTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            jClothesTable.getColumnModel().getColumn(3).setPreferredWidth(480);
            jClothesTable.getColumnModel().getColumn(4).setPreferredWidth(120);
            jClothesTable.getColumnModel().getColumn(5).setPreferredWidth(120);
            jClothesTable.getColumnModel().getColumn(6).setPreferredWidth(120);
            jClothesTable.getColumnModel().getColumn(7).setPreferredWidth(120);
            jClothesTable.getColumnModel().getColumn(8).setPreferredWidth(120);
            jClothesTable.getColumnModel().getColumn(9).setPreferredWidth(400);
            jClothesTable.getColumnModel().getColumn(10).setPreferredWidth(100);
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
                .addComponent(jScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCards.add(viewClothing, "cardView");

        javax.swing.GroupLayout viewEditClothingLayout = new javax.swing.GroupLayout(viewEditClothing);
        viewEditClothing.setLayout(viewEditClothingLayout);
        viewEditClothingLayout.setHorizontalGroup(
            viewEditClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        viewEditClothingLayout.setVerticalGroup(
            viewEditClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
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

        jComboBox1.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox2.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox3.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jCheckBox2)
                                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66)
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(66, 66, 66)
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))))))
                        .addGap(15, 15, 15))))
        );
        viewNewClothingLayout.setVerticalGroup(
            viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelPeça)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addComponent(labelPrice)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox2))
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox1)))
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
                .addComponent(jSplitPane1)
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
            .addGap(0, 1171, Short.MAX_VALUE)
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
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
    private javax.swing.JButton buttonAddClothes;
    private javax.swing.JButton buttonEditClothes;
    private javax.swing.JButton buttonRemoveClothes;
    private javax.swing.JButton buttonViewClothes;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCategoryBox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JTable jClothesTable;
    private javax.swing.JComboBox<String> jColorBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFilter;
    private javax.swing.JLabel jTituloLabel;
    private javax.swing.JLabel jTituloLabel1;
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
