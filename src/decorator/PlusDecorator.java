package decorator;

import phone.Phone;

public class PlusDecorator extends decorator.PhoneDecorator {
    public PlusDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
        setExtraPackage(ExtraPackage.PLUS);
        setAccessories();
        initPhoneDecoratorFields();
    }

    @Override
    public void setAccessories() {
        decoratedPhone.setMemory(decoratedPhone.getMemory()+1);
        decoratedPhone .setStorage(decoratedPhone.getStorage()+3);
        decoratedPhone.setAccessories(decoratedPhone.getAccessories()+7000);
        decoratedPhone.setExtraPackage(ExtraPackage.PLUS);
        decoratedPhone.setDisplay("OLED");
    }

}
