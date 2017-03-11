package pl.sda.beans;

import java.util.List;

/**
 * Created by trot on 11.03.17.
 */
public class Message {
    private String text;
    private List<String> logins;
    private int priority;

    public String getText() {
        return text;
    }

    public List<String> getLogins() {
        return logins;
    }

    public int getPriority() {
        return priority;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLogins(List<String> logins) {
        this.logins = logins;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
