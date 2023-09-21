package Model;

public class Clothing {

    // Clothing Attributes
    private int id;
    private String name;
    private String descr;
    private String category;
    private String size;
    private String color;
    private double price;
    private boolean consigned;
    private boolean newClothes;
    private String customerName;

    // Constuctor
    public Clothing() {
    }

    public Clothing(int id, String name, String descr, String category, String size, String color, double price, boolean consigned, boolean newClothes, String customerName) {
        this.id = id;
        this.name = name;
        this.descr = descr;
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

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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
                + "Descrição: " + descr + "\n"
                + "Categoria: " + category + "\n"
                + "Tamanho: " + size + "\n"
                + "Cor: " + color + "\n"
                + "Preço: " + price + "\n"
                + "Consignado: " + consigned + "\n"
                + "Roupas Novas: " + newClothes + "\n"
                + "Nome do Cliente: " + customerName + "\n";
    }
}
