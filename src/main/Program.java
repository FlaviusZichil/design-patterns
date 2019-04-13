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
import phone.Brand;
import phone.Color;
import phone.Phone;
import request.RequestType;
import request.RequestsQueue;

public class Program {
    public static void main(String [] args){
        ClassicPhoneFactory classicPhone=new ClassicPhoneFactory();
        Phone phone=classicPhone.getPhone(2500, Brand.LENOVO,"P11", Color.BLACK,4,16,"LDC");
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
