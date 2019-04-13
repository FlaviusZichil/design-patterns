package message;

import client.Client;

public class MessageDispacher {
    public static void sendMessageToClient(Message message, Client client) {
        client.addMessage(message);
    }
}
