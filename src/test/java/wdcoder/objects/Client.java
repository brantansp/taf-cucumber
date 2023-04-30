package wdcoder.objects;

public class Client {

    private String clientId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Client(String clientId) {
        this.clientId = clientId;
    }
}