package Model;

import static Util.StringUtil.formatString;

public class Clothing {

    // Clothing Attributes
    private int id;
    private String name;
    private String description;
    private String category;
    private String size;
    private String color;
    private double price;
    private boolean consigned;
    private boolean newClothes;
    private String customerName;

    // Validação
    public void clothingValidation() throws IllegalArgumentException {
        // Validação Nome
        if (this.name == null || this.name.isBlank() || this.name.length() <= 3) {
            throw new IllegalArgumentException("Insira um nome válido para a roupa!");
        }
        this.name = formatString(this.name);

        // Validação Descrição
        if (this.description.trim().length() > 0 && this.description.trim().length() <= 3) {
            throw new IllegalArgumentException("Descrição deve ser nula ou ter mais que três caracteres!");
        }
        this.description = formatString(this.description);

        // Validação Categoria
        if (this.category.equals("Todas")) {
            throw new IllegalArgumentException("Insira uma categoria para roupa!");
        }

        // Validação Tamanho
        if (this.size.equals("Todos")) {
            throw new IllegalArgumentException("Insira um tamanho para roupa!");
        }

        // Validação Cor
        if (this.color.equals("Todas")) {
            throw new IllegalArgumentException("Insira uma cor para roupa!");
        }

        // Validação Preço
        if (this.price == 0.0) {
            throw new IllegalArgumentException("Insira um valor para roupa!");
        }

        // Validação Nome da Cliente
        if (this.customerName.trim().length() > 0 && this.customerName.trim().length() <= 3) {
            throw new IllegalArgumentException("Nome da cliente deve ser nulo ou ter mais que três caracteres!");
        }
        this.customerName = formatString(this.customerName);
    }

    // Construtor Vazio
    public Clothing() {
    }

    // Construtor sem ID
    public Clothing(String name, String description, String category, String size, String color, double price, boolean consigned, boolean newClothes, String customerName) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.size = size;
        this.color = color;
        this.price = price;
        this.consigned = consigned;
        this.newClothes = newClothes;
        this.customerName = customerName;
    }

    // Construtor Completo
    public Clothing(int id, String name, String description, String category, String size, String color, double price, boolean consigned, boolean newClothes, String customerName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.size = size;
        this.color = color;
        this.price = price;
        this.consigned = consigned;
        this.newClothes = newClothes;
        this.customerName = customerName;
    }

    // Getters And Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isConsigned() {
        return consigned;
    }

    public void setConsigned(boolean consigned) {
        this.consigned = consigned;
    }

    public boolean isNewClothes() {
        return newClothes;
    }

    public void setNewClothes(boolean newClothes) {
        this.newClothes = newClothes;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // toString
    @Override
    public String toString() {
        return "Nome: " + name + "\n"
                + "Descrição: " + description + "\n"
                + "Categoria: " + category + "\n"
                + "Tamanho: " + size + "\n"
                + "Cor: " + color + "\n"
                + "Preço: " + price + "\n"
                + "Consignado: " + consigned + "\n"
                + "Roupas Novas: " + newClothes + "\n"
                + "Nome do Cliente: " + customerName + "\n";
    }
}
