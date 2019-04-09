

public abstract class PhoneFactory {
    static int  lastId = 0;
    abstract Phone getPhone(int price,Brand brand, String model, String color);
}
