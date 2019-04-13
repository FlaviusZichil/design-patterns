package phone;


public class FlipPhone extends Phone {

    public FlipPhone(int id, int price, Brand brand, String model, Color color, int storage, int memory, String display) {
        super(price, brand, model, color, storage, memory, display);
        setAccessories();
    }

    public FlipPhone() {
        setAccessories();
    }

    @Override
    public PhoneType type() {
        return PhoneType.FLIPPHONE;
    }

    @Override
    public void assemble(Color color, int memory, int storage, String display) {
        this.color=color;
        this.memory+=memory;
        this.storage+=storage;
        this.display=display;
    }

    @Override
    public void setAccessories() {
        accessories+=1500;
    }

}
