

public class ClassicPhone extends Phone {

    public ClassicPhone(int id, int price, Brand brand, String model, String color) {
        super(id, price, brand, model, color);
    }

    @Override
    public PhoneType type() {
        return PhoneType.CLASSICPHONE;
    }
}
