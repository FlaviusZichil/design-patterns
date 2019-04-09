public class FlipPhoneFactory extends PhoneFactory {
    @Override
    Phone getPhone(int price, Brand brand, String model, String color) {
        return new FlipPhone(lastId++,price,brand,model,color);
    }
}
