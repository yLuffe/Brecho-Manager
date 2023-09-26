package View;

import Controller.ControllerClothing;
import Model.Clothing;
import Model.Filter.ColorFilter;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        this.controller.loadComboCategories(jComboCategory, jFilterCategory);
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
        jBtnViewClothes = new javax.swing.JButton();
        jBtnAddClothes = new javax.swing.JButton();
        jBtnEditClothes = new javax.swing.JButton();
        jBtnRemoveClothes = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        panelCards = new javax.swing.JPanel();
        viewClothing = new javax.swing.JPanel();
        jPanelFilters = new javax.swing.JPanel();
        jLabelPeça = new javax.swing.JLabel();
        jTextFilterByName = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jFilterCategory = new javax.swing.JComboBox<>();
        jFilterSize = new javax.swing.JComboBox<>();
        jFilterColor = new javax.swing.JComboBox<>();
        jMultipleFilters = new javax.swing.JComboBox<>();
        jBtnSearch = new javax.swing.JButton();
        jLabelTamanho = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jLabelFiltros = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPanel = new javax.swing.JScrollPane();
        jTableClothes = new javax.swing.JTable();
        viewNewClothing = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        labelCategory = new javax.swing.JLabel();
        labelSize = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        labelConsigned = new javax.swing.JLabel();
        labelNewClothing = new javax.swing.JLabel();
        labelCustomerName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textDescription = new javax.swing.JTextField();
        jComboCategory = new javax.swing.JComboBox<>();
        jComboSize = new javax.swing.JComboBox<>();
        jComboColor = new javax.swing.JComboBox<>();
        textPrice = new javax.swing.JTextField();
        jCheckConsigned = new javax.swing.JCheckBox();
        jCheckNewClothing = new javax.swing.JCheckBox();
        textCustomerName = new javax.swing.JTextField();
        jBtnAddCategory = new javax.swing.JButton();
        jBtnAddColor = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelCustomers = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setEnabled(false);

        optionsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        optionsPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        optionsPane.setPreferredSize(new java.awt.Dimension(240, 603));

        jBtnViewClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnViewClothes.setText("👁");
        jBtnViewClothes.setToolTipText("Visualizar");
        jBtnViewClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnViewClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewClothesActionPerformed(evt);
            }
        });

        jBtnAddClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnAddClothes.setText("➕");
        jBtnAddClothes.setToolTipText("Adicionar");
        jBtnAddClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAddClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddClothesActionPerformed(evt);
            }
        });

        jBtnEditClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnEditClothes.setText("🖊");
        jBtnEditClothes.setToolTipText("Editar");
        jBtnEditClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEditClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditClothesActionPerformed(evt);
            }
        });

        jBtnRemoveClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnRemoveClothes.setText("❌");
        jBtnRemoveClothes.setToolTipText("Deletar");
        jBtnRemoveClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRemoveClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoveClothesActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Components/Icons/desapegoslogo.jpg"))); // NOI18N

        javax.swing.GroupLayout optionsPaneLayout = new javax.swing.GroupLayout(optionsPane);
        optionsPane.setLayout(optionsPaneLayout);
        optionsPaneLayout.setHorizontalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtnViewClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRemoveClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        optionsPaneLayout.setVerticalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(jBtnViewClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBtnAddClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBtnEditClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBtnRemoveClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jSplitPane1.setLeftComponent(optionsPane);

        panelCards.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelCards.setLayout(new java.awt.CardLayout());

        jLabelPeça.setText("Peça");

        jLabelCategoria.setText("Categoria:");

        jFilterSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60", "PP", "P", "M", "G", "GG", "XG", "G1", "G2", "G3", "G4" }));

        jMultipleFilters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtros" }));

        jBtnSearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBtnSearch.setText("🔎");

        jLabelTamanho.setText("Tamanho:");

        jLabelCor.setText("Cor:");

        jLabelFiltros.setText("Filtros:");

        javax.swing.GroupLayout jPanelFiltersLayout = new javax.swing.GroupLayout(jPanelFilters);
        jPanelFilters.setLayout(jPanelFiltersLayout);
        jPanelFiltersLayout.setHorizontalGroup(
            jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFilterByName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeça))
                .addGap(5, 5, 5)
                .addComponent(jBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategoria))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFilterSize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTamanho))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCor))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFiltros)
                    .addComponent(jMultipleFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanelFiltersLayout.setVerticalGroup(
            jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeça)
                    .addComponent(jLabelCategoria)
                    .addComponent(jLabelTamanho)
                    .addComponent(jLabelCor)
                    .addComponent(jLabelFiltros))
                .addGap(3, 3, 3)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFilterByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilterSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMultipleFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        labelName.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelName.setText("Peça");

        labelDescription.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelDescription.setText("Descrição");

        labelCategory.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelCategory.setText("Categoria");

        labelSize.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelSize.setText("Tamanho");

        labelColor.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelColor.setText("Cor");

        labelPrice.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelPrice.setText("Preço");

        labelConsigned.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelConsigned.setText("Consignação");

        labelNewClothing.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelNewClothing.setText("Roupa Nova");

        labelCustomerName.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 18)); // NOI18N
        labelCustomerName.setText("Nome da Cliente");

        textName.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        textName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textDescription.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        textDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jComboCategory.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboSize.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60", "PP", "P", "M", "G", "GG", "XG", "G1", "G2", "G3", "G4" }));
        jComboSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboColor.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jComboColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textPrice.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        textPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jCheckConsigned.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jCheckConsigned.setText("Sim");
        jCheckConsigned.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckNewClothing.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        jCheckNewClothing.setText("Sim");
        jCheckNewClothing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textCustomerName.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        textCustomerName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCustomerNameActionPerformed(evt);
            }
        });

        jBtnAddCategory.setText("➕");
        jBtnAddCategory.setToolTipText("Adicionar Nova Categoria");

        jBtnAddColor.setText("➕");
        jBtnAddColor.setToolTipText("Adicionar Nova Cor");
        jBtnAddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddColorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Cadastrar Peça");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setText("✔");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("✖");

        javax.swing.GroupLayout viewNewClothingLayout = new javax.swing.GroupLayout(viewNewClothing);
        viewNewClothing.setLayout(viewNewClothingLayout);
        viewNewClothingLayout.setHorizontalGroup(
            viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelColor)
                            .addGroup(viewNewClothingLayout.createSequentialGroup()
                                .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategory)
                            .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSize)
                            .addComponent(jComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(549, Short.MAX_VALUE))
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textName)
                            .addComponent(textDescription)
                            .addComponent(textCustomerName)
                            .addGroup(viewNewClothingLayout.createSequentialGroup()
                                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelName)
                                    .addComponent(labelDescription)
                                    .addComponent(labelCustomerName)
                                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelPrice)
                                            .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(120, 120, 120)
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelConsigned)
                                            .addComponent(jCheckConsigned))
                                        .addGap(120, 120, 120)
                                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNewClothing)
                                            .addComponent(jCheckNewClothing))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        viewNewClothingLayout.setVerticalGroup(
            viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewNewClothingLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelName)
                .addGap(10, 10, 10)
                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescription)
                .addGap(10, 10, 10)
                .addComponent(textDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPrice)
                    .addComponent(labelConsigned)
                    .addComponent(labelNewClothing))
                .addGap(10, 10, 10)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCheckNewClothing)
                    .addComponent(jCheckConsigned)
                    .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(labelCustomerName)
                .addGap(10, 10, 10)
                .addComponent(textCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCategory)
                    .addComponent(labelColor)
                    .addComponent(labelSize))
                .addGap(10, 10, 10)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jBtnRemoveClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveClothesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnRemoveClothesActionPerformed

    private void jBtnViewClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewClothesActionPerformed
        cardLayout.show(panelCards, "cardView");
    }//GEN-LAST:event_jBtnViewClothesActionPerformed

    private void jBtnAddClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddClothesActionPerformed
        cardLayout.show(panelCards, "cardAdd");
    }//GEN-LAST:event_jBtnAddClothesActionPerformed

    private void jBtnEditClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditClothesActionPerformed
        cardLayout.show(panelCards, "cardEdit");
    }//GEN-LAST:event_jBtnEditClothesActionPerformed

    private void textCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCustomerNameActionPerformed

    private void jBtnAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddColorActionPerformed
        String newColor = JOptionPane.showInputDialog(null,"Digite o nome do novo filtro:","Input", JOptionPane.INFORMATION_MESSAGE);
        try {
            new ColorFilter().addColor(newColor);
            controller.loadComboColors(jComboColor,jFilterColor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBtnAddColorActionPerformed

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
    private javax.swing.JButton jBtnAddCategory;
    private javax.swing.JButton jBtnAddClothes;
    private javax.swing.JButton jBtnAddColor;
    private javax.swing.JButton jBtnEditClothes;
    private javax.swing.JButton jBtnRemoveClothes;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JButton jBtnViewClothes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckConsigned;
    private javax.swing.JCheckBox jCheckNewClothing;
    private javax.swing.JComboBox<String> jComboCategory;
    private javax.swing.JComboBox<String> jComboColor;
    private javax.swing.JComboBox<String> jComboSize;
    private javax.swing.JComboBox<String> jFilterCategory;
    private javax.swing.JComboBox<String> jFilterColor;
    private javax.swing.JComboBox<String> jFilterSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelFiltros;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPeça;
    private javax.swing.JLabel jLabelTamanho;
    private javax.swing.JTabbedPane jMainTabbedPane;
    private javax.swing.JComboBox<String> jMultipleFilters;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelFilters;
    private javax.swing.JPanel jPanelMainScreen;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTableClothes;
    private javax.swing.JTextField jTextFilterByName;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelConsigned;
    private javax.swing.JLabel labelCustomerName;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNewClothing;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelSize;
    private javax.swing.JPanel optionsPane;
    private javax.swing.JPanel panelCards;
    private javax.swing.JTextField textCustomerName;
    private javax.swing.JTextField textDescription;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPrice;
    private javax.swing.JPanel viewClothing;
    private javax.swing.JPanel viewNewClothing;
    // End of variables declaration//GEN-END:variables
}
