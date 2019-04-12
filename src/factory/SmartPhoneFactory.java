public class SmartPhoneFactory extends PhoneFactory {
    @Override
    Phone getPhone(int price, Brand brand, String model, Color color, int memory, int storage, String display) {
        return new SmartPhone(lastId++,price,brand,model,color,memory,storage,display);
    }
}
