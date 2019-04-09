package message;

import client.Client;

public class Message {
    private String content;
    private Client client;

    public Message(String content, Client client) {
        this.content = content;
        this.client = client;
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

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", client=" + client +
                '}';
    }
}
