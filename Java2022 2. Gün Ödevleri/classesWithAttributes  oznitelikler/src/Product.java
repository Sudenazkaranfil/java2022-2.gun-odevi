public class Product {
    public Product (int id, String name, String description, double price, int stockAmount, String color) {
        System.out.println("Constructor block worked.");
        this.id =id;
        this.color = color;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }
    public Product() {

    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String code;

    //getter
    public int getId() {
        return id;
    }
    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public double getprice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmound() {
        return getStockAmount();
    }

    public void setstockAmound(int stockAmound) {
        this.setStockAmount(getStockAmount());
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getcode() {
           return this.name.substring(0,1) + getId();
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCode() {
        return this.name.substring(0,1) + getId();
    }

    public void setCode(String code) {
        this.code = code;
    }
}
