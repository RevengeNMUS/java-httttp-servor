package main.java.datass;

public class Status {
    public static Status OK = new Status(200, "OK");
    public static Status MOVED_PERMANENTLY = new Status(301, "Moved Permanently");
    public static Status BAD_REQUEST = new Status(400, "Bad Request");
    public static Status UNAUTHORIZED = new Status(401, "Unauthorized");
    public static Status FORBIDDEN = new Status(403, "Forbidden");
    public static Status NOT_FOUND = new Status(404, "Not Found");
    public static Status TEAPOT = new Status(418, "I'm a teapot");
    public static Status INTERNAL_ERROR = new Status(500, "Internal Server Error");

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
