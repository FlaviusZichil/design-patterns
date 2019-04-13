package decorator;

import phone.Brand;
import phone.Color;
import phone.Phone;

public class PhoneDecorator extends Phone implements IPhone {
    public Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
    }


    @Override
    public void assemble(int price, Brand brand, String model, int storage, int memory, Color color, String display) {
        setExtraPackage(ExtraPackage.NORMAL);
        decoratedPhone.assemble(price, brand, model, storage, memory, color, display);
        initPhoneDecoratorFields();
    }

    public void setAccessories() {
        decoratedPhone.setAccessories();
    }

    @Override
    public String toString() {
        return decoratedPhone.toString();
//        return "Assemble with -->" + " Storage: " + getStorage() + " Memory: " + getMemory() +
//                " Package: " + getExtraPackage() + " Value of accessories: " + getAccessories() + " Display: " + getDisplay();
    }

    public void initPhoneDecoratorFields() {
        setColor(decoratedPhone.getColor());
        setDisplay(decoratedPhone.getDisplay());
        setBrand(decoratedPhone.getBrand());
        setPrice(decoratedPhone.getPrice());
        setMemory(decoratedPhone.getMemory());
        setStorage(decoratedPhone.getStorage());
        setAccessories(decoratedPhone.getAccessories());
    }
}
