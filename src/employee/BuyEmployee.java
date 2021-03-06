package employee;

import client.Client;
import message.Message;
import message.MessageDispacher;
import request.Request;
import request.RequestsQueue;
import stock.Stock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BuyEmployee extends Employee {

    public BuyEmployee(){
        this.level = "BUY";
    }

    @Override
    protected void handleRequest(Request request) {
        System.out.println("Request received by a buyEmployee");
        try {
            System.out.println("Checking stock...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Request resolved by a buyEmployee");

        if(Stock.getAvailablePhones().contains(request.getPhone())){
            Stock.getSoldPhones().add(request.getPhone());
            Stock.getAvailablePhones().remove(request.getPhone());

            LocalDate currentDate = LocalDate.now();
            Message message = new Message("Ati comandat telefonul " + request.getPhone(), request.getClient(), currentDate.toString());
            sendResponseToClient(message, request.getClient());
        }
        else{
            System.out.println("Phone out of stock!");
        }

        RequestsQueue.getResolvedRequests().add(request);
        RequestsQueue.removeRequestFromQueue(request);
    }

    @Override
    protected void sendResponseToClient(Message message, Client client) {
        MessageDispacher.sendMessageToClient(message, client);
        System.out.println("--> Message sent from buy employee to client");
        System.out.println("============================================");
    }

    @Override
    public List<Employee> getSubordinates() {
        List<Employee> employeeSubordinates = new ArrayList<>();
        for(Employee subordinate : this.subordinates){
            employeeSubordinates.add(subordinate);
            for(Employee subSubordinate : subordinate.getSubordinates()){
                employeeSubordinates.add(subSubordinate);
            }
        }
        return employeeSubordinates;
    }
}
