package bean;

import javax.faces.event.ActionEvent;
import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

public class ChatBean  {

    private String nick;
    private String message;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void send(ActionEvent actionEvent) {
        PushContext pushContext = PushContextFactory.getDefault().getPushContext();
        String broadCast = this.nick + ": " + this.message;
        pushContext.push("/chat", broadCast);
        this.message = "";
    }
}
