package decorator;

import phone.Color;
import phone.Phone;

public  class PhoneDecorator extends Phone implements IPhone {
    public Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
        decoratedPhone.setPrice(decoratedPhone.getPrice());
        decoratedPhone.setBrand(decoratedPhone.getBrand());
        decoratedPhone.setModel(decoratedPhone.getModel());
        setColor(decoratedPhone.getColor());
        decoratedPhone.setStorage(decoratedPhone.getStorage());
        decoratedPhone.setMemory(decoratedPhone.getMemory());
        decoratedPhone.setDisplay(decoratedPhone.getDisplay());
        setAccessories(decoratedPhone.getAccessories());
        setExtraPackage(ExtraPackage.NORMAL);

    }

    @Override
    public void assemble(Color color, int memory, int storage, String display) {
        setColor(color);
        setMemory(decoratedPhone.getMemory() + memory);
        setStorage(decoratedPhone.getStorage() + storage);
        setDisplay(display);
        decoratedPhone.assemble(color,memory,storage,display);
    }


    public  void setAccessories(){
        decoratedPhone.setAccessories();
    }


    @Override
    public String toString() {
        return "Assemble with -->" + " Color: " + getColor() + " Storage: " + getStorage() + " Memory: " + getMemory() + " Display: " + getDisplay() +
                " Package: " + getExtraPackage() + " Value of accessories: " + getAccessories();
    }
}
