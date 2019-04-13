
public class FlipPhone extends Phone {

    public FlipPhone(int id, int price, Brand brand, String model, String color) {
        super(id, price, brand, model, color);
    }

    @Override
    public PhoneType type() {
        return PhoneType.FLIPPHONE;
    }
}
