public class Message {
    private String text;
    private String recipient;
    private int id;


    public Message(String text, String recipient, int id) {
        this.text=text;
        this.recipient=recipient;
        this.id=id;
    }

    public void getDetails() {
        System.out.println("Contact Name : " + recipient +
                "\nMessage : " + text +
                "\nId : " + id);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }
}
