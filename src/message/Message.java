package message;

import client.Client;

public class Message {
    private String content;
    private Client client;
    private String date;

    public Message(String content, Client client, String date) {
        this.content = content;
        this.client = client;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", client=" + client +
                ", date='" + date + '\'' +
                '}';
    }
}
