package employee;

import client.Client;
import message.Message;
import message.MessageDispacher;
import request.Request;

import java.time.LocalDate;
import java.util.List;

public class QuestionEmployee extends Employee {

    public QuestionEmployee() {
        this.level = "QUESTION";
    }

    @Override
    protected void handleRequest(Request request) {
        System.out.println("Request resolved by a questionEmployee");
        LocalDate currentDate = LocalDate.now();
        Message message = new Message("Raspunsul la inrebarea " + request.getContent() + " despre telefonul " + request.getPhone(), request.getClient(), currentDate.toString());
        sendResponseToClient(message, request.getClient());
    }

    @Override
    protected void sendResponseToClient(Message message, Client client) {
        MessageDispacher.sendMessageToClient(message, client);
    }

    @Override
    public List<Employee> getSubordinates() {
        System.out.println("This employee has no subordinates");
        return null;
    }
}
