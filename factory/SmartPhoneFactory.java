public class SmartPhoneFactory extends PhoneFactory {
    @Override
    Phone getPhone(int price, Brand brand, String model, String color) {
        return new SmartPhone(lastId++,price,brand,model,color);
    }
}
