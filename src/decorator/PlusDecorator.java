package decorator;

import phone.Phone;

public class PlusDecorator extends PhoneDecorator {
    public PlusDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
        setExtraPackage(ExtraPackage.PLUS);
        setAccessories();
    }

    @Override
    public void setAccessories() {
        setMemory(decoratedPhone.getMemory()+1);
        setStorage(decoratedPhone.getStorage()+3);
        setAccessories(decoratedPhone.getAccessories()+7000);
        setDisplay("OLED");
    }

}
