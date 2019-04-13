package phone;

public class SmartPhone  extends Phone {

    public SmartPhone(int id, int price, Brand brand, String model, Color color, int storage, int memory, String display) {
        super(id,price, brand, model, color, storage, memory, display);
        setAccessories();
    }

    public SmartPhone() {
        setAccessories();
    }

    @Override
    public PhoneType type() {
        return PhoneType.SMARTPHONE;
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
        this.setAccessories(this.getAccessories()+2000);
    }

}
