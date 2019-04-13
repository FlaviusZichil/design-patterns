
public  class PhoneDecorator extends Phone implements IPhone {
    public Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone)
    {
        this.decoratedPhone = decoratedPhone;
        this.id=decoratedPhone.id;
        this.price=decoratedPhone.price;
        this.brand=decoratedPhone.brand;
        this.model=decoratedPhone.model;
        this.color=decoratedPhone.color;
        this.storage=decoratedPhone.storage;
        this.memory=decoratedPhone.memory;
        this.display=decoratedPhone.display;
        this.accessories=decoratedPhone.accessories;
        this.extraPackage=ExtraPackage.NORMAL;

    }

    @Override
    public void assemble(Color color, int memory, int storage, String display) {
        this.color=color;
        this.memory+=memory;
        this.storage+=storage;
        this.display=display;
        decoratedPhone.assemble(color,memory,storage,display);
    }


    public  void setAccessories(){
        decoratedPhone.setAccessories();
    }



    @Override
    public String toString() {
        return "Assemble with -->"+" Color: "+color+" Storage: "+storage+" Memory: "+memory+" Display: "+display+
                " Package: "+extraPackage+" Value of accessories: "+accessories;
    }
}
