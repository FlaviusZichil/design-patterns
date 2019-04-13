public class ClassicPhone  extends Phone  {

    public ClassicPhone() {
        setAccessories();
    }

    public ClassicPhone(int id, int price, Brand brand, String model, Color color, int storage, int memory, String display) {
        super(id,price, brand, model, color, storage, memory, display);
        setAccessories();
    }

    @Override
    public PhoneType type() {
        return PhoneType.CLASSICPHONE;
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
        this.setAccessories(this.getAccessories()+1000);
    }

}