package decorator;

import decorator.ExtraPackage;
import decorator.PhoneDecorator;
import phone.Phone;

public class PremiumDecorator extends PhoneDecorator {
    public PremiumDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
        setExtraPackage(ExtraPackage.PREMIUM);
        setAccessories();
    }

    @Override
    public void setAccessories() {
        setMemory(decoratedPhone.getMemory() + 2);
        setStorage(decoratedPhone.getStorage() + 4);
        setAccessories(decoratedPhone.getAccessories() + 8000);
        setDisplay("AMOLED");
    }
}
