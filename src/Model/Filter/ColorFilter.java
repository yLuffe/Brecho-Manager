package Model.Filter;

import static Util.StringUtil.formatString;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ColorFilter {

    private List<String> availableColors;

    public ColorFilter() {
        availableColors = new ArrayList<>();
        loadAvailableColors();
    }

    // Método para carregar cores disponíveis do arquivo
    private void loadAvailableColors() {
        availableColors.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Resources/filter_colors.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                availableColors.add(line);
            }
            Collections.sort(availableColors.subList(1, availableColors.size()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para obter cores disponíveis
    public List<String> getAvailableColors() {
        loadAvailableColors();
        return availableColors;
    }

    // Método para adicionar uma nova cor às cores disponíveis e ao arquivo
    public void addColor(String color) throws Exception {
        if (color == null || color.length() <= 3 || color.isBlank()) {
            throw new Exception("Valor inserido é inválido.");
        } else {
            color = formatString(color);
            int option = JOptionPane.showConfirmDialog(null, "Deseja adicionar o filtro " + color + " ?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                availableColors.add(color);
                writeColorToFile(color);
                JOptionPane.showMessageDialog(null, "Filtro adicionado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    // Método para escrever uma nova cor no arquivo
    private void writeColorToFile(String color) {
        try (FileWriter writer = new FileWriter("src/Resources/filter_colors.txt", true)) {
            writer.write(color);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
