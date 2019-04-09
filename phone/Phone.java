

public abstract class Phone {
    private int id;
    private int price;
    private Brand brand;
    private String model;
    private String color;

    public Phone(int id, int price, Brand brand, String model, String color) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract PhoneType type();
}
