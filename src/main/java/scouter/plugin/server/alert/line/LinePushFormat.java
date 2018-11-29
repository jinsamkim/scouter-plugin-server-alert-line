package scouter.plugin.server.alert.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Gun Lee (gunlee01@gmail.com) on 2016. 12. 20.
 */
public class LinePushFormat {
    private List<String> to;
    private List<StringMessage> messages = new ArrayList<StringMessage>();

    public List<String> getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = new ArrayList<String>();
        this.to.addAll(Arrays.asList(to.split(",")));
    }

    public List<StringMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<StringMessage> messages) {
        this.messages = messages;
    }

    public void addMessage(StringMessage message) {
        messages.add(message);
    }
}
