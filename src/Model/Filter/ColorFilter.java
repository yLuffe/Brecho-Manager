package Model.Filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ColorFilter {

    private List<String> availableColors;

    public ColorFilter() {
        availableColors = new ArrayList<>();
        loadAvailableColors();
    }

    // Método para carregar cores disponíveis do arquivo
    private void loadAvailableColors() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Resources/filter_colors.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                availableColors.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Lide com exceções de E/S aqui, como exibir uma mensagem de erro
        }
    }

    // Método para obter cores disponíveis
    public List<String> getAvailableColors() {
        return availableColors;
    }

    // Método para adicionar uma nova cor às cores disponíveis e ao arquivo
    public void addColor(String color) {
        availableColors.add(color);
        writeColorToFile(color);
    }

    // Método para escrever uma nova cor no arquivo
    private void writeColorToFile(String color) {
        try (FileWriter writer = new FileWriter("src/Resources/filter_colors.txt", true)) {
            writer.write(color);
            writer.write("\n"); // Adiciona uma nova linha
        } catch (IOException e) {
            e.printStackTrace();
            // Lide com exceções de E/S aqui, como exibir uma mensagem de erro
        }
    }
}
