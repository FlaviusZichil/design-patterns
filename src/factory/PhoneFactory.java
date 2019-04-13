package factory;

import phone.Brand;
import phone.Color;
import phone.Phone;

public abstract class PhoneFactory extends Phone {
    static int  lastId = 0;
    abstract Phone getPhone(int price, Brand brand, String model, Color color, int memory, int storage, String display);
}
