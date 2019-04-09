package request;

import client.Client;

public class Request {

    private String content;
    private Client client;
    // aici va fi phone
    private String phone;
    private RequestType requestType;

    public Request(String content, Client client, String phone, RequestType requestType) {
        this.content = content;
        this.client = client;
        this.phone = phone;
        this.requestType = requestType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "Request{" +
                "content='" + content + '\'' +
                ", client=" + client +
                ", phone='" + phone + '\'' +
                ", requestType=" + requestType +
                '}';
    }
}