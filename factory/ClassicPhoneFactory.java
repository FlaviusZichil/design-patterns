
public class ClassicPhoneFactory extends PhoneFactory {
    @Override
    public Phone getPhone(int price, Brand brand, String model, String color) {
        return new ClassicPhone(lastId++,price,brand,model,color);
    }
}
