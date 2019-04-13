package phone;

public class FlipPhone extends Phone {

    public FlipPhone(int id, int price, Brand brand, String model, Color color, int storage, int memory, String display) {
        super(id,price, brand, model, color, storage, memory, display);
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
        this.setColor(color);
        this.setMemory(getMemory()+memory);
        this.setStorage(getStorage()+storage);
        this.setDisplay(display);
    }

    @Override
    public void setAccessories() {
        setAccessories(this.getAccessories()+1500);
    }

}
