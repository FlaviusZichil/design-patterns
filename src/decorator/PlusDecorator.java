public class PlusDecorator extends PhoneDecorator {
    public PlusDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
        extraPackage=ExtraPackage.PLUS;
        setAccessories();
    }

    @Override
    public void setAccessories() {
        this.memory+=1;
        this.storage+=3;
        this.accessories+=7000;
        this.display="OLED";
    }

}
