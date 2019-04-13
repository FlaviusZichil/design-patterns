
package client;

import message.Message;
import request.Request;
import request.RequestType;
import request.RequestsQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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

    public void sendRequest(String content, String phone, RequestType typeOfRequest) {
        Request request = new Request(content, this, phone, typeOfRequest);
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
