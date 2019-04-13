package client;

import message.Message;
import phone.Phone;
import request.Request;
import request.RequestType;
import request.RequestsQueue;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private List<Message> messages = new ArrayList<>();

    public Client(String firstName, String secondName, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
    }

    public void sendRequest(String content, Phone phone, RequestType typeOfRequest){
        List<Request> requests = RequestsQueue.getRequests();
        Request request;

        if(requests.size() > 0){
            Request lastAddedRequest = requests.get(requests.size() - 1);
            Integer nextRequsetId = lastAddedRequest.getRequestId() + 1;
            request = new Request(nextRequsetId, content, this, phone, typeOfRequest);
        }
        else{
            request = new Request(0, content, this, phone, typeOfRequest);
        }

        RequestsQueue.addNewRequest(request);
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
