package HomeworkSession6;

public class InvoiceItem {
    private int id;
    private String description;
    private int quantity;
    private double price;

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //GETTERS
    public double getTotal() {
        return quantity * price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
