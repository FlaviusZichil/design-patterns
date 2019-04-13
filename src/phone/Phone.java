
public abstract class Phone implements IPhone {
    private int id;
    private int price;
    private Brand brand;
    private String model;
    private Color color;
    private int storage;
    private int memory;
    private String display;
    private int accessories;
    private ExtraPackage extraPackage;

    @Override
    public void assemble(Color color, int memory, int storage, String display) {
        this.color = color;
        this.memory = memory;
        this.storage = storage;
        this.display = display;
    }

    @Override
    public  abstract void setAccessories() ;

    public Phone(int id, int price, Brand brand, String model, Color color, int memory, int storage, String display) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.memory = memory;
        this.display = display;
    }

    public Phone() {

    }

    PhoneType type() {
        return null;
    }

    @Override
    public String toString() {
        return "Phone specifications: "+" id: "+id+" price: "
                +price+" brand: "+brand+" model: "+model+" color: "+color+" storage: "+storage +
                " memory: "+memory+" display: "+display+" initial package: "+extraPackage+
                " value of accessories: "+accessories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getAccessories() {
        return accessories;
    }

    public void setAccessories(int accessories) {
        this.accessories = accessories;
    }

    public ExtraPackage getExtraPackage() {
        return extraPackage;
    }

    public void setExtraPackage(ExtraPackage extraPackage) {
        this.extraPackage = extraPackage;
    }
}
