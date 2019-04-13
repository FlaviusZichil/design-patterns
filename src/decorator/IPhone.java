package decorator;

import phone.Color;

public interface IPhone {
    void assemble(Color color, int memory, int storage, String display);
    void setAccessories();
}
