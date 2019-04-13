package decorator;

import phone.Brand;
import phone.Color;

public interface IPhone {
    void assemble(int price, Brand brand,String model,int storage,int memory,Color color, String display);
    void setAccessories();
}
