package Model.Filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.write;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoryFilter {
    
    private List<String> avaiableCategories;
    
    public CategoryFilter() {
        avaiableCategories = new ArrayList<>();
        loadAvaiableCategories();
    }

    // Método para carregar categorias disponíveis do arquivo
    private void loadAvaiableCategories() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Resources/filter_categories.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                avaiableCategories.add(line);
            }
            Collections.sort(avaiableCategories.subList(1, avaiableCategories.size()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Obter categorias disponíveis
    public List<String> getAvaibleCategories() {
        return avaiableCategories;
    }

    // Adicionar nova categoria
    public void addCategory(String category) {
        avaiableCategories.add(category);
        writeCategoryToFile(category);
    }

    // Salvar nova categoria no arquivo
    private void writeCategoryToFile(String category) {
        try (FileWriter writer = new FileWriter("src/Resources/filter_categories.txt")) {
            writer.write(category);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
