package employee;

import client.Client;
import message.Message;
import message.MessageDispacher;
import request.Request;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepairEmployee extends Employee {

    public RepairEmployee(){
        this.level = "REPAIR";
    }

    @Override
    protected void handleRequest(Request request) {
        System.out.println("Request received by a repairEmployee");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Request resolved by a repairEmployee");
        LocalDate currentDate = LocalDate.now();
        Message message = new Message("Telefonul " + request.getPhone() + " a fost reparat. Il puteti ridica de la sediul nostru.", request.getClient(), currentDate.toString());
        sendResponseToClient(message, request.getClient());
    }

    @Override
    protected void sendResponseToClient(Message message, Client client) {
        MessageDispacher.sendMessageToClient(message, client);
    }

    @Override
    public List<Employee> getSubordinates() {
        List<Employee> employeeSubordinates = new ArrayList<>();
        for(Employee subordinate : this.subordinates){
            employeeSubordinates.add(subordinate);
        }
        return employeeSubordinates;
    }
}
