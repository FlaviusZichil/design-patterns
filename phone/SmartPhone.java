public class SmartPhone extends Phone {

    public SmartPhone(int id, int price, Brand brand, String model, String color) {
        super(id, price, brand, model, color);
    }

    @Override
    public PhoneType type() {
        return PhoneType.SMARTPHONE;
    }
}
