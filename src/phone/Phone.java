

public abstract class Phone implements IPhone {
    protected int id;
    protected int price;
    protected Brand brand;
    protected String model;
    protected Color color;
    protected int storage;
    protected int memory;
    protected String display;
    protected int accessories;
    protected ExtraPackage extraPackage;

    @Override
    public void assemble(Color color, int memory, int storage, String display) {
        this.color = color;
        this.memory = memory;
        this.storage = storage;
        this.display = display;
    }

    @Override
    public  void setAccessories() {
    };

    public Phone(int price, Brand brand, String model, Color color, int storage, int memory, String display) {
        this.id = 0;
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
}
