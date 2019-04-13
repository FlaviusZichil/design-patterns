package decorator;

import phone.Phone;

public class PremiumDecorator extends PhoneDecorator {
    public PremiumDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
        setExtraPackage(ExtraPackage.PREMIUM);
        setAccessories();
        initPhoneDecoratorFields();
    }

    @Override
    public void setAccessories() {
        decoratedPhone.setMemory(decoratedPhone.getMemory()+2);
        decoratedPhone.setStorage(decoratedPhone.getStorage()+4);
        decoratedPhone.setAccessories(decoratedPhone.getAccessories()+8000);
        decoratedPhone.setExtraPackage(ExtraPackage.PREMIUM);
        decoratedPhone.setDisplay("AMOLED");
    }
}
