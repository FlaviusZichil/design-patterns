package main;

import client.Client;
import decorator.PhoneDecorator;
import decorator.PlusDecorator;
import decorator.PremiumDecorator;
import employee.BuyEmployee;
import employee.Employee;
import employee.QuestionEmployee;
import employee.RepairEmployee;
import factory.ClassicPhoneFactory;
import factory.FlipPhoneFactory;
import factory.SmartPhoneFactory;
import phone.Brand;
import phone.ClassicPhone;
import phone.Color;
import phone.Phone;
import request.RequestType;
import request.RequestsQueue;

import java.util.Scanner;

public class Program {

    public void manufacturerOption(Scanner sc) {
        int myOption;
        Phone phone=null;
        System.out.println("1.Create phone \n2.Decorate phone");
        myOption=sc.nextInt();
        switch (myOption) {
            case 1:
                System.out.println("1.ClassicPhone \n2.FlipPhone\n3.SmartPhone\n");
                myOption=sc.nextInt();
                phone=selectAndCreatePhone(myOption,sc);
                break;
            case 2:
                System.out.println("Decorate your phone with: ");
                System.out.println("1.ClassicPhone \n2.FlipPhone\n3.SmartPhone\n");
                myOption=sc.nextInt();
                phone=selectAndCreatePhone(myOption,sc);
                System.out.println("1.Plus package \n 2.Premium package\n 3. All packages");
                PhoneDecorator phoneDecorator=null;
                int optionDecoratePhone=sc.nextInt();
                switch (optionDecoratePhone){
                    case 1:
                        phoneDecorator=decorateWithPlusPackage(phone);
                        break;
                    case 2:
                        phoneDecorator=decorateWithPremiumPackage(phone);
                        break;
                    case 3:
                        phoneDecorator=decorateWithPlusPackage(phone);
                        phoneDecorator=decorateWithPremiumPackage(phone);
                        break;
                }
                break;
        }

    }
    public Phone selectAndCreatePhone(int option,Scanner sc){
        Phone phone=null;
        switch (option) {
            case 1:
                phone=readPhoneSpecification(1,sc);
                System.out.println(phone.toString());
                break;
            case 2:
                phone=readPhoneSpecification(2,sc);
                System.out.println(phone.toString());
                break;
            case 3:
                phone=readPhoneSpecification(3,sc);
                System.out.println(phone.toString());
                break;
        }
        return phone;

    }
    public PhoneDecorator decorateWithPlusPackage (Phone decoratedPhone){
        System.out.println("Your benefits: + 1 RAM memory, + 3GB , + OLED display, + 7000 accessories");
        PlusDecorator plusDecorator=new PlusDecorator(decoratedPhone);
        System.out.println("Assemble with plus package: ");
        System.out.println(plusDecorator.toString());
        return plusDecorator;
    }
    public PhoneDecorator decorateWithPremiumPackage(Phone decoratedPhone){
        System.out.println("Your benefits: + 2 RAM memory, + 4GB , + AMOLED display, + 8000 accessories");
        PremiumDecorator premiumDecorator=new PremiumDecorator(decoratedPhone);
        System.out.println("Assemble with premium package: ");
        System.out.println(premiumDecorator.toString());
        return premiumDecorator;
    }
    public Phone readPhoneSpecification(int optionPhoneType,Scanner sc) {
        System.out.println("Brand: ");
        Brand brand;
        System.out.println("1." + Brand.LENOVO + "\n2. " + Brand.ASUS + "\n3." + Brand.HUAWEI + "\n4. " + Brand.SAMSUNG);
        int myOption = sc.nextInt();
        switch (myOption) {
            case 1:
                brand = Brand.LENOVO;
                break;
            case 2:
                brand = Brand.ASUS;
                break;
            case 3:
                brand = Brand.HUAWEI;
                break;
            case 4:
                brand = Brand.SAMSUNG;
                break;
            default:
                brand = null;
        }
        System.out.println("Model: ");
        String model = sc.next();
        System.out.println("Color: ");
        Color color;
        System.out.println("1." + Color.BLACK + "\n2. " + Color.GOLD + "\n3." + Color.SILVER + "\n4. " + Color.WHITE);
        myOption=sc.nextInt();
        switch (myOption) {
            case 1:
                color = Color.BLACK;
                break;
            case 2:
                color = Color.GOLD;
                break;
            case 3:
                color = Color.SILVER;
                break;
            case 4:
                color = Color.WHITE;
                break;
            default:
                color = null;
        }
        System.out.println("Display: ");
        String display = sc.next();
        System.out.println("Memory: ");
        int memory = sc.nextInt();
        System.out.println("Storage: ");
        int storage = sc.nextInt();
        System.out.println("Price: ");
        int price = sc.nextInt();
        switch (optionPhoneType) {
            case 1:
                ClassicPhoneFactory classicPhoneFactory = new ClassicPhoneFactory();
                Phone classicPhone = classicPhoneFactory.getPhone(price, brand, model, color, memory, storage, display);
                return classicPhone;
            case 2:
                FlipPhoneFactory flipPhoneFactory = new FlipPhoneFactory();
                Phone flipPhone = flipPhoneFactory.getPhone(price, brand, model, color, memory, storage, display);
                return flipPhone;
            case 3:
                SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
                Phone smartPhone = smartPhoneFactory.getPhone(price, brand, model, color, memory, storage, display);
                return smartPhone;
            default:
                return null;
        }


    }

    public static void main(String [] args) {

        System.out.println("============================================");
        System.out.println("EMPLOYEE");
        System.out.println("============================================");

        Client client = new Client("Fla", "Zic", "0526698785");
        client.sendRequest("request1", "phone1", RequestType.REPAIR);

        Employee questionEmployee = new QuestionEmployee();
        Employee repairEmployee = new RepairEmployee();
        Employee buyEmployee = new BuyEmployee();

        questionEmployee.setNextEmployee(repairEmployee);
        repairEmployee.setNextEmployee(buyEmployee);

        questionEmployee.verifyCompatibility(RequestsQueue.getOldestRequest());
    }
}
