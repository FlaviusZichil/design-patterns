public class ClassicPhone  extends Phone  {

    public ClassicPhone() {
        setAccessories();
    }

    public ClassicPhone(int id, int price, Brand brand, String model, Color color, int storage, int memory, String display) {
        super(price, brand, model, color, storage, memory, display);
        setAccessories();
    }

    @Override
    public PhoneType type() {
        return PhoneType.CLASSICPHONE;
    }

    @Override
    public void assemble(Color color, int memory, int storage, String display) {
        this.color=color;
        this.memory+=memory;
        this.storage+=storage;
        this.display=display;
        extraPackage=ExtraPackage.NORMAL;
    }

    @Override
    public void setAccessories() {
        accessories+=1000;
    }

}
