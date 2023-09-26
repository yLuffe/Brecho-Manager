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

public class CategoryFilter {

    private List<String> availableCategories;

    public CategoryFilter() {
        availableCategories = new ArrayList<>();
        loadAvailableCategories();
    }

    // Método para carregar categorias disponíveis do arquivo
    private void loadAvailableCategories() {
        availableCategories.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Resources/filter_categories.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                availableCategories.add(line);
            }
            // Se "Todas" estiver na lista, remova-a temporariamente e depois adicione-a de volta
            boolean containsTodas = availableCategories.remove("Todas");
            Collections.sort(availableCategories);
            if (containsTodas) {
                availableCategories.add(0, "Todas");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Obter categorias disponíveis
    public List<String> getAvailableCategories() {
        return availableCategories;
    }

    // Adicionar nova categoria
    public void addCategory(String category) throws Exception {
        if (category == null || category.length() <= 3 || category.isBlank()) {
            throw new Exception("Valor inserido é inválido");
        } else {
            category = formatString(category);
            int option = JOptionPane.showConfirmDialog(null, "Deseja adicionar o filtro " + category + " ?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                availableCategories.add(category);
                writeCategoryToFile(category);
                JOptionPane.showMessageDialog(null, "Filtro adicionado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    // Salvar nova categoria no arquivo
    private void writeCategoryToFile(String category) {
        try (FileWriter writer = new FileWriter("src/Resources/filter_categories.txt", true)) {
            writer.write(category);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
