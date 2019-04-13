public class SmartPhone  extends Phone {

    public SmartPhone(int id, int price, Brand brand, String model, Color color, int storage, int memory, String display) {
        super(price, brand, model, color, storage, memory, display);
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
        this.color=color;
        this.memory+=memory;
        this.storage+=storage;
        this.display=display;
    }

    @Override
    public void setAccessories() {
        accessories+=2000;
    }

}
