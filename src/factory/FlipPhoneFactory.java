public class FlipPhoneFactory extends PhoneFactory {
    @Override
    Phone getPhone(int price, Brand brand, String model, Color color, int memory, int storage, String display) {
        return new FlipPhone(lastId++,price,brand,model,color, memory, storage,display);
    }
}
