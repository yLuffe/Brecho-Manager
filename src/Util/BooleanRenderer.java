package Util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class BooleanRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Verifica se o valor é true ou false
        boolean boolValue = (Boolean) value;

        // Cria um rótulo para exibir "Sim" ou "Não" com base no valor booleano
        JLabel label = new JLabel(boolValue ? "Sim" : "Não");

        // Define o alinhamento do rótulo como central
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Define a cor de fundo para linhas selecionadas e não selecionadas
        if (isSelected) {
            label.setBackground(table.getSelectionBackground());
            label.setForeground(table.getSelectionForeground());
        } else {
            label.setBackground(table.getBackground());
            label.setForeground(table.getForeground());
        }

        return label;
    }
}