package factory;

import phone.Brand;
import phone.Color;
import phone.FlipPhone;
import phone.Phone;

public class FlipPhoneFactory extends PhoneFactory {
    @Override
    public Phone getPhone(int price, Brand brand, String model, Color color, int memory, int storage, String display) {
        lastId++;
        return new FlipPhone(lastId,price,brand,model,color, memory, storage,display);
    }

    @Override
    public void setAccessories() {

    }
}
