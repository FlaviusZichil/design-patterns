public class Program {
    public static void main(String [] args){
        ClassicPhoneFactory classicPhone=new ClassicPhoneFactory();
        Phone phone=classicPhone.getPhone(2500,Brand.LENOVO,"P11",Color.BLACK,4,16,"LDC");
        PhoneDecorator phoneDecorator = new PhoneDecorator(phone);
        System.out.println(phone.toString());
        System.out.println("Initial assemble with normal package: ");
        phoneDecorator.assemble(Color.GOLD,3,32,"LCD");
        System.out.println(phoneDecorator.toString());
        System.out.println("Assemble with plus package: ");
        PlusDecorator plusDecorator=new PlusDecorator(phoneDecorator);
        System.out.println(plusDecorator.toString());
        PremiumDecorator premiumDecorator=new PremiumDecorator(phoneDecorator);
        System.out.println("Assemble with premium package");
        System.out.println(premiumDecorator.toString());
    }
}
