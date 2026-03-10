package main.java.datass;

public class Status {
    private final int status;
    private final String statusText;

    public Status(int status, String statusText) {
        this.status = status;
        this.statusText = statusText;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusText() {
        return statusText;
    }

    @Override
    public String toString() {
        return status + " " + statusText;
    }
}
