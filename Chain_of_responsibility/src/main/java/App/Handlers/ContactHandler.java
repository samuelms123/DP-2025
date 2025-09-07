package App.Handlers;

import App.Message;
import App.MessageType;

public class ContactHandler extends Handler {

    public void process(Message message) {
        if (message.getType() == MessageType.CONTACT) {
            System.out.println("Handling contacting request.");
        }
        else {
            System.out.println("Forwarding " + message.getType() + " message from contact request handler");
            super.process(message);
        }
    }
}
