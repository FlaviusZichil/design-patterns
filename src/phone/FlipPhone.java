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
    public void setAccessories() {
        setAccessories(this.getAccessories()+1500);
    }

}
