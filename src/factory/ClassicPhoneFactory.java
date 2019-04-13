
public class ClassicPhoneFactory extends PhoneFactory {
    @Override
    public Phone getPhone(int price, Brand brand, String model, Color color, int memory, int storage, String display) {
        lastId++;
        return new ClassicPhone(lastId,price,brand,model,color,memory,storage,display);
    }

    @Override
    public void setAccessories() {

    }
}
