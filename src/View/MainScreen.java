package View;

import Controller.ControllerClothing;
import Model.Clothing;
import Model.Filter.CategoryFilter;
import Model.Filter.ColorFilter;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MainScreen extends javax.swing.JFrame {

    CardLayout cardLayout;
    Clothing clothing;
    ControllerClothing controller;

    // Definindo Objeto de Roupa para realizar modificações
    private Clothing selectedClothing = new Clothing(-1);

    public MainScreen() {
        initComponents();
        try {
            // Controller
            this.controller = new ControllerClothing(this);
            this.controller.loadComboColors(jComboColor, jFilterColor);
            this.controller.loadComboCategories(jComboCategory, jFilterCategory);

            //  Obetém o CardLayout para alternar entre painéis
            cardLayout = (CardLayout) (panelCards.getLayout());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
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
                model.setValueAt(clothing.isConsigned() ? "Sim" : "Não", row, 7);
                model.setValueAt(clothing.isNewClothes() ? "Sim" : "Não", row, 8);
                model.setValueAt(clothing.getCustomerName(), row, 9);

            }
            // Habilita opção de ordenar tabela pelo Header e adiciona R$ em Preço
            sortTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela\n" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Adicionar filtro no Header da tabela
    private void sortTable() {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTableClothes.getModel());

        // Para a coluna de preço, adiciona R$
        for (int row = 0; row < jTableClothes.getRowCount(); row++) {
            Object value = jTableClothes.getValueAt(row, 2);
            if (value != null) {
                String formattedValue = "R$ " + value.toString();
                jTableClothes.setValueAt(formattedValue, row, 2);
            }
        }

        // Comparador numérico para colunas com número
        Comparator<Object> numericComparator = (Object obj1, Object obj2) -> {
            String str1 = obj1.toString().replaceAll("[^0-9.]", "");
            String str2 = obj2.toString().replaceAll("[^0-9.]", "");

            Double num1 = Double.valueOf(str1);
            Double num2 = Double.valueOf(str2);
            return Double.compare(num1, num2);
        };

        // Seleciona ordenas as colunas desejadas
        rowSorter.setComparator(2, numericComparator);
        rowSorter.setComparator(0, numericComparator);

        // Ordena a tabela como um todo
        jTableClothes.setRowSorter(rowSorter);
    }

    // Definir dados nos campos
    private void setFields() {
        // Texto
        textName.setText(selectedClothing.getName());
        textDescription.setText(selectedClothing.getDescription());
        textCustomerName.setText(selectedClothing.getCustomerName());
        textPrice.setText(String.valueOf(selectedClothing.getPrice()));
        // ComboBox
        jComboCategory.setSelectedItem(selectedClothing.getCategory());
        jComboColor.setSelectedItem(selectedClothing.getColor());
        jComboSize.setSelectedItem(selectedClothing.getSize());
        // CheckBox
        (selectedClothing.isConsigned() ? jCheckConsigned : jCheckNo1).setSelected(true);
        (selectedClothing.isNewClothes() ? jCheckNewClothing : jCheckNo2).setSelected(true);
    }

    // Remover dados nos campos
    public void clearFields() {
        textName.setText("");
        textDescription.setText("");
        jComboCategory.setSelectedIndex(0);
        jComboSize.setSelectedIndex(0);
        jComboColor.setSelectedIndex(0);
        textPrice.setText("");
        jCheckConsigned.setSelected(false);
        jCheckNewClothing.setSelected(false);
        jCheckNo1.setSelected(false);
        jCheckNo2.setSelected(false);
        textCustomerName.setText("");
    }

    // Limpa os Filtros
    public void updateFilters(boolean fName, boolean fComboBoxes) throws Exception {
        String name = "empty";
        String category = "Todas";
        String color = "Todas";
        String size = "Todos";

        // Define campo nome para NULL
        if (fName) {
            jTextFilterByName.setText(null);
        }
        if (!fName) {
            name = jTextFilterByName.getText();
        }

        // Define ComboBoxes para valor padrão
        JComboBox<?>[] comboBoxes = new JComboBox<?>[]{jFilterCategory, jFilterColor, jFilterSize};
        if (fComboBoxes) {
            for (JComboBox c : comboBoxes) {
                c.setSelectedIndex(0);
            }
        }
        if (!fComboBoxes) {
            category = jFilterCategory.getSelectedItem().toString();
            color = jFilterColor.getSelectedItem().toString();
            size = jFilterSize.getSelectedItem().toString();
        }

        updateTable(controller.listClothes(name, category, color, size));
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
        jBtnSearchName = new javax.swing.JButton();
        jLabelTamanho = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jBtnSearchFilters = new javax.swing.JButton();
        jBtnReloadTable = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPanel = new javax.swing.JScrollPane();
        jTableClothes = new javax.swing.JTable();
        viewNewClothing = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTitle = new javax.swing.JLabel();
        jBtnAddClothing = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textName = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        textDescription = new javax.swing.JTextField();
        labelDescription = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        labelPrice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboCategory = new javax.swing.JComboBox<>();
        labelCategory = new javax.swing.JLabel();
        jBtnAddCategory = new javax.swing.JButton();
        jComboColor = new javax.swing.JComboBox<>();
        labelColor = new javax.swing.JLabel();
        jBtnAddColor = new javax.swing.JButton();
        jComboSize = new javax.swing.JComboBox<>();
        labelSize = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckNewClothing = new javax.swing.JCheckBox();
        labelNewClothing = new javax.swing.JLabel();
        jCheckConsigned = new javax.swing.JCheckBox();
        labelConsigned = new javax.swing.JLabel();
        textCustomerName = new javax.swing.JTextField();
        labelCustomerName = new javax.swing.JLabel();
        jCheckNo1 = new javax.swing.JCheckBox();
        jCheckNo2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setEnabled(false);

        optionsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        optionsPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        optionsPane.setPreferredSize(new java.awt.Dimension(240, 603));

        jBtnViewClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnViewClothes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/eye_icon_172481.png"))); // NOI18N
        jBtnViewClothes.setToolTipText("Visualizar");
        jBtnViewClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnViewClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewClothesActionPerformed(evt);
            }
        });

        jBtnAddClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnAddClothes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/plus_icon_172261.png"))); // NOI18N
        jBtnAddClothes.setToolTipText("Adicionar");
        jBtnAddClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAddClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddClothesActionPerformed(evt);
            }
        });

        jBtnEditClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnEditClothes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/pen_icon_172275.png"))); // NOI18N
        jBtnEditClothes.setToolTipText("Editar");
        jBtnEditClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnEditClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditClothesActionPerformed(evt);
            }
        });

        jBtnRemoveClothes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jBtnRemoveClothes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/trash_icon_172142.png"))); // NOI18N
        jBtnRemoveClothes.setToolTipText("Deletar");
        jBtnRemoveClothes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRemoveClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoveClothesActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/loglogo-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout optionsPaneLayout = new javax.swing.GroupLayout(optionsPane);
        optionsPane.setLayout(optionsPaneLayout);
        optionsPaneLayout.setHorizontalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtnViewClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRemoveClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        optionsPaneLayout.setVerticalGroup(
            optionsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
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

        jTextFilterByName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFilterByNameKeyPressed(evt);
            }
        });

        jLabelCategoria.setText("Categoria:");

        jFilterSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60", "PP", "P", "M", "G", "GG", "XG", "G1", "G2", "G3", "G4" }));

        jBtnSearchName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBtnSearchName.setText("🔎");
        jBtnSearchName.setToolTipText("Procurar por Nome");
        jBtnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchNameActionPerformed(evt);
            }
        });
        jBtnSearchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnSearchNameKeyPressed(evt);
            }
        });

        jLabelTamanho.setText("Tamanho:");

        jLabelCor.setText("Cor:");

        jBtnSearchFilters.setText("🔎");
        jBtnSearchFilters.setToolTipText("Aplicar Filtros e Procurar");
        jBtnSearchFilters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchFiltersActionPerformed(evt);
            }
        });

        jBtnReloadTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBtnReloadTable.setText("🔃");
        jBtnReloadTable.setToolTipText("Recarregar e Atualizar");
        jBtnReloadTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReloadTableActionPerformed(evt);
            }
        });

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
                .addComponent(jBtnSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnReloadTable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategoria))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCor))
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTamanho)
                    .addGroup(jPanelFiltersLayout.createSequentialGroup()
                        .addComponent(jFilterSize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSearchFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanelFiltersLayout.setVerticalGroup(
            jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeça)
                    .addComponent(jLabelCategoria)
                    .addComponent(jLabelTamanho)
                    .addComponent(jLabelCor))
                .addGap(3, 3, 3)
                .addGroup(jPanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtnSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFilterByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilterSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSearchFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReloadTable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTableClothes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jTableClothes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClothesMouseClicked(evt);
            }
        });
        jScrollPanel.setViewportView(jTableClothes);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);

        TableColumnModel columnModel = jTableClothes.getColumnModel();
        columnModel.getColumn(0).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);
        columnModel.getColumn(4).setCellRenderer(centerRenderer);
        columnModel.getColumn(5).setCellRenderer(centerRenderer);
        columnModel.getColumn(6).setCellRenderer(centerRenderer);
        columnModel.getColumn(7).setCellRenderer(centerRenderer);
        columnModel.getColumn(8).setCellRenderer(centerRenderer);
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

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitle.setText("Cadastrar Peça");

        jBtnAddClothing.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jBtnAddClothing.setText("✔");
        jBtnAddClothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddClothingActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("✖");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        labelName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelName.setText("Nome");

        textDescription.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        labelDescription.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDescription.setText("Descrição");

        textPrice.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        labelPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPrice.setText("Preço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDescription)
                    .addComponent(textName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescription)
                            .addComponent(labelName)
                            .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPrice))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelName)
                .addGap(5, 5, 5)
                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelDescription)
                .addGap(5, 5, 5)
                .addComponent(textDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelPrice)
                .addGap(5, 5, 5)
                .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jComboCategory.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jComboCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelCategory.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCategory.setText("Categoria");

        jBtnAddCategory.setText("➕");
        jBtnAddCategory.setToolTipText("Adicionar Nova Categoria");
        jBtnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddCategoryActionPerformed(evt);
            }
        });

        jComboColor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jComboColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelColor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelColor.setText("Cor");

        jBtnAddColor.setText("➕");
        jBtnAddColor.setToolTipText("Adicionar Nova Cor");
        jBtnAddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddColorActionPerformed(evt);
            }
        });

        jComboSize.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jComboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60", "PP", "P", "M", "G", "GG", "XG", "G1", "G2", "G3", "G4" }));
        jComboSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelSize.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelSize.setText("Tamanho");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor)
                    .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCategory)
                    .addComponent(jComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSize))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jBtnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelCategory)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(labelColor)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtnAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(labelSize)
                .addGap(5, 5, 5)
                .addComponent(jComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jCheckNewClothing.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCheckNewClothing.setText("Sim");
        jCheckNewClothing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckNewClothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckNewClothingActionPerformed(evt);
            }
        });

        labelNewClothing.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelNewClothing.setText("Roupa Nova");

        jCheckConsigned.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCheckConsigned.setText("Sim");
        jCheckConsigned.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckConsigned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckConsignedActionPerformed(evt);
            }
        });

        labelConsigned.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelConsigned.setText("Consignação");

        textCustomerName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textCustomerName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCustomerNameActionPerformed(evt);
            }
        });

        labelCustomerName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCustomerName.setText("Nome da Cliente");

        jCheckNo1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCheckNo1.setText("Não");
        jCheckNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckNo1ActionPerformed(evt);
            }
        });

        jCheckNo2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCheckNo2.setText("Não");
        jCheckNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckNo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCustomerName)
                    .addComponent(textCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckConsigned)
                        .addGap(8, 8, 8)
                        .addComponent(jCheckNo1))
                    .addComponent(labelConsigned))
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckNewClothing)
                        .addGap(8, 8, 8)
                        .addComponent(jCheckNo2))
                    .addComponent(labelNewClothing))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCustomerName)
                    .addComponent(labelConsigned)
                    .addComponent(labelNewClothing))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCheckNo2)
                    .addComponent(jCheckNewClothing)
                    .addComponent(jCheckNo1)
                    .addComponent(jCheckConsigned)
                    .addComponent(textCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Peça");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Detalhes da Peça");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Informações da Cliente");

        javax.swing.GroupLayout viewNewClothingLayout = new javax.swing.GroupLayout(viewNewClothing);
        viewNewClothing.setLayout(viewNewClothingLayout);
        viewNewClothingLayout.setHorizontalGroup(
            viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jBtnAddClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20))
        );
        viewNewClothingLayout.setVerticalGroup(
            viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewNewClothingLayout.createSequentialGroup()
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewNewClothingLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnAddClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewNewClothingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(viewNewClothingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        panelCards.add(viewNewClothing, "cardAdd");

        jSplitPane1.setRightComponent(panelCards);

        javax.swing.GroupLayout jPanelMainScreenLayout = new javax.swing.GroupLayout(jPanelMainScreen);
        jPanelMainScreen.setLayout(jPanelMainScreenLayout);
        jPanelMainScreenLayout.setHorizontalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE)
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
            .addGap(0, 1362, Short.MAX_VALUE)
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
        try {
            if (selectedClothing.getId() != -1) {
                int option = JOptionPane.showConfirmDialog(null, "Deseja excluir o item " + selectedClothing.getName() + " ?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    controller.deleteClothing(selectedClothing.getId());
                }
            }
            selectedClothing.setId(-1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBtnRemoveClothesActionPerformed

    private void jBtnViewClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewClothesActionPerformed
        cardLayout.show(panelCards, "cardView");
        clearFields();
        selectedClothing.setId(-1);
    }//GEN-LAST:event_jBtnViewClothesActionPerformed

    private void jBtnAddClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddClothesActionPerformed
        cardLayout.show(panelCards, "cardAdd");
        jLabelTitle.setText("Cadastrar Peça");
        clearFields();
        selectedClothing.setId(-1);
    }//GEN-LAST:event_jBtnAddClothesActionPerformed

    private void jBtnEditClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditClothesActionPerformed
        if (selectedClothing.getId() != -1) {
            try {
                // Comandos da tela
                cardLayout.show(panelCards, "cardAdd");
                jLabelTitle.setText("Editar Peça");
                setFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        }
    }//GEN-LAST:event_jBtnEditClothesActionPerformed

    private void textCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCustomerNameActionPerformed

    }//GEN-LAST:event_textCustomerNameActionPerformed

    private void jBtnAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddColorActionPerformed

        try {
            String newColor = JOptionPane.showInputDialog(null, "Digite o nome do novo filtro:", "Input", JOptionPane.INFORMATION_MESSAGE);
            new ColorFilter().addColor(newColor);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } finally {
            controller.loadComboColors(jComboColor, jFilterColor);
        }
    }//GEN-LAST:event_jBtnAddColorActionPerformed

    private void jBtnAddClothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddClothingActionPerformed
        try {
            // Cria objeto de Roupa
            clothing = new Clothing(
                    (String) textName.getText(),
                    (String) textDescription.getText(),
                    (String) jComboCategory.getSelectedItem(),
                    (String) jComboSize.getSelectedItem(),
                    (String) jComboColor.getSelectedItem(),
                    (Double) Double.parseDouble(textPrice.getText()),
                    (Boolean) jCheckConsigned.isSelected(),
                    (Boolean) jCheckNewClothing.isSelected(),
                    (String) textCustomerName.getText()
            );
            // Verifica se valores são válidos
            clothing.clothingValidation();

            // Adiciona ao Banco de Dados
            int clothingId = selectedClothing.getId();

            if (clothingId == -1) {
                controller.createClothing(clothing);
            } else /*if (clothingId != -1)*/ {
                // Edita a peça
                clothing.setId(clothingId);
                controller.editClothing(clothing);
                // Abre tela inicial
                cardLayout.show(panelCards, "cardView");

            }
            JOptionPane.showMessageDialog(null, "Peça " + (clothingId == -1 ? "adicionada" : "editada") + " com sucesso", "Sucessso!", JOptionPane.INFORMATION_MESSAGE);

            // Limpa os Campos
            clearFields();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBtnAddClothingActionPerformed

    private void jBtnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddCategoryActionPerformed
        String newCategory = JOptionPane.showInputDialog(null, "Digite o nome do novo filtro:", "Input", JOptionPane.INFORMATION_MESSAGE);
        try {
            new CategoryFilter().addCategory(newCategory);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } finally {
            controller.loadComboCategories(jComboCategory, jFilterCategory);
        }
    }//GEN-LAST:event_jBtnAddCategoryActionPerformed

    private void jCheckNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckNo1ActionPerformed

        jCheckConsigned.setSelected(false);

    }//GEN-LAST:event_jCheckNo1ActionPerformed

    private void jCheckConsignedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckConsignedActionPerformed
        jCheckNo1.setSelected(false);
    }//GEN-LAST:event_jCheckConsignedActionPerformed

    private void jCheckNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckNo2ActionPerformed
        jCheckNewClothing.setSelected(false);
    }//GEN-LAST:event_jCheckNo2ActionPerformed

    private void jCheckNewClothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckNewClothingActionPerformed
        jCheckNo2.setSelected(false);
    }//GEN-LAST:event_jCheckNewClothingActionPerformed

    private void jTableClothesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClothesMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) jTableClothes.getModel();
            int selectedRow = jTableClothes.getSelectedRow();

            if (selectedRow >= 0) {
                this.selectedClothing = controller.findClothingById((int) model.getValueAt(selectedRow, 0));
            }
            if (evt.getClickCount() == 2) {
                // Double Click abre página de edição
                cardLayout.show(panelCards, "cardAdd");
                jLabelTitle.setText("Editar Peça");
                setFields();
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTableClothesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Deseja mesmo cancelar?\nDados não salvos serão perdidos!", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            cardLayout.show(panelCards, "cardView");
            selectedClothing.setId(-1);
            clearFields();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBtnSearchFiltersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchFiltersActionPerformed
        try {
            updateFilters(true, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBtnSearchFiltersActionPerformed

    private void jBtnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchNameActionPerformed
        try {
            updateFilters(false, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBtnSearchNameActionPerformed

    private void jBtnSearchNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnSearchNameKeyPressed

    }//GEN-LAST:event_jBtnSearchNameKeyPressed

    private void jTextFilterByNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFilterByNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jBtnSearchName.doClick();
        }
    }//GEN-LAST:event_jTextFilterByNameKeyPressed

    private void jBtnReloadTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReloadTableActionPerformed
        try {
            updateFilters(true, true);
            updateTable(controller.listClothes());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jBtnReloadTableActionPerformed

    public static void main(String args[]) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddCategory;
    private javax.swing.JButton jBtnAddClothes;
    private javax.swing.JButton jBtnAddClothing;
    private javax.swing.JButton jBtnAddColor;
    private javax.swing.JButton jBtnEditClothes;
    private javax.swing.JButton jBtnReloadTable;
    private javax.swing.JButton jBtnRemoveClothes;
    private javax.swing.JButton jBtnSearchFilters;
    private javax.swing.JButton jBtnSearchName;
    private javax.swing.JButton jBtnViewClothes;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckConsigned;
    private javax.swing.JCheckBox jCheckNewClothing;
    private javax.swing.JCheckBox jCheckNo1;
    private javax.swing.JCheckBox jCheckNo2;
    private javax.swing.JComboBox<String> jComboCategory;
    private javax.swing.JComboBox<String> jComboColor;
    private javax.swing.JComboBox<String> jComboSize;
    private javax.swing.JComboBox<String> jFilterCategory;
    private javax.swing.JComboBox<String> jFilterColor;
    private javax.swing.JComboBox<String> jFilterSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPeça;
    private javax.swing.JLabel jLabelTamanho;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTabbedPane jMainTabbedPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
