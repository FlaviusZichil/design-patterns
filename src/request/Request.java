package request;

import client.Client;
import phone.Phone;

public class Request {

    private Integer requestId;
    private String content;
    private Client client;
    private Phone phone;
    private RequestType requestType;

    public Request(Integer id, String content, Client client, Phone phone, RequestType requestType) {
        this.requestId = id;
        this.content = content;
        this.client = client;
        this.phone = phone;
        this.requestType = requestType;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
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