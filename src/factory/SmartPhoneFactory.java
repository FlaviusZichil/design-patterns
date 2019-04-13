package factory;

import phone.Brand;
import phone.Color;
import phone.Phone;
import phone.SmartPhone;

public class SmartPhoneFactory extends PhoneFactory {
    @Override
    Phone getPhone(int price, Brand brand, String model, Color color, int memory, int storage, String display) {
        lastId++;
        return new SmartPhone(lastId,price,brand,model,color,memory,storage,display);
    }

    @Override
    public void setAccessories() {

    }
}
