public class PremiumDecorator extends PhoneDecorator {
    public PremiumDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
        extraPackage = ExtraPackage.PREMIUM;
        setAccessories();
    }

    @Override
    public void setAccessories() {
        memory += 2;
        storage += 4;
        accessories += 8000;
        display="AMOLED";
    }
}
