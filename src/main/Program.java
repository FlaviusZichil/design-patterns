package main;

import client.Client;
import decorator.PhoneDecorator;
import decorator.PlusDecorator;
import decorator.PremiumDecorator;
import department.Department;
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
import request.Request;
import request.RequestType;
import request.RequestsQueue;

import java.util.List;
import java.util.Scanner;

public class Program {

    private static void openManufacturerWindow(Scanner sc) {
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
    public static  Phone selectAndCreatePhone(int option,Scanner sc){
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
    public static  PhoneDecorator decorateWithPlusPackage (Phone decoratedPhone){
        System.out.println("==PLUS PACKAGE==Your benefits: + 1 RAM memory, + 3GB , + OLED display, + 7000 accessories");
        PlusDecorator plusDecorator=new PlusDecorator(decoratedPhone);
        System.out.println("Assemble with plus package: ");
        System.out.println(plusDecorator.toString());
        return plusDecorator;
    }
    public static PhoneDecorator decorateWithPremiumPackage(Phone decoratedPhone){
        System.out.println("==PREMIUM PACKAGE==Your benefits: + 2 RAM memory, + 4GB , + AMOLED display, + 8000 accessories");
        PremiumDecorator premiumDecorator=new PremiumDecorator(decoratedPhone);
        System.out.println("Assemble with premium package: ");
        System.out.println(premiumDecorator.toString());
        return premiumDecorator;
    }
    public static Phone readPhoneSpecification(int optionPhoneType,Scanner sc) {
        System.out.println("Brand: ");
        Brand brand;
        System.out.println("1." + Brand.LENOVO + "\n2." + Brand.ASUS + "\n3." + Brand.HUAWEI + "\n4." + Brand.SAMSUNG);
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
    public static void main(String [] args){
        ClassicPhoneFactory classicPhone=new ClassicPhoneFactory();
        Phone phone = classicPhone.getPhone(2500, Brand.LENOVO,"P11", Color.BLACK,4,16,"LDC");
        PhoneDecorator phoneDecorator = new PhoneDecorator(phone);
        System.out.println(phone.toString());
        System.out.println("Initial assemble with normal package: ");
        System.out.println(phoneDecorator.toString());
        System.out.println("Assemble with plus package: ");
        PlusDecorator plusDecorator=new PlusDecorator(phoneDecorator);
        System.out.println(plusDecorator.toString());
        PremiumDecorator premiumDecorator=new PremiumDecorator(phoneDecorator);
        System.out.println("Assemble with premium package");
        System.out.println(premiumDecorator.toString());

        Client client = new Client("Fla", "Zic", "0526698785");
        client.sendRequest("request1", phone, RequestType.QUESTION);
        client.sendRequest("request3", phone, RequestType.REPAIR);
        client.sendRequest("request2", phone, RequestType.BUY);

        Department questionDepartment = new Department("Question Department", RequestType.QUESTION);
        Department repairDepartment = new Department("Repair Department", RequestType.REPAIR);
        Department buyDepartment = new Department("Buy Department", RequestType.BUY);

        Employee questionEmployee = new QuestionEmployee();
        Employee questionEmployee2 = new QuestionEmployee();
        questionEmployee.setDepartment(questionDepartment);
        questionEmployee2.setDepartment(questionDepartment);

        Employee repairEmployee = new RepairEmployee();
        repairEmployee.setDepartment(repairDepartment);
        repairEmployee.addSubordinate(questionEmployee);
        repairEmployee.addSubordinate(questionEmployee2);

        Employee buyEmployee = new BuyEmployee();
        buyEmployee.setDepartment(buyDepartment);
        buyEmployee.addSubordinate(repairEmployee);

        questionEmployee.setNextEmployee(repairEmployee);
        repairEmployee.setNextEmployee(buyEmployee);


        Scanner scanner = new Scanner(System.in);
        openMainWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
    }

    public static void openMainWindow(Scanner scanner, Employee questionEmployee, Employee repairEmployee, Employee buyEmployee){
        System.out.println("Select an option: ");
        System.out.println("===============");
        System.out.println("1. Manufacturer");
        System.out.println("2. Employee");
        System.out.println("3. Client");
        System.out.println("4. Exit");
        System.out.println("===============");
        scanner = new Scanner(System.in);

        if(scanner.hasNext()){
            String option = scanner.next();

            switch (option){
                case "1":{
                    openManufacturerWindow(scanner);
                    break;
                }
                case "2":{
                    openEmployeeWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
                case "3":{
                    openClientWindow(scanner);
                    break;
                }
                case "4":{
                    return;
                }
            }
        }
    }

    private static void openClientWindow(Scanner scanner){

    }

    private static void handleRequests(Employee employee){
        List<Request> requests = RequestsQueue.getRequests();

        if(requests.size() > 0){
            for(Request request : requests){
                employee.verifyCompatibility(request);
                break;
            }
        }
        else{
            System.out.println("There are no requests!");
        }

        if(requests.size() > 0){
            handleRequests(employee);
        }
    }

    private static void getSubordinatesForEmployee(Employee employee){
        if(employee.getSubordinates() != null && employee.getSubordinates().size() > 0){
            for(Employee subordinate : employee.getSubordinates()){
                System.out.println(subordinate.toString());
            }
        }
        else{
            System.out.println("This employee has no subordinates!");
        }
    }

    private static void addDelay(Integer seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void openEmployeeWindow(Scanner scanner, Employee questionEmployee, Employee repairEmployee, Employee buyEmployee){
        System.out.println("=====================================");
        System.out.println("========      EMPLOYEE      =========");
        System.out.println("=====================================");
        System.out.println("Select an option: ");
        System.out.println("===============");
        System.out.println("1. Verify requests compatibility");
        System.out.println("2. Get pending requests");
        System.out.println("3. Get all resolved requests");
        System.out.println("4. Get all subordinates for Question Employee");
        System.out.println("5. Get all subordinates for Repair Employee");
        System.out.println("6. Get all subordinates for Buy Employee");
        System.out.println("7. Exit");
        System.out.println("===============");

        if(scanner.hasNext()){
            Integer optionEmployee = scanner.nextInt();

            switch (optionEmployee){
                case 1:{
                    handleRequests(questionEmployee);
                    addDelay(2000);
                    openEmployeeWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
                case 2:{
                    if(RequestsQueue.getRequests().size() > 0){
                        for(Request request : RequestsQueue.getRequests()){
                            System.out.println(request.toString());
                        }
                    }
                    else{
                        System.out.println("There are no requests pending!");
                    }
                    addDelay(2000);
                    openEmployeeWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
                case 3:{
                    if(RequestsQueue.getResolvedRequests().size() > 0){
                        for(Request request : RequestsQueue.getResolvedRequests()){
                            System.out.println(request.toString());
                        }
                    }
                    else{
                        System.out.println("There are no resolved requests!");
                    }
                    addDelay(2000);
                    openEmployeeWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
                case 4:{
                    getSubordinatesForEmployee(questionEmployee);
                    addDelay(2000);
                    openEmployeeWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
                case 5:{
                    getSubordinatesForEmployee(repairEmployee);
                    addDelay(2000);
                    openEmployeeWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
                case 6:{
                    getSubordinatesForEmployee(buyEmployee);
                    addDelay(2000);
                    openEmployeeWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
                case 7:{
                    openMainWindow(scanner, questionEmployee, repairEmployee, buyEmployee);
                    break;
                }
            }
        }
    }
}
